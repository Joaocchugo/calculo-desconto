package com.example.desconto;

public class DescontoPercentual implements DescontoStrategy {
    private final double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcular(double valorCompra, boolean aniversario) {
        return valorCompra * (1 - percentual / 100);
    }
}