package Aulas_Controle_de_fluxo.Repetições;

public class ControleLoopParateB {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
