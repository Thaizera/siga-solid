package siga;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== TESTANDO SISTEMA SIGA (REFATORADO COM SOLID) ===\n");

        // Criando o aluno de teste
        Aluno aluno = new Aluno("Thais", "2026001", "thais@fatec.sp.gov.br", 9.5, true);

        // 1. Teste da separação de responsabilidades (SRP)
        System.out.println("--- 1. Relatório do Aluno (SRP) ---");
        RelatorioFormatador formatador = new RelatorioFormatador();
        RelatorioRepositorio repoRelatorio = new RelatorioRepositorio();
        ServicoEmail servicoEmail = new ServicoEmail();

        String relatorioTexto = formatador.formatar(aluno);
        repoRelatorio.salvar(relatorioTexto);
        servicoEmail.enviar(aluno.getEmail(), relatorioTexto);

        // 2. Teste de Desconto por Polimorfismo (OCP) e Repositório por Abstração (DIP)
        System.out.println("\n--- 2. Matrícula, Desconto e Persistência (OCP & DIP) ---");
        Desconto desconto = new DescontoBolsista(); // Testando com desconto de bolsista
        MatriculaRepositorio banco = new GravadorMySQL(); // Dependendo da abstração

        Matricula matricula = new Matricula(aluno, 1000.0, desconto, banco);

        System.out.println("Valor base da mensalidade: R$ " + matricula.getValorBase());
        System.out.println("Valor com desconto aplicado: R$ " + matricula.calcularMensalidade());
        
        // Grava no banco sem que a Matrícula precise conhecer o MySQL diretamente
        matricula.gravar();
    }
}