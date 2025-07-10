package br.com.poo.entidedes;

import java.time.LocalDate;

public class Pessoa {
    public boolean tipo;
    public  String nome;
    public  String sobrenome;
    public  String cpf;
    public  String rg;
    public  LocalDate dataNascimento;
    public  String[] telefones = new String[10];

//    public void trocarTipoPessoa(TipoPessoa tipo){
//
//        this.tipo = (this.tipo == TipoPessoa.FISICA? TipoPessoa.JURIDICA : TipoPessoa.FISICA);
//
////        if(tipo == TipoPessoa.FISICA){
////            this.tipo = TipoPessoa.JURIDICA;
////        }else if(tipo == TipoPessoa.JURIDICA){
////            this.tipo = TipoPessoa.FISICA;
////        }
//*/
//    }

    public void inprimirValores(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome:" + sobrenome);
        System.out.println("CPF:" + cpf);
        System.out.println("RG:" + rg);
        System.out.println("Data de nascimento: " + dataNascimento);
System.out.println("Cor de carro" + criarCarro(""));
        for (String telefone : telefones) {
            if( telefone != null){
                System.out.println("Telefone" + telefone);
            }

        }

    }

    public Carro criarCarro(String cor){
        Carro  carro = new  Carro();
        carro.cor = cor;
        return carro;
    }
}

