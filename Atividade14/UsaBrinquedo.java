import javax.swing.JOptionPane;

public class UsaBrinquedo{
    public static void main(String args[]){
        String nome;
        float preco;
        Brinquedo brinquedo1 = new Brinquedo();

        nome = JOptionPane.showInputDialog("Digite o nome do brinquedo");
        preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do brinquedo"));
        brinquedo1.brinquedo(nome,preco);
        brinquedo1.setFaixaEtaria("0 a 2");
        brinquedo1.mostrar();
    }
}