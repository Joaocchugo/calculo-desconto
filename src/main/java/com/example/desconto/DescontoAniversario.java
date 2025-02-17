package com.example.desconto;

public class DescontoAniversario implements DescontoStrategy {
    @Override
    public double calcular(double valorCompra, boolean aniversario) {
        return aniversario ? valorCompra * 0.85 : valorCompra;
    }
}