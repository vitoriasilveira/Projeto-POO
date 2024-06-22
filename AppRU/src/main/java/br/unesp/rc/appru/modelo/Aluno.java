/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.modelo;

/**
 *
 * @author aluno
 */
public class Aluno {

    private String nome, email, telefone, nRU;
    private int tipo;

    public Aluno() {
    }

    public Aluno(String nome, String email, String telefone, int tipo, String nRU) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipo = tipo;
        this.nRU = nRU;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getnRU() {
        return nRU;
    }

    public void setnRU(String nRU) {
        this.nRU = nRU;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", emai=" + email + ", telefone=" + telefone + ", tipo=" + tipo + ", nRU=" + nRU + '}';
    }

}
