package OrientecaoObjetos.ClasseAbstratas;

class TesteAbstract {

    public static void main(String[] args) {
        // Instancias
        CarroF1 redbull = new CarroF1();
        Caminhao scania =  new Caminhao();

        redbull.acelerar();
        redbull.frear();

        System.out.println();
        
        scania.acelerar();
        scania.frear();

    }
    
}