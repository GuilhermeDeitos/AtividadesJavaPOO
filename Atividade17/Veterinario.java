import javax.swing.JOptionPane;

public class Veterinario {
    public static void main(String[] args) {
        Animal animal = null;
        int op = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número de 1 a 3 para selecionar o animal a ser examinado\n[1] Galinha\n[2] Gato\n[3]Cachorro"));

        switch(op){
            case 1:
                animal = new Galinha();
                examinar(animal);
                break;
            case 2:
                examinar(new Gato());
                break;
            case 3:
                examinar(new Cachorro());
                break;
            default: {
                System.out.println("Valor inválido");
                System.exit(0);
            }

        }
    }
    public static void examinar(Animal animal) {
        animal.emitirSom();
    }
}
