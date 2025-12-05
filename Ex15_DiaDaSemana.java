public class Ex15_DiaDaSemana {
    public static void main(String[] args) {
        System.out.println("\n--- 15. Dia da Semana ---");
        int dia = 3;
        String nomeDia;
        switch (dia) {
            case 1: nomeDia = "Domingo"; break;
            case 2: nomeDia = "Segunda"; break;
            case 3: nomeDia = "Terça"; break;
            case 4: nomeDia = "Quarta"; break;
            case 5: nomeDia = "Quinta"; break;
            case 6: nomeDia = "Sexta"; break;
            case 7: nomeDia = "Sábado"; break;
            default: nomeDia = "Inválido";
        }
        System.out.println("Dia: " + nomeDia);
    }
}