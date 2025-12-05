public class Ex11_ClassificacaoTriangulo {
    public static void main(String[] args) {
        System.out.println("\n--- 11. Classificação de Triângulo ---");
        int a = 5, b = 5, c = 8;
        if (a == b && b == c) System.out.println("Equilátero");
        else if (a == b || b == c || a == c) System.out.println("Isósceles");
        else System.out.println("Escaleno");
    }
}