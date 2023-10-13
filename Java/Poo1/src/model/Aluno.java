package model;

public class Aluno {
    // tem - atributos
    public String nome;
    public int idade;
    public double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    // faz - comportamento - metodo - funcao de alguem
    public void fazerAniversario( ) {
        idade++;
    }

    public void dizerOi() {
        System.out.println("oi, eu sou: " + nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota=" + nota +
                '}';
    }
}