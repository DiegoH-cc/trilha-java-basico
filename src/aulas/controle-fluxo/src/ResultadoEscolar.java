public class ResultadoEscolar {
    public static void main(String[] args) {
        /* Condição Encadeada
        int nota = 4;
        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de Recuperação"); // true ou false
        } else
            System.out.println("Reprovado");
        */

        // Condição Ternária
        int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}