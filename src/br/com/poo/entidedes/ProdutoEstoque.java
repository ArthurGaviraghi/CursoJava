package br.com.poo.entidedes;

public class ProdutoEstoque {

    String nome;
    int estoque;

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return  estoque;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

   public void adicionarEstoque ( int estoque){
        this.estoque += estoque;
        System.out.println("Estoque atualizado: " + estoque);
   }

   public void retirarEstoque(int estoque) throws Exception {
       if(estoque <= 0 || estoque > this.estoque){
           System.out.println("Estoque esta zerado, não é possivel continuar");

       }else{
           verificarEstoqueMinimo();
           this.estoque -= estoque;
           System.out.println("qtd removida do estoque" );
       }



   }

   private void verificarEstoqueMinimo()  {
        if(estoque < 5){
            System.out.println("Estoque abaixo de 5 itens");
        }

   }
}
