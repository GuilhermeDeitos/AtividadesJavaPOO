import javax.swing.JOptionPane;

public class UsaAnimal{
    public static void main(String args[]) {
        Animal animal = null;

        int op = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número de 1 a 3 para selecionar o som do animal\n[1] Cavalo\n[2] Preguiça\n[3]Cachorro"));

        switch(op){
            case 1:
                animal = new Cavalo();
                break;
            case 2:
                animal = new Preguica();
                break;
            case 3:
                animal = new Cachorro();
                break;
            default: {
                System.out.println("Valor inválido");
                System.exit(0);
            }

        }
        animal.emitirSom();
    }
}