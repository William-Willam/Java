/*
 * Tipos primitivos em Java:
 * 
 * // Inteiros:
 * byte -> 8 bits. Valores de -128 a 127. Usado quando há necessidade de
 * economia de memória.
 * short -> 16 bits. Valores de -32.768 a 32.767. Pouco usado, mas útil em
 * grandes arrays.
 * int -> 32 bits. Valores de -2.147.483.648 a 2.147.483.647. Tipo inteiro mais
 * comum.
 * long -> 64 bits. Valores muito grandes. Usado quando int não é suficiente.
 * 
 * // Ponto flutuante:
 * float -> 32 bits. Aproximadamente 7 casas decimais. Precisa do sufixo 'f'
 * (ex: 3.14f).
 * double -> 64 bits. Aproximadamente 15 casas decimais. Padrão para cálculos
 * com precisão.
 * 
 * // Booleano:
 * boolean -> 1 bit (internamente). Valores: true ou false. Usado para lógica e
 * controle de fluxo.
 * 
 * // Caractere:
 * char -> 16 bits. Armazena um único caractere Unicode. Exemplo: 'A', '9', '$',
 * etc.
 */



public class TipoPrimitivos {
    public static void main(String[] args) {
        byte idade = 29;
        short ano = 2025;
        int populacaoCidade = 500000;
        long populacaoMundial = 7800000000L;
        float altura = 1.75f;
        double salario = 4500.50;
        boolean estudante = true;
        char inicialNome = 'a';

        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);
        System.out.println("População da cidade: " + populacaoCidade);
        System.out.println("População mundial: " + populacaoMundial);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("É estudante? " + estudante);
        System.out.println("Incial do nome: " + inicialNome);

    }

}

