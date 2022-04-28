package com.rbwstudy;

import java.util.Scanner;

public class Main {

    private static final Scanner entrada = new Scanner(System.in);

    public static String getInputs() {

        System.out.println("Entre com o peso em kg:");
        float peso = entrada.nextFloat();

        System.out.println("Entre com a altura em metros:");
        float altura = entrada.nextFloat();

        return calcularImc(peso,altura);
    }

    public static String calcularImc(float peso, float altura) {
        double[] comparacoesImc = {18.5,24.9,29.9,39.9, 100};
        String[] classificacoes = {"Magreza","Normal","Sobrepeso","Obesidade","Obesidade extrema"};
        float imc = peso / (altura * altura);
        if (imc > 100) imc = 100;
        int i = 0;
        while (imc > comparacoesImc[i]) { i++; }
        return ("A sua classificação é: " + classificacoes[i]);
    }

    public static void main(String[] args) {

        System.out.println("Gostaria de calcular novo IMC? (1=sim, 0=não)");
        while (entrada.nextInt() == 1) {
            System.out.println(getInputs());
            System.out.println("Gostaria de calcular novo IMC? (1=sim, 0=não)");
        }

    }
}
