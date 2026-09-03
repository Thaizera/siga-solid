package siga;

public class DescontoFuncionario implements Desconto {
    @Override
    public double aplicar(double valorBase) {
        return valorBase * 0.70; // 30% de desconto
    }
}