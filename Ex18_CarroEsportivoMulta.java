public class Ex18_CarroEsportivoMulta {
    public static void main(String[] args) {
        System.out.println("\n--- 18. Carro Esportivo e Multa ---");
        boolean carroEsportivo = true;
        int velocidade = 120;
        if (carroEsportivo && velocidade > 110) System.out.println("Multa aplicada");
        else System.out.println("Sem multa");
    }
}