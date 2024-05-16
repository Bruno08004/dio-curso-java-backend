import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    
    public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in).useLocale(Locale.US); 
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.println("Você realizou a alteração do canal para: " + smartTv.canal);
        System.out.println("Para qual qual canal gostaria de mudar? ");
        smartTv.canal = sc.nextInt();
        System.out.println("Ok, o seu canal foi alterado para: " + smartTv.canal);








     sc.close();



    }
}
