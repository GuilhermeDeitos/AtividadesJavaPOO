public class Brinquedo{
    private String nome;
    private String faixaEtaria;
    private float preco;

    

    public void brinquedo(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setFaixaEtaria(String faixaEtaria){
        if(faixaEtaria == "0 a 2" || faixaEtaria == "3 a 5" || faixaEtaria == "6 a 10" || faixaEtaria == "acima de 10"){
            this.faixaEtaria = faixaEtaria;
        } else{
            this.faixaEtaria = "Faixa Etaria inválida";
        }
    }

    public void mostrar(){
        System.out.println("Nome do brinquedo: "+nome+"\nValor do brinquedo: "+preco+"\n Faixa etaria do brinquedo: "+faixaEtaria);
    }

}