/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.repositorio;

import br.unesp.rc.appru.modelo.Aluno;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Alunos {

    private List<Aluno> lista = new LinkedList<>();

    public Alunos() {
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(List<Aluno> lista) {
        this.lista = lista;
    }

    public void inserir(Aluno a) {
        lista.add(a);
    }

    public boolean login(String nRU) {
        for (Aluno e : lista) {
            if (nRU == e.getnRU()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alunos{" + "lista=" + lista + '}';
    }
}
