public class Ex13_QualidadeAguaPH {
    public static void main(String[] args) {
        System.out.println("\n--- 13. Qualidade da Água pelo pH ---");
        double ph = 7.5;
        if (ph < 7) System.out.println("Ácida");
        else if (ph > 7) System.out.println("Básica");
        else System.out.println("Neutra");
    }
}