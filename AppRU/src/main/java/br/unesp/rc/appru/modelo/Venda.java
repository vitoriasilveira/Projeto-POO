/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.modelo;

import java.text.DateFormat;
import java.util.Date;
import utils.DataUtils;

/**
 *
 * @author aluno
 */
public class Venda {
    private String ruVendedor, ruComprador;
    
    private static int id = 0;
    private Date data;
    private int  idVenda;
    //private StringFormat data;

    public Venda() {
    }

    public Venda(String ruVendedor, Date data) {
        this.ruVendedor = ruVendedor;
        this.data = data;
        this.idVenda = id;
        gerarId();
    }
    
    public void gerarId(){
        id++;
    }

    public String getRuComprador() {
        return ruComprador;
    }

    public void setRuComprador(String ruComprador) {
        this.ruComprador = ruComprador;
        // mandar email
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Venda.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
    
    
    public String getRuVendedor() {
        return ruVendedor;
    }

    public void setRuVendedor(String ruVendedor) {
        this.ruVendedor = ruVendedor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Venda{" + "ruVendedor=" + ruVendedor + ", ruComprador=" + ruComprador + ", data=" + data + ", idVenda=" + idVenda + '}';
    }    
    
    
    
}
