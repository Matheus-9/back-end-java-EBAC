package FORWHILE;

import javax.print.attribute.standard.Sides;
import java.util.Scanner;

public class Ex_For {

    public static void main(String asrgs[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número ? (sim ou não ): ");
        String resposta = scanner.next();

        while (resposta.equalsIgnoreCase("sim")){

            System.out.println("Digite o numero para gerar a tabuada: ");
            int num = scanner.nextInt();
            for (int i = 0; i <= 10; i++){
                System.out.println(num + " X " + i + " = " + num*i);
            }
            System.out.println("Deseja gera mais alguma tabuada? ");
            resposta = scanner.next();
        }
        System.out.println("Obrigado por participar !");
    }




}
