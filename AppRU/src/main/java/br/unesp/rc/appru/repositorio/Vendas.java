/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.repositorio;

import java.util.List;
import br.unesp.rc.appru.modelo.Venda;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author aluno
 */
public class Vendas {

    private List<Venda> listaNPerm = new LinkedList<>();
    private List<Venda> listaPerm = new LinkedList<>();

    public Vendas() {
    }

    public void inserir(Venda v, int tipo) {
        if (tipo == 0) {
            listaNPerm.add(v);
        } else {
            listaPerm.add(v);
        }
    }

    public void remover(int id) {
        Venda removido = null;
        for (Venda e : listaPerm) {
                        System.out.println(e);

            if (e.getIdVenda() == id) {
                removido = e;
                listaPerm.remove(e);
                break;
            }
        }
        for (Venda e : listaNPerm) {
            System.out.println(e);
            if (e.getIdVenda() == id) {
                removido = e;
                listaNPerm.remove(e);
                break;
            }
        }
        if (removido == null) {
            System.out.println("Item nao encontrado no momento");
        }

    }

    public List<Venda> pesquisaData(int tipo, Date data) {
        List<Venda> lista;
        if (tipo == 0) {
            lista = new LinkedList<>(this.listaNPerm);
        } else {
            lista = new LinkedList<>(this.listaPerm);
        }
        //terminar
        lista.removeIf(c
                -> data != c.getData()
        );
        
        return lista;
    }

    public List<Venda> pesquisaVendedor(int tipo, String nRU) {
        List<Venda> lista;
        if (tipo == 0) {
            lista = new LinkedList<>(this.listaNPerm);
        } else {
            lista = new LinkedList<>(this.listaPerm);
        }
        lista.removeIf(c -> c.getVendedor().getnRU().equals(nRU) != true);
        return lista;
    }

    @Override
    public String toString() {
        return "Vendas{" + "listaNPerm=" + listaNPerm + ", listaPerm=" + listaPerm + '}';
    }

}
