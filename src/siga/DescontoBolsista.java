package siga;

public class DescontoBolsista implements Desconto {
    @Override
    public double aplicar(double valorBase) {
        return valorBase * 0.50; // 50% de desconto
    }
}