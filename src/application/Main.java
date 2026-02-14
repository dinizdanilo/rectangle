package application;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Digite a largura e a altura do retângulo: ");
        r.largura = sc.nextDouble();
        r.altura = sc.nextDouble();

        System.out.println(r);
    }
}