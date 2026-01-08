package OrientecaoObjetos.ClasseAbstratas;

public class CarroF1 extends Carro {
    void acelerar() {
        System.out.println("Carro de Formula 1  está acelerando muito rapidamente...");
    }

    @Override
    void frear() {
        System.out.println("O carro de Fórmula 1 está freando!!");
    }
}
