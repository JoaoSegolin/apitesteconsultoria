package com.example.apitesteconsultoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ApitesteconsultoriaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ApitesteconsultoriaApplication.class, args);
//		Scanner input = new Scanner(System.in);
//		String resposta = "";
//		System.out.println("Digite o valor de x: ");
//		int x = input.nextInt();
//		System.out.println("Digite o valor de y: ");
//		int y = input.nextInt();
//		int z = (x*y) + 5;
//		if (z <= 0) {
//			resposta = "A";
//		} else {
//			if (z <= 100) {
//				resposta = "B";
//			} else {
//				resposta = "C";
//			}
//		}
//		System.out.println(z  + " " + resposta);

//		Scanner input = new Scanner(System.in);
//		int h1 = input.nextInt();
//		int h2 = input.nextInt();
//		int m1 = input.nextInt();
//		int m2 = input.nextInt();
//		int soma = Math.max(h1, h2) + Math.min(m1, m2);
//		int produto = Math.max(m1, m2) * Math.min(h1, h2);
//
//		System.out.println(soma);
//		System.out.println(produto);

		Scanner input = new Scanner(System.in);
		System.out.println("Digite os valores do primeiro vetor: ");
		int[] v1 = Arrays.stream(input.nextLine().trim().split(" ")).filter(x -> !x.equals("")).mapToInt(Integer::parseInt).toArray();
		System.out.println("Digite os valores do segundo vetor: ");
		int[] v2 = Arrays.stream(input.nextLine().trim().split(" ")).filter(x -> !x.equals("")).mapToInt(Integer::parseInt).toArray();
		int[] v3 = new int[v1.length + v2.length];
		int tamVetor1 = v1.length;
		int tamVetor2 = v2.length;
		int i = 0, j = 0, k = 0;

		while (i < tamVetor1 && j < tamVetor2) {

			if (v1[i] < v2[j]) {
				v3[k] = v1[i];
				k++;
				i++;
			} else {
				v3[k] = v2[j];
				k++;
				j++;
			}

		}

		while (i < tamVetor1) {
			v3[k] = v1[i];
			k++;
			i++;
		}

		while (j < tamVetor2) {
			v3[k] = v2[j];
			k++;
			j++;
		}

		System.out.println("Primeiro Vetor: " + Arrays.toString(v1) + "\nSegundo Vetor: " + Arrays.toString(v2));
		System.out.println("Uniao ordenada de Vetores: " + Arrays.toString(v3));

	}

}
