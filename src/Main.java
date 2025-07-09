import br.com.poo.entidedes.Pessoa;

import java.time.LocalDate;

public class Main {

    public static void main (String[] args) {

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