public class Ex17_AnoBissexto {
    public static void main(String[] args) {
        System.out.println("\n--- 17. Verificação de Ano Bissexto ---");
        int ano = 2024;
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) System.out.println("Ano bissexto");
        else System.out.println("Não é bissexto");
    }
}