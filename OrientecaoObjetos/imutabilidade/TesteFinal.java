package OrientecaoObjetos.imutabilidade;

public class TesteFinal {
    public static void main(String[] args) {
        ExemploFinal testeFinal = new ExemploFinal();
        
        // Local
        int testeFinalLocal = 777;
        System.out.println("Valor da variavel local: " +testeFinalLocal);

       // testeFinal.CODIGO_FICO = 555; -> erro

        System.out.println("Valor da Constante: "+ testeFinal.CODIGO_FICO);
        testeFinal.meuMetodo();
    }
}
