import java.util.concurrent.TimeUnit;

public class BombaDagua {
  public boolean status;

  public void ligar(){
    status = true;
  }
  public void desligar(){
    status = false;
  }
  public void mostrar(){
    if(status){
      System.out.println("A bomba está ligada");
    } else if(status == false){
      System.out.println("A bomba está desligada");
    } else{
      System.out.println("Pane no sistema, alguém me desconfigurou 😮😮😮");
    }
    
  }
  public void mostrarTempo(int tempo){
    for(int i = tempo; i >= 0; i--){
      try {
        TimeUnit.SECONDS.sleep(1);
        System.out.println(i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
     
    }
   
  }
}
