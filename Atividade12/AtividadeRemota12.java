import java.util.Random;
public class AtividadeRemota12 {
  
  public static void main(String args[]){
    int[] arrA = new int[10];
    int[] arrB = new int[10];
    Random gerador = new Random();
    int numPesquisar = gerador.nextInt(10);
    int n = 10;
    int[] vet = MeusArrays.gerarVetorRandom(n);
    for(int i = 0; i < arrA.length && i < arrB.length;i++){
      arrA[i] = gerador.nextInt(10);
      arrB[i] = gerador.nextInt(10);
    }

    System.out.println(MeusArrays.pesquisarArray(arrA,arrB,numPesquisar));
    
    for(int i = 0; i < n;i++){
      System.out.println(vet[i]);
    }
  }


}
