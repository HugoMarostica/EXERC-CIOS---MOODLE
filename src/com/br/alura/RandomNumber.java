package com.br.alura;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class RandomNumber {

    public static void main(String[] args) {
        
        // Gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
        // A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Este é o Jogo da Advinhação!!\nVocê terá 5 tentativas para acertar o Número Secreto.\nBOA SORTE...");
        System.out.println("------------------------------------------------------------------------------------");
        
        Scanner input = new Scanner(System.in);                     //Criação do Imput
        int randomNumber = new Random().nextInt(100);        //Crianção do Numero Secreto

        boolean acertou = false;

        for (int i = 1 ; i < 6 ; i++) {

            System.out.print("Digite um Número: ");
            int tentativa = input.nextInt();

            if (tentativa == randomNumber) {
                acertou = true;
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("Parabéns, você acertou o Número Secreto -> " + randomNumber);
                break;
            }

            if (tentativa < randomNumber) {
                System.out.println("O número secreto é maior do que " + tentativa + ".");
            }

            if (tentativa > randomNumber) {
                System.out.println("O número secreto é menor do que " + tentativa + ".");
            }

            }
        
        System.out.println("------------------------------------------------------------------------------------");
        if (acertou) {
            System.out.println("Meus Parabéns. Até a Próxima.");
            System.out.println("------------------------------------------------------------------------------------");
        } else {
            System.out.println("Que pena.\nO número secreto era: " + randomNumber + ".\nNa próxima você consegue!!");
            System.out.println("------------------------------------------------------------------------------------");
        }

        input.close();	

    }
}