public class Ex09_CalculoDesconto {
    public static void main(String[] args) {
        System.out.println("\n--- 9. Cálculo de Desconto ---");
        double preco = 100.0;
        double desconto = (preco > 200) ? 0.15 : (preco >= 100 ? 0.10 : 0.05);
        double precoFinal = preco - (preco * desconto);
        System.out.println("Preço final: " + precoFinal);
    }
}