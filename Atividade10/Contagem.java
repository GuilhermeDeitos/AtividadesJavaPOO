
import static java.lang.Thread.sleep;

import java.util.concurrent.TimeUnit;

public class Contagem{

  public static void contar(){
    for(int i = 0; i <= 10; i++){
      System.out.println(i);
    }
  }

  public static void contar(int fim){
    for(int i = 0; i <= fim; i++){
      System.out.println(i);
    }
  }

  public static void contar(int inicio, int fim){
    for(int i = inicio; i <= fim; i++){
      System.out.println(i);
    }
  }

  public static void contar(int inicio, int fim, long pausa){
    pausa *= 1000;
    while(inicio <= fim){
      System.out.println(inicio);
      inicio++;
      try {
        Thread.sleep(pausa);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      
    }
  }  


}