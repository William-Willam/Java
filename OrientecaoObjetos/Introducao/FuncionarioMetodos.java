package OrientecaoObjetos.Introducao;

public class FuncionarioMetodos {
    
    // atributos
    private String nome;
    private double salario;

    // construtores
    public FuncionarioMetodos(String nomeInit, double salarioInit){
        nome = nomeInit;
        salario = salarioInit;
    }

    // metodos
    public String obterInfo(){
        return "Nome: " + nome + ", Salario: " + salario;
    }

    // metodos com passagens de valores
    public void aumentarSalario(double aumento){
        salario += aumento;
    }

    // metodos com passagens por referencia
    public void alterarSalario(FuncionarioMetodos func, double novoSalario){
        func.salario = novoSalario;
    }

    // sobrecargas de metodos
    public void aumentarSalario(int porcetagem){
        salario += salario * porcetagem /100.0;
    }

    // metodos static

    // classe "Principal"

    public static void main(String[] args) {
        FuncionarioMetodos func1 = new FuncionarioMetodos("Josnei", 1600);
        System.out.println(func1.obterInfo());

        func1.alterarSalario(func1, 2310.00);

        func1.aumentarSalario(800.33);
        func1.aumentarSalario(2);
        System.out.println(func1.obterInfo());
        
    }
}
