package OrientecaoObjetos.imutabilidade;

// uma classe final não pode ser herdada
public class ExemploFinal {
    // definicçao de constante - uso final
    final int CODIGO_FICO = 10;

    // metodo final - não pode ser sobrescrito
    final void meuMetodo(){
        System.out.println("Palmeiras não tem mundial!");
    }
}
