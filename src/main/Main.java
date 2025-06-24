//ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - PUCPR
// DISCIPLINA: POO
// ESTUDANTE: MARCOS FARINELLI GIMENES

package main;

import java.util.ArrayList;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto responsável por lidar com o usuário
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        //Declaração e inicialização do ArrayList
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Leitura dos dados usando os métodos da classe InterfaceUsuario
        // (Desativado por enquanto, para fazer a leitura do ArrayList)
        // double valorImovel = interfaceUsuario.pedirValorImovel();
        // int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        // double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();
        // financiamentos.add(new Financiamento(valorImovelUsuario, prazoFinanciamentoUsuario, taxaJurosAnualUsuario));

        // Instancia um objeto da classe Financiamento com os dados fornecidos
        // Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        for (int i = 1; i <= 4; i++) {
            System.out.println("\n--- Dados para o Financiamento " + i + " ---");
            // Pedir os dados para o financiamento atual usando InterfaceUsuario
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();

            // Criar um novo objeto Financiamento com os dados lidos
            Financiamento novoFinanciamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

            // Adicionar o novo financiamento ao ArrayList
            financiamentos.add(novoFinanciamento);
        }

            System.out.println("Financiamento 1 – valor do imóvel: " + financiamentos.get(0).getValorImovel() + "valor do financiamento: " + financiamentos.get(0).calcularTotalPagamento());


        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;
        int contador = 1;

        System.out.println("\n--- Detalhes financiamentos ---");
        for (Financiamento f : financiamentos) {
            System.out.printf("Financiamento %d – valor do imóvel: R$ %.2f, valor do financiamento: R$ %.2f.%n", contador, f.getValorImovel(), f.calcularTotalPagamento());
            totalValorImoveis += f.getValorImovel();
            totalValorFinanciamentos += f.calcularTotalPagamento();
            contador++;
        }
        System.out.println("------------------------------------");

        System.out.printf("Total de todos os imóveis: R$ %.2f, total de todos os financiamentos: R$ %.2f.%n", totalValorImoveis, totalValorFinanciamentos);

        interfaceUsuario.fecharScanner();
    }
}
