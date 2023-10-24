public class Desafios {

    public static void main(String args[]){
        CalculoDeNotas();
    }

/*FAZER A LEITURA DE 4 NOTAS E DIVIDIR POR 4
    DESAFIO NUMERO: 01
*/
    public static void CalculoDeNotas(){
    int primeiroSemestre = 9;
    int segundoSemestre = 8;
    int terceiroSemestre = 6;
    int quartoSemestre = 9;

    System.out.println(" *** Notas Semestrais *** ");

    int resultadoFinal = (primeiroSemestre + segundoSemestre + terceiroSemestre + quartoSemestre) /4;

    if (resultadoFinal >= 7) {
            System.out.println("Parabéns você foi aprovado : "  + resultadoFinal);

    } else {
        System.out.println("Sua nota esta a baixo da media : "  + resultadoFinal);
    }

    }
    

    
}
