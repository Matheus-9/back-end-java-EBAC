import java.util.Scanner;

public class IfeElse {

    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println("**** VERIFICAÇÃO DA IDADE ****");


        System.out.println("Digite qual é a sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

        Controle();
        System.out.println("**** RESUT DA SEGUNDA VERIFICÇÃO ****");
        Controle2();

    }


      public static String getIdade(int idade){
        if (idade >= 0 && idade <= 5){
            return "Você é um bebê";
        }else if (idade >=7 && idade <= 10){
            return "Você é uma criança";
        }else if (idade >= 15 && idade <= 18){
            return "você é um adolescente";
        }else {
            return "Você é um adulto";
        }
        

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