package com.example.desconto;

public class Main {
    public static void main(String[] args) {
        double valorCompra = 500.00;
        boolean aniversario = true; // Simula um cliente fazendo aniversário

        System.out.println("Teste com diferentes tipos de desconto:\n");

        DescontoStrategy desconto1 = new DescontoPercentual(10);
        Venda venda1 = new Venda(desconto1);
        System.out.println("Desconto Percentual (10%): R$ " + venda1.aplicarDesconto(valorCompra, aniversario));

        DescontoStrategy desconto2 = new DescontoProgressivo();
        Venda venda2 = new Venda(desconto2);
        System.out.println("Desconto Progressivo: R$ " + venda2.aplicarDesconto(valorCompra, aniversario));

        DescontoStrategy desconto3 = new DescontoAniversario();
        Venda venda3 = new Venda(desconto3);
        System.out.println("Desconto de Aniversário: R$ " + venda3.aplicarDesconto(valorCompra, aniversario));

        DescontoStrategy desconto4 = (valor, aniversarioFlag) -> valor;
        Venda venda4 = new Venda(desconto4);
        System.out.println("Sem Desconto: R$ " + venda4.aplicarDesconto(valorCompra, aniversario));
    }
}
