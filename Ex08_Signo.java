public class Ex08_Signo {
    public static void main(String[] args) {
        System.out.println("\n--- 8. Identificação do Signo ---");
        int mes = 3, dia = 25;
        String signo = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) signo = "Áries";
        else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) signo = "Touro";
        else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) signo = "Gêmeos";
        else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) signo = "Câncer";
        else signo = "Outro signo";
        System.out.println("Signo: " + signo);
    }
}