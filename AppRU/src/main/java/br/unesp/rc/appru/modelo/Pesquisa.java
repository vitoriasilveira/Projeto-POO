/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import utils.DataUtils;

/**
 *
 * @author aluno
 */
public class Pesquisa {
   //fazer repository com as pesqusias feitas Pesquisas
    private Date data;
    private int tipo;
    private List<Venda> venda;

    public Pesquisa() {
    }

    public Pesquisa(int tipo,List<Venda> venda) {
        Date data = new Date();
        this.data = data;
        this.tipo = tipo;
        this.venda = venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public List<Venda> getnRu() {
        return venda;
    }

    public void setnRu(List<Venda> venda) {
        this.venda = venda;
    }

    @Override
    public String toString() {
        return "Pesquisa{" + "data=" + DataUtils.dataFormat(data) + ", tipo=" + tipo + ", Venda=" + venda + '}';
    }
    
}
