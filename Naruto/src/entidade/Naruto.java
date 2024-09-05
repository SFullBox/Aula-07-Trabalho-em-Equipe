package entidade;

public class Naruto extends Ninja implements Treinamento {

    // Construtor
    public Naruto(String nome, int idade, String habilidade) {
        super(nome, idade, habilidade);
    }

    @Override
    public void treinar() {
        System.out.println(getNome() + " está treinando.");
    }
    
    public static void main(String[] args) {
        Naruto naruto = new Naruto("Ninja", 17, "Rasengan");
        naruto.treinar();
        naruto.usarJutsu();
        
        Hokage hokage = new Hokage("Ninja", 17, "Rasengan");
        hokage.protegerVila();
    }
}
