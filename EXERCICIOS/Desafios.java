import java.util.Scanner;

public class Desafios {

    public static void main(String args[]){
        CalculoDeNotas();
    }

/*FAZER A LEITURA DE 4 NOTAS E DIVIDIR POR 4
    DESAFIO NUMERO: 01
*/
    public static void CalculoDeNotas(){
     Scanner chamada = new Scanner(System.in);



    System.out.println("Digite sua primera nota: ");
    float nota1 = chamada.nextFloat();
        System.out.println("Agora sua segunda nota: ");

    float nota2 = chamada.nextFloat();
        System.out.println("Terceira nota: ");

    float nota3 = chamada.nextFloat();
        System.out.println("Ultima nota: ");

    float nota4 = chamada.nextFloat();

    float result = (nota1 + nota2 + nota3 + nota4) / 4;
    String avaliado = " ";

    if (result >= 80){
        avaliado = "A";

    } else if (result < 80 && result >= 70 ) {
        avaliado = "B";

    }else if (result < 70 && result >=  60 ) {
        avaliado = "C";

    }else if (result < 60 && result >= 0){
        avaliado = "D";
    }

        switch (avaliado) {
        case "A":
        case "B":
            System.out.println("Você foi aprovado! ");
            break;
        
        case "C":
        case "D":
            System.out.println("Não aprovado. ");
    
        default:
            System.out.println("Avaliação negada. ");
        }

}


}

