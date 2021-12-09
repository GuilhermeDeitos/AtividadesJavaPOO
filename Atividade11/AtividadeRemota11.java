import java.util.Arrays;

/*
  Aluno: Guilherme Augusto Deitos Alves
  3° Info IFPR
*/

public class AtividadeRemota11 {

  public static void main(String args[]){
    int[] senha = Senha.gerar();
    String senhaString;
    senhaString = Arrays.toString(senha);
    System.out.println("A senha gerada foi: "+senhaString);
    

  }

}
