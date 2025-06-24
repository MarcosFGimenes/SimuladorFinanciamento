package modelo;

public class Financiamento {
    // Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //Método para calcular o pagamento mensal
    public double calcularPagamentoMensal() {
        return calcularTotalPagamento() / (prazoFinanciamento * 12);
    }

    public double calcularTotalPagamento() {
        double jurosSimples = valorImovel * taxaJurosAnual * prazoFinanciamento;
        return valorImovel + jurosSimples;
    }
    // --- GETTERS ---
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void mostrarDadosFinanciamento() {
        System.out.println("--- Detalhes do Financiamento ---");
        System.out.printf("Valor do Imóvel: R$ %.2f%n", getValorImovel()); // Usamos o getter aqui
        System.out.printf("Prazo do Financiamento: %d anos%n", getPrazoFinanciamento()); // Usamos o getter aqui
        System.out.printf("Taxa de Juros Anual: %.2f%%%n", getTaxaJurosAnual() * 100); // Usamos o getter aqui
        System.out.printf("Pagamento Mensal: R$ %.2f%n", calcularPagamentoMensal()); // Chama o método existente
        System.out.printf("Valor Total do Financiamento: R$ %.2f%n", calcularTotalPagamento()); // Chama o método existente
        System.out.println("---------------------------------");

    }
}