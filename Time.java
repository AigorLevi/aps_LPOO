class Time {
    private String nome;
    private Jogador[] jogadores;
    private int numJogadores;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new Jogador[5]; // máximo de 5 jogadores
        this.numJogadores = 0;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public void addJogador(Jogador jogador) {
        if (numJogadores < 5) {
            jogadores[numJogadores++] = jogador;
        }
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public String getResultados() {
        return "Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas;
    }

    public String getNome() {
        return nome;
    }
}
