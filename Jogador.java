abstract class Jogador {
    protected String nome;
    protected int habilidade; // de 0 a 100
    protected int gols;

    public Jogador(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.gols = 0;
    }

    public abstract int getHabilidade();

    public void somaGol() {
        this.gols++;
    }

    public int getGols() {
        return this.gols;
    }

    public String getNome() {
        return this.nome;
    }
}
