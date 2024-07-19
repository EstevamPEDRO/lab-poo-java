package lab02;

public class Entrada2 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Entrada2.java 1 2
    public static void main(String[] args) {
        var aresta = Double.parseDouble(args[0]); //conversão para double (Número com casas decimais)
        var volume = Math.pow(aresta, 3);
        System.out.println("O volume do cubo é " + volume);
    }
}
