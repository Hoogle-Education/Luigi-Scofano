import model.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno joao = new Aluno("Joao da Silva", 20, 7);
        Aluno maria = new Aluno("Maria da Silva", 21, 7);

//        joao.nome = "Joao da Silva";
//        maria.nome = "Maria da Silva";
//
//        joao.idade = 20;
        joao.fazerAniversario();

//        maria.idade = 21;
        maria.dizerOi();

//        System.out.println("Nome: " + joao.nome);
//        System.out.println("Idade: " + joao.idade);
//        System.out.println("Nota: " + joao.nota);

        System.out.println(joao);
        System.out.println(maria);

//        Aluno[] turma = new Aluno[10];
//        turma[0] = new Aluno();
//        turma[0].nome = "Marcus da Silva";
//
//        System.out.println(turma[0].nome);
//        System.out.println(turma[0]);
    }
}