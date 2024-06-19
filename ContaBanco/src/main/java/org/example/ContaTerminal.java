package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        float saldo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        nome = ler.next();

        System.out.println( "Por favor, digite o número da Agência !");
        agencia = ler.next();

        System.out.println("Insira o número da conta: ");
        numero = ler.nextInt();

        saldo = 1203.75F;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.", nome, agencia, numero, saldo);

    }
}