package edu.augusto.segundasemana;

public class MinhaClasse{

    public static void main (String []args){
        String meuNome = "Augusto";

        int anoFabricacao = 2022;

        boolean verdadeira = true;
    
        anoFabricacao = 2018;

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    String primeiroNome = "Augusto";
    String segundoNome = "Pontes";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

}