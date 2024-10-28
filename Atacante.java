class Atacante extends Jogador {
    private int velocidade;
    private int tecnica;

    public Atacante(String nome, int habilidade, int velocidade, int tecnica) {
        super(nome, habilidade);
        this.velocidade = velocidade;
        this.tecnica = tecnica;
    }

    @Override
    public int getHabilidade() {
        return (int) (((habilidade * 5) + (velocidade * 2) + (tecnica * 3)) / 10);
    }
}
