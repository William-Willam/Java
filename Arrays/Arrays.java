package Arrays;

public class Arrays {
    public static void main(String[] args) {
        
        // declaração de arrays
        int [] meuArrays;

        // criação do arrays = convencional
        meuArrays = new int[3];
        meuArrays[0] = 5;
        meuArrays[1] = 6;
        meuArrays[2] = 7;

        // aplicação mais rapida
        meuArrays = new int[]{5,8,2};

        // saída do jeito trabalho
        System.out.println(meuArrays[0]+", "+meuArrays[1]+", "+meuArrays[2]);

        // saída do jeito pratico

        for(int i = 0; i< meuArrays.length; i++){
            System.out.println(meuArrays[i]);
        }
    }
}
