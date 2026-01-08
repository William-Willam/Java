package OrientecaoObjetos.ClasseAbstratas;

public class Caminhao extends Carro {
    void acelerar(){
        System.out.println("O caminhão está acelerando lentamente...");
    }

    @Override
    void frear(){
        System.out.println("O Caminhão está freando!!");
    }
}
