public class Operadores {
    
    public static void main(String args[]){
        operacoesAritimeticas();
        operacoesAtribuicao();
        operacoesIncrementoDecremento();
        operacoesRelacionais();
        operacoesLogicas();

    }
    public static void operacoesAritimeticas(){
        System.out.println("**** OPERAÇÕES ARITIMETICAS ****");


        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 +10)/2;

        System.out.println(num3);//30
        System.out.println(num4);//-10
        System.out.println(num5);//0
        System.out.println(num6);//200
        System.out.println(num7);//10

    }


    public static void operacoesAtribuicao(){
        System.out.println("**** OPERAÇÕES ATRIBUIÇÃO ****");

        int numero1 = 10;
        int numero2 = 10;

        int numero3 = numero1 + numero2;
        System.out.println(numero3);//20
        numero3 += numero3;
        System.out.println(numero3);//40





    }


    public static void operacoesIncrementoDecremento(){
         System.out.println("**** OPERAÇÕES INCREMENTO E DECREMENTO ****");



        int primeiro = 10;
        primeiro++;
        System.out.println(primeiro);//11

        primeiro--;
        System.out.println(primeiro);//10


    }

    public static void operacoesRelacionais(){
        System.out.println("**** OPERAÇÕES REALACIONAIS ****");


        int valor1 = 10;
        int valor2 = 10;
        boolean isMaior = valor1 > valor2;
        boolean isIgual = valor1 == valor2;
        boolean isDiferente = valor1 != valor2;
        boolean isMaiorIgual = valor1 >= valor2;
        boolean isMenorIgual = valor1 <= valor2;

        
        System.out.println(isMaior);//false
        System.out.println(isIgual);//true
        System.out.println(isDiferente);//false
        System.out.println(isMaiorIgual);//true
        System.out.println(isMenorIgual);//true




    }

    public static void operacoesLogicas(){
    System.out.println("**** OPERAÇÕES LOGICAS ****");

        int valor1 = 10;
        int valor2 = 10;

        boolean isMabosVerdadeiros = valor1 >= 1 && valor1 <= 10;//&& (and) retorna true se ambas as expressões forem verdadeiras. Caso contrário, retorna false.
        boolean isAomensoUmVerdadeiro = valor1 >= 1 || valor1 <= 10;//|| (or) retorna true se pelo menos uma das expressões for verdadeira. Caso contrário, retorna false.
        boolean isValorOposto = valor1 >= 1 || valor1 <= 10;//! (not) retorna o valor oposto da expressão. Se a expressão for verdadeira, retorna false. Se a expressão for falsa, retorna true.


        System.out.println(isMabosVerdadeiros);//true
        System.out.println(isAomensoUmVerdadeiro);//true
        System.out.println(!isValorOposto);//false

    }
    
}
