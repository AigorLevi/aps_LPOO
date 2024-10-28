public class Main {
    public static void main(String[] args) {
        Time time1 = new Time("Time A");
        Time time2 = new Time("Time B");

        Goleiro goleiro1 = new Goleiro("Goleiro A", 80, 1.85, 90);
        Defensor defensor1 = new Defensor("Defensor A1", 70, 80, 75);
        Defensor defensor2 = new Defensor("Defensor A2", 75, 85, 80);
        Atacante atacante1 = new Atacante("Atacante A1", 85, 90, 88);
        Atacante atacante2 = new Atacante("Atacante A2", 90, 95, 92);

        time1.addJogador(goleiro1);
        time1.addJogador(defensor1);
        time1.addJogador(defensor2);
        time1.addJogador(atacante1);
        time1.addJogador(atacante2);

        Goleiro goleiro2 = new Goleiro("Goleiro B", 78, 1.80, 88);
        Defensor defensor3 = new Defensor("Defensor B1", 72, 78, 70);
        Defensor defensor4 = new Defensor("Defensor B2", 74, 76, 73);
        Atacante atacante3 = new Atacante("Atacante B1", 82, 88, 85);
        Atacante atacante4 = new Atacante("Atacante B2", 86, 91, 89);

        time2.addJogador(goleiro2);
        time2.addJogador(defensor3);
        time2.addJogador(defensor4);
        time2.addJogador(atacante3);
        time2.addJogador(atacante4);

        Partida partida = new Partida("2023-10-27", time1, time2);
        partida.golCasa();
        partida.golVisitante();
        partida.golCasa();

        System.out.println(partida.getPlacar());
        System.out.println(time1.getResultados());
        System.out.println(time2.getResultados());
    }
}
