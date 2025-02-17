package com.example.desconto;

public class Venda {
    private DescontoStrategy descontoStrategy;

    public Venda(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double aplicarDesconto(double valorCompra, boolean aniversario) {
        return descontoStrategy.calcular(valorCompra, aniversario);
    }
}
