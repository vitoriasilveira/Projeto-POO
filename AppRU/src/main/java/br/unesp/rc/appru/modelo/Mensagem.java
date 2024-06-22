/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.appru.modelo;

/**
 *
 * @author vitoriasilveira
 */
public class Mensagem implements Runnable  {
    private final Venda venda;

    public Mensagem(Venda venda) {
        this.venda = venda;
    }
    

    @Override
    public void run() {
        System.out.println("FROM: noreplay@unesprc.br \nTO: " + venda.getComprador().getNome());
        System.out.println(" Olá, " + venda.getComprador().getNome() 
                + ". A compra do ticket do Restaurante Universitário de Rio Claro poderá ser realizada. Entre em contato com o vendedor(a) " + venda.getVendedor().getNome()
                + " para efetuar sua compra.");
        System.out.println("---------------------");
        System.out.println("DADOS de COMPRA e VENDA");
        System.out.println("    Vendedor(a): "+venda.getVendedor().getNome());
        System.out.println("    Telefone: "+venda.getVendedor().getTelefone());
        System.out.println("    Email: "+venda.getVendedor().getEmail());
        System.out.println("---------------------");  
    }
}

    