/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.unesp.rc.appru;

import br.unesp.rc.appru.modelo.Aluno;
import br.unesp.rc.appru.modelo.Mensagem;
import br.unesp.rc.appru.modelo.Pesquisa;
import br.unesp.rc.appru.modelo.Venda;
import br.unesp.rc.appru.repositorio.Alunos;
import br.unesp.rc.appru.repositorio.Pesquisas;
import br.unesp.rc.appru.repositorio.Vendas;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author aluno
 */
public class AppRU {

    public static void main(String[] args) throws IOException, ParseException {

        Aluno aluno = new Aluno("Rebeca", "rebeca@dgdfg", "99873687", 0, "8247382");
        Alunos lista = new Alunos();
        lista.inserir(aluno);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 

        Vendas listaVendas = new Vendas();

//        Venda venda1 = new Venda(aluno.getnRU(),formato.parse("26/12/2004"));
//        listaVendas.inserir(venda1, aluno.getTipo());
//        Venda venda2 = new Venda(aluno.getnRU(), formato.parse("12/04/2005"));
//        listaVendas.inserir(venda2, aluno.getTipo());

        Aluno aluno2 = new Aluno("ELisa", "elisa@dgdfg", "4545345", 0, "34545345");
        lista.inserir(aluno2);
        
       Venda venda1 = new Venda(aluno, aluno2, formato.parse("26/12/2004"));
//       Mensagem msg = new Mensagem(venda1);
        
        // Create a new thread to send the email
        Thread msgThread = new Thread(new Mensagem(venda1));
        msgThread.start();
        
//        List<Venda> listaPesquisa = listaVendas.pesquisaVendedor(aluno2.getTipo(), "8247382");
//        
//        Pesquisas pesquisas = new Pesquisas();
//        Pesquisa pesquisa1 = new Pesquisa(aluno2.getTipo(), listaPesquisa );
//        pesquisas.inserir(pesquisa1);
//
//        listaPesquisa = listaVendas.pesquisaData(aluno2.getTipo(), formato.parse("22/06/2024"));
//        pesquisa1 = new Pesquisa(aluno2.getTipo(), listaPesquisa );
//        pesquisas.inserir(pesquisa1);
//
//        
//        pesquisas.exportarMensal();

//        List<Venda> listaPesquisa = listaVendas.pesquisaData(aluno2.getTipo(),new Date("12-23-2004"));
       // insere no reposo pesquisas
//        System.out.println(listaPesquisa);
        
        
//        venda1.setRuComprador(aluno2.getnRU());
//
//        listaVendas.remover(venda1.getIdVenda());
        
    }
}
