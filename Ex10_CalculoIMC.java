public class Ex10_CalculoIMC {
    public static void main(String[] args) {
        System.out.println("\n--- 10. Cálculo de IMC ---");
        double pesoKg = 70;
        double alturaM = 1.75;
        double imc = pesoKg / (alturaM * alturaM);
        System.out.printf("Peso: %.1f kg, Altura: %.2f m. IMC: %.2f\n", pesoKg, alturaM, imc);
        String classificacaoImc;
        if (imc < 18.5) classificacaoImc = "Abaixo do peso";
        else if (imc < 24.9) classificacaoImc = "Peso normal";
        else if (imc < 29.9) classificacaoImc = "Sobrepeso";
        else classificacaoImc = "Obesidade";
        System.out.println("Classificação: " + classificacaoImc);
    }
}