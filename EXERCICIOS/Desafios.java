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

    if (result >= 7){
        avaliado = "A";

    } else if (result >= 5) {
        avaliado = "B";

    }else if (result < 5){
        avaliado = "C";
    }

        switch (avaliado) {
        case "A":
            System.out.println("Você foi aprovado! ");
            break;
        
        case "B":
            System.out.println("Recuperação");
            break;

        case "C":
            System.out.println("Aluno reprovado. ");
            break;


            default:
        }

}


}

