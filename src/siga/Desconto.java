package siga;

// Interface para garantir que novos descontos possam ser criados sem alterar a classe Matricula
public interface Desconto {
    double aplicar(double valorBase);
}