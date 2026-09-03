package siga;

public class Matricula {

    private Aluno aluno;
    private double valorBase;
    private Desconto desconto;
    private MatriculaRepositorio repositorio;

    // Construtor com Injeção de Dependência (DIP) e Estratégia de Desconto (OCP)
    public Matricula(Aluno aluno, double valorBase, Desconto desconto, MatriculaRepositorio repositorio) {
        this.aluno = aluno;
        this.valorBase = valorBase;
        this.desconto = desconto;
        this.repositorio = repositorio;
    }

    // Calcula sem nenhuma condicional (if/else), usando apenas polimorfismo
    public double calcularMensalidade() {
        return desconto.aplicar(valorBase);
    }

    // Grava usando a interface, sem conhecer a tecnologia concreta do banco
    public void gravar() {
        String dados = "Aluno: " + aluno.getNome() + " | Valor Final: R$ " + calcularMensalidade();
        repositorio.gravar(dados);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public double getValorBase() {
        return valorBase;
    }
}