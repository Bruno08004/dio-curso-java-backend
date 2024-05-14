package edu.Bruno.primeirasemana;
public class MinhaClasse {
  
   public static void main(String [] args){
     
      String primeiroNome = "Bruno";
      String segundoNome = "Campos";

      String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
       
      System.out.print(nomeCompleto);
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome){
      return "Meu nome completo é: " + primeiroNome.concat(" ").concat(segundoNome);
   }
}
