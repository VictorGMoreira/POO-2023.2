package br.edu.principal;

import modelo.*;
public class Principal {
    public static void main(String[] args) {
        Esteira esteira = new Esteira();
        Caixa caixa = new Caixa(esteira);

        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();
        caixa.addGarrafa();

    }
}
