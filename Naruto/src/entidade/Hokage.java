package entidade;

public class Hokage extends Ninja {

    public Hokage(String nome, int idade, String habilidade) {
        super(nome, idade, habilidade);
    }

    public void protegerVila() {
        System.out.println(getNome() + " está protegendo a vila!");
    }
}