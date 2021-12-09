

public class UsaAnimal{
    public static void main(String args[]) {
        classeCachorro();
        classeCavalo();
        classePreguica();

    }

    public static void classeCachorro(){
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Romeu");
        cachorro.setIdade(15);
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        cachorro.emitirSom();
        cachorro.correr();
    }

    public static void classeCavalo(){
        Cavalo cavalo = new Cavalo();
        cavalo.setNome("Trovão");
        cavalo.setIdade(5);
        System.out.println(cavalo.getNome());
        System.out.println(cavalo.getIdade());
        cavalo.emitirSom();
        cavalo.correr();
    }

    public static void classePreguica(){
        Preguica preguica = new Preguica();
        preguica.setNome("Trovão");
        preguica.setIdade(5);
        System.out.println(preguica.getNome());
        System.out.println(preguica.getIdade());
        preguica.emitirSom();
        preguica.subirEmArvores();
    }
}