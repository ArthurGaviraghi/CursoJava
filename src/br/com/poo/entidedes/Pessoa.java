import java.time.LocalDate;

public class Pessoa {

    String nome;
    String sobrenome;
    String cpf;
    String rg;
    LocalDate dataNascimento;
    String[] telefones = new String[10];

    public void inprimirValores(){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome:" + sobrenome);
        System.out.println("CPF:" + cpf);
        System.out.println("RG:" + rg);
        System.out.println("Data de nascimento: " + dataNascimento);

        for (String telefone : telefones) {
            if( telefone != null){
                System.out.println("Telefone" + telefone);
            }

        }

    }

    public int somar (int primeiroN, int segundoN) {
        return primeiroN + segundoN;

    }

    public Carro criarCar(String cor){
        Carro  carro = new
    }
}

