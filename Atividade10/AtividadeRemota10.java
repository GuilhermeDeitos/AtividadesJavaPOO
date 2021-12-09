import java.util.Scanner;
public class AtividadeRemota10 {

  public static void main(String args[]){
  try {
    int inicio,fim,pausa;
    Scanner input = new Scanner(System.in);

    System.out.println("Em qual numero deseja encerrar a contagem?");
    fim = input.nextInt();

    System.out.println("Em qual numero deseja Iniciar a contagem?");
    inicio = input.nextInt();

    System.out.println("Dseja colocar uma pausa entre os valores de quantos seundos?");
    pausa = input.nextInt();

    System.out.println("Numeros de 1 - 10:");
    Contagem.contar();

    System.out.println("Numeros de 1 - "+fim+" :");
    Contagem.contar(fim);

    System.out.println("Numeros de "+inicio+" - "+fim+" :");
    Contagem.contar(inicio,fim);

    System.out.println("Numeros de "+inicio+" - "+fim+" com uma pausa de  "+pausa+" segundos entre cada valor:");
    Contagem.contar(inicio,fim,pausa);

    }catch (NumberFormatException e) {
      System.out.println("Apenas numeros, erro:"+e);
    } 
  }
}