package estudos.tipos_variaveis.src;

public class Operadores {
    public static void main(String []args){
        String nomeCompleto = "LINGUAGUEM" + "JAVA";

        System.out.println(nomeCompleto);
    
        String concatenacao = "?";
        
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" +(1+1+1);

        System.out.println(concatenacao);

    }
}
