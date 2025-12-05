public class Ex14_VerificacaoEleicao {
    public static void main(String[] args) {
        System.out.println("\n--- 14. Verificação para Eleição ---");
        int idade = 16;
        if (idade >= 18) System.out.println("Voto obrigatório");
        else if (idade >= 16) System.out.println("Voto facultativo");
        else System.out.println("Não pode votar");
    }
}