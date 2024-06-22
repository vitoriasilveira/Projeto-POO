/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.repositorio;

import br.unesp.rc.appru.modelo.Pesquisa;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import utils.DataUtils;

/**
 *
 * @author elisa
 */
public class Pesquisas {

    private List<Pesquisa> lista = new LinkedList<>();

    public Pesquisas() {
    }

    public List<Pesquisa> getLista() {
        return lista;
    }

    public void setLista(List<Pesquisa> lista) {
        this.lista = lista;
    }

    public void inserir(Pesquisa a) {
        lista.add(a);
    }

    public void exportarMensal() throws FileNotFoundException, IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet("Relatório Mensal");
        sheet.setColumnWidth(0, 2000);
        sheet.setColumnWidth(1, 5000);
        sheet.setColumnWidth(2, 4000);

        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        
        headerStyle.setFillBackgroundColor(IndexedColors.BLUE_GREY.getIndex());

        HSSFFont font = ((HSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 12);
        headerStyle.setFont(font);

        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("ID");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(1);
        headerCell.setCellValue("Tipo de refeição");
        headerCell.setCellStyle(headerStyle);

        headerCell = header.createCell(2);
        headerCell.setCellValue("Data");
        headerCell.setCellStyle(headerStyle);

        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        int rownum = 1, cellnum, count = 1, countPerm = 0;
        Row row;
        Cell cell;

        for (Pesquisa p : lista) {
            row = sheet.createRow(rownum++);
            cellnum = 0;
            cell = row.createCell(cellnum++);
            cell.setCellValue(count++);
            cell.setCellStyle(style);

            cell = row.createCell(cellnum++);
            if (p.getTipo() == 0) {
                countPerm++;
            }
            cell.setCellValue(p.getTipo() == 0 ? "Não Permanência" : "Permanência");
            cell.setCellStyle(style);

            cell = row.createCell(cellnum++);
            cell.setCellValue(DataUtils.dataFormat(p.getData()));
            cell.setCellStyle(style);

        }

        row = sheet.createRow(rownum++);
        cellnum = 0;
        headerStyle.getBorderTop();
        cell = row.createCell(cellnum++);
        cell.setCellValue("TOTAL");
        cell.setCellStyle(headerStyle);
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(countPerm + " NP");
        cell.setCellStyle(headerStyle);
        
        cell = row.createCell(cellnum++);
        cell.setCellValue(count - 1 - countPerm + " P");
        cell.setCellStyle(headerStyle);
        
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "relatorio.xls";

        FileOutputStream outputStream = new FileOutputStream(fileLocation);
        workbook.write(outputStream);
        outputStream.close();

    }

    @Override
    public String toString() {
        return "Pesquisa" + "lista=" + lista + '}';
    }
}
