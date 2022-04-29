package com.rbwstudy;

import java.util.Scanner;

public class Main {

    private static final Scanner entrada = new Scanner(System.in);

    public static String newImcCalc() {

        System.out.println("Entre com o peso em kg:");
        float peso = entrada.nextFloat();

        System.out.println("Entre com a altura em metros:");
        float altura = entrada.nextFloat();

        return classificarImc(peso,altura);
    }

    public static String classificarImc(float peso,float altura) {
        double[] comparacoesImc = {18.5,24.9,29.9,39.9, 100};
        String[] classificacoes = {"Magreza","Normal","Sobrepeso","Obesidade","Obesidade extrema"};
        float imc = peso / (altura * altura);
        if (imc > 100) imc = 100;
        int i = 0;
        while (imc > comparacoesImc[i]) { i++; }
        return ("A sua classificação é: " + classificacoes[i]);
    }

    public static void main(String[] args) {
        System.out.println("Gostaria de calcular um IMC? (s/n)");
        String teste = entrada.nextLine();
        while (!"n".equals(teste)) {
            System.out.println(newImcCalc());
            System.out.println("Gostaria de calcular um novo IMC? (s/n)");
            entrada.nextLine();
            teste = entrada.nextLine();
        }
        System.out.println("Programa encerrado.");
    }
}
