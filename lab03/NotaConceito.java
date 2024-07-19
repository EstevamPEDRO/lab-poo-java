package lab03;

import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite a nota (0-100): ");
        var nota = sc.nextInt();
        if (nota >= 91 && nota <= 100 ) {
            System.out.println("A");
        }
        else if (nota >= 81 && nota <= 90) {
            System.out.println("B");
        }
        else if (nota >= 71 && nota <= 80) {
            System.out.println("C");
        }
        else {
            System.out.println("Nota fora do intervalo");
        }


        System.out.println("Digite o conceito (A, B, C, D, E ou F)");
        var conceito = sc.next();
        switch (conceito) {
            case "A" -> System.out.println("Nota 100");
            case "B" -> System.out.println("Nota 90");
            case "C" -> System.out.println("Nota 80");
            case "D" -> System.out.println("Nota 70");
            default ->System.out.println("Conceito Inválido");
            
        }
    }
}
