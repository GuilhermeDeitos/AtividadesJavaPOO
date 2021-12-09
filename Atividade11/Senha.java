import java.util.Random;

public class Senha{

  public static int[] gerar(){
    int[] password = new int[8];
    Random gerador = new Random();
    for(int i = 0; i <= 7; i++){
      password[i] = gerador.nextInt(10);

    }
    return password;
  }

}