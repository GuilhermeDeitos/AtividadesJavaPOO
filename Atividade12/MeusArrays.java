import java.util.Random;
public class MeusArrays {

  public static int pesquisarArray(int[] arrA,int[] arrB,int valorPesquisa){
    int numInArray = 0;
    for(int i = 0; i < arrA.length;i++){
        if(arrA[i] == valorPesquisa){
          numInArray += 1;
          break;
        }
    }
    for(int j = 0; j < arrB.length;j++){
      if(arrB[j] == valorPesquisa){
        numInArray += 1;
        break;
      }
  }

  return numInArray;


  }

  public static int[] gerarVetorRandom(int n){
    Random gerador = new Random();
    int[] vetA = new int[n];
    for(int i = 0; i < n;i++){
      vetA[i] = gerador.nextInt(1000);
    }
    return vetA;
  }

}
