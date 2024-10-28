class Partida {
    private String data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;

    public Partida(String data, Time timeCasa, Time timeVisitante) {
        this.data = data;
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.placarCasa = 0;
        this.placarVisitante = 0;
    }

    public void golCasa() {
        placarCasa++;
    }

    public void golVisitante() {
        placarVisitante++;
    }

    public String getPlacar() {
        return timeCasa.getNome() + " " + placarCasa + " x " + placarVisitante + " " + timeVisitante.getNome();
    }
}
