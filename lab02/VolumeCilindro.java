package lab02;

import java.util.Scanner;

public class VolumeCilindro {
    public static void main(String[] args) {
        System.out.println("Informe o raio: ");
        var sc = new Scanner (System.in);
        var raio = sc.nextInt();
        System.out.println("Informe a altura: ");
        var altura = sc.nextInt();
        var volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cilindro é: " + volume);
        sc.close();
    }
}
