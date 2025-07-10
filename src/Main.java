import br.com.poo.entidedes.Animal;
import br.com.poo.entidedes.Pasciente;
import br.com.poo.entidedes.Pessoa;
import br.com.poo.entidedes.calculadora;

import java.time.LocalDate;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main (String[] args) {

        criarCalculadora();
        imc();

    }
public static void animal(){


        try {
            Animal animal = new Animal();
            animal.definirRaca("mec");
            animal.definirRaca("dog");
            animal.definirRaca("bulldog");
        }catch(Exception e){
            System.out.println("erro ao definir animal, tente novamente" + e.getMessage());
        }

}
    public static void criarCalculadora(){
        calculadora calcular = new calculadora();


        int soma = calcular.somar(3, 6);
        System.out.println(
                soma
        );



    }
    public static  void imc(){
        Pasciente pas = new Pasciente();
        pas.peso = 75;
        pas.altura = 1.90;


        System.out.println(pas.Imc(pas.peso, pas.altura));
    }
    public static void criarPessoa(){

        Pessoa arthur = new Pessoa();

        arthur.nome = "arthur";
        arthur.cpf = "123";
        arthur.rg ="29080389";
        arthur.dataNascimento = LocalDate.of(1990, 06, 1);
        arthur.telefones[0]="4899782791";
        arthur.telefones[1]="4899782791";



         arthur.inprimirValores();
    }
}
