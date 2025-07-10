package br.com.poo.entidedes;

public class Pasciente {
    public double peso;
    public double altura;

    public double Imc (double peso, double altura){

        return (peso / (altura * altura));
    }
}
