package br.com.poo.entidedes;

public class Animal {
    public String raca;


    public Animal(){
        if(raca==null || raca.length()<=3) {
            throw new RuntimeException("erro ao definir raça");
        }
        this.raca = raca;
    }

    public void definirRaca( String raca ){
        this.raca = raca;
    }

    public  String obterNomeDeRaca(){
        return this.raca;
    }

}
