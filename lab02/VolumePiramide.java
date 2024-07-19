package lab02;

public class VolumePiramide {
    public static void main(String[] args) {
        var lado = Float.parseFloat(args[0]);
        var base = Math.pow(lado, 2);
        var altura = Float.parseFloat(args[1]);
        var volume = base * altura / 3;
        System.out.println("O volume da pirâmide é: " + Math.round(volume));
    }
}
