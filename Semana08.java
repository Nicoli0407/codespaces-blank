import java.util.Scanner;

public class Semana08 { 
    public static void main(String[] args) {

        double somaNotas = 0; 
        double notaDigitada;
        double mediaTurma;
        int qtdNotas = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
         notaDigitada = leia.nextDouble();

        while (notaDigitada != -1) {

          somaNotas = somaNotas + notaDigitada;

          qtdNotas++;

        System.out.println("Digite a próxima nota (ou -1 para calcular): ");
          notaDigitada = leia.nextDouble();

        }

        if (qtdNotas > 0) {

            mediaTurma = somaNotas / qtdNotas;

            System.out.println( );
            System.out.println("RESULTADO FINAL");
            System.out.println("Total de notas inseridas: "  + qtdNotas);
            System.out.printf("A média da turma é: %.2f%n", mediaTurma);



        } else {

         System.out.println("Nenhuma nota foi inserida.");


        }
        leia.close();

    }


}



