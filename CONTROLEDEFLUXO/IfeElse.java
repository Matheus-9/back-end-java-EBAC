import java.util.Scanner;

public class IfeElse {

    public static void main(String args[]){
        Controle();
        System.out.println("RESUT DA SEGUNDA VERIFICÇÃO");
        Controle2();

    }

    //if e else:
    public static void Controle(){
        Scanner s = new Scanner(System.in);
         System.out.println("Digite um numero: ");
        int result = s.nextInt() ;
        if (result > 1){
            System.out.println("Numero maior que 1");
        }else {
            System.out.println("Numero menor que 1");
        }
        
    }

    public static void Controle2(){
        int result = 3;
        if (result >= 1 && result < 8){
            System.out.println("Resultado entre 1 e 8");

        }else if (result >= 5 && result < 8) {
            System.out.println("Resultado entre 5 e 8");
        }else {
            System.out.println("Resultado difente dos demais");
        }
    }
    
}