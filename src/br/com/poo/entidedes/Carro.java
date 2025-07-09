public class Carro {
    String modelo;
    String cor;
    String placa;
    String tipo;
    String marca;
    Boolean ligado = false;

    public void ligar(){
        System.out.println("Ligando");
        ligado = true;
    }
    public void desligar(){
        System.out.println("Desligando");
        ligado = false;
    }
}
