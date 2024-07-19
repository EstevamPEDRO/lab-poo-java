package lab02;

public class VolumeEsfera {
    public static void main(String[] args) {
        var raio = Float.parseFloat(args[0]);
        var volume = 4 * Math.PI * Math.pow(raio, 3) / 3;
        System.out.println("O volume da esfera é: " + volume);
    }
}