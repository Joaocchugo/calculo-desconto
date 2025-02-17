# 1. Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?

O Padrão Strategy é a melhor opção para este caso. Esse padrão permite definir uma família de algoritmos (diferentes formas de calcular o desconto),
encapsulá-los em classes separadas e torná-los intercambiáveis durante a execução. Isso permite que o usuário escolha o tipo de desconto a ser aplicado sem modificar a lógica principal do programa.

# 2. Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?

Sem utilizar o Padrão Strategy, poderíamos implementar os descontos utilizando estruturas condicionais (if-else ou switch-case) diretamente dentro da classe responsável pela venda.
Por exemplo, poderíamos ter um método que recebe o tipo de desconto e calcula o valor final da compra:

public class Venda {
    public double calcularDesconto(double valorCompra, String tipoDesconto, boolean aniversario) {
        double desconto = 0;

        if (tipoDesconto.equals("percentual")) {
            desconto = valorCompra * 0.10; // Exemplo: percentual fixo de 10%
        } else if (tipoDesconto.equals("progressivo")) {
            desconto = Math.min(valorCompra / 25, valorCompra * 0.20);
        } else if (tipoDesconto.equals("aniversario") && aniversario) {
            desconto = valorCompra * 0.15;
        }

        return valorCompra - desconto;
    }
}

# 3. Quais os problemas que tal implementação traria?

Embora funcione, essa abordagem viola princípios de boas práticas como SRP (Single Responsibility Principle) e OCP (Open/Closed Principle). Os principais problemas são:

- Código de difícil manutenção: Se novos tipos de desconto forem adicionados, será necessário modificar a classe Venda, tornando-a mais complexa.
- Baixa reutilização: O código de cálculo do desconto está acoplado à classe de venda, impedindo sua reutilização em outras partes do sistema.
- Dificuldade na extensão: Se quisermos adicionar um novo desconto, precisaríamos modificar a classe Venda, o que pode causar efeitos colaterais.

O Padrão Strategy resolveria esses problemas ao permitir que cada tipo de desconto seja implementado separadamente, mantendo o código mais modular e flexível.
