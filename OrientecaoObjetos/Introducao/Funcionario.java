package OrientecaoObjetos.Introducao;

public class Funcionario {
   
    String nome;
    String cargo;
    int idade;


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 =  new Funcionario();

        funcionario.nome = "João";
        funcionario.cargo = "Desenvolvedor JR";
        funcionario.idade = 29;

        funcionario1.nome = "Maria";
        funcionario1.cargo = "Recursos Humanos";
        funcionario1.idade = 25;

        System.out.println("Nome:  "+ funcionario.nome);
        System.out.println("Cargo: "+ funcionario.cargo);
        System.out.println("Idade: "+ funcionario.idade);
        
        System.out.println("");

        System.out.println("Nome:  "+ funcionario1.nome);
        System.out.println("Cargo: "+ funcionario1.cargo);
        System.out.println("Idade: "+ funcionario1.idade);

    }

}
