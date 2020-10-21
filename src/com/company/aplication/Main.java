package com.company.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("nome do aluno: ");
        String nome = scan.next();
        System.out.print("Nota primeiro trimetre: ");
        Double nota1 = scan.nextDouble();
        System.out.print("Nota segundo trimestre: ");
        Double nota2 = scan.nextDouble();
        System.out.print("Nota terceiro trimetre: ");
        Double nota3 = scan.nextDouble();

        Estudante estudante = new Estudante(nome,nota1,nota2,nota3);

        System.out.print("nota total do semestre: ");
        System.out.print(estudante.notaTotal());

        System.out.println();
        if(estudante.notaTotal() < 60.0){
            System.out.println("aluno reprovado");
           System.out.println("Falta: " + estudante.resultadoFinal()+ " pontos");
        }else
            System.out.println("aluno aprovado");
        scan.close();
    }

}
