package Aulas_Controle_de_fluxo.Repetições;

public class ControleLoopParteA {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
