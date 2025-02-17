package com.example.desconto;

public class DescontoProgressivo implements DescontoStrategy {
    @Override
    public double calcular(double valorCompra, boolean aniversario) {
        double desconto = Math.min(valorCompra / 25, valorCompra * 0.20);
        return valorCompra - desconto;
    }
}
