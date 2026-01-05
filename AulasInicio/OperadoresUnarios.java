public class OperadoresUnarios {
    public static void main(String[] args) {
        // variáveis
        int a = 10;
        int b = 0;

        // processamento 1 (pós-incremento e pós-decremento)
        System.out.println("======= Parte 1 =======");
        // a = a + 1;
        // a = a - 1;

        a++;
        a--;

        // processamento 2 (pré-incremento e pré-decremento)
        System.out.println("======= Parte 2 =======");
        b = ++a;

        // saída
        System.out.println("valor de a: " + a);
        System.out.println("valor de b: " + b);

    }
}
