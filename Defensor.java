class Defensor extends Jogador {
    private int cobertura;
    private int desarme;

    public Defensor(String nome, int habilidade, int cobertura, int desarme) {
        super(nome, habilidade);
        this.cobertura = cobertura;
        this.desarme = desarme;
    }

    @Override
    public int getHabilidade() {
        return (int) (((habilidade * 5) + (cobertura * 3) + (desarme * 2)) / 10);
    }
}
