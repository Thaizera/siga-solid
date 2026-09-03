package siga;

public class RelatorioRepositorio {

    // Cuida apenas do salvamento do texto do relatório no disco/sistema
    public void salvar(String conteudo) {
        System.out.println("Salvando relatório em arquivo...");
        System.out.println(conteudo);
    }
}