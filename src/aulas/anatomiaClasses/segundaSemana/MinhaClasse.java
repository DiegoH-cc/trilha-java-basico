package aulas.anatomiaClasses.segundaSemana;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Diego";
        String segundoNome = "Hugo";
        
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}