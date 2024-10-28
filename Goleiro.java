class Goleiro extends Jogador {
    private double altura;
    private int reflexos;

    public Goleiro(String nome, int habilidade, double altura, int reflexos) {
        super(nome, habilidade);
        this.altura = altura;
        this.reflexos = reflexos;
    }

    @Override
    public int getHabilidade() {
        return (int) (((habilidade * 5) + ((int) (altura * 100) * 2) + (reflexos * 3)) / 10);
    }
}
