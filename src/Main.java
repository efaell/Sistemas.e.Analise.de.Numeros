// usuario digita numeros
// quando digitar 0 , mostrar a soma
// mostra
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // usuario digita numeros ou 0 para sair e mostrar a soma de todos os numeros
        // quando o usario digitar 0, mostrar menu doq ele quer fazer
        // somar , ou contar quantidade digitadas ou a media
        // contar quantas vezes o usuario digitou os numeros
        System.out.println( "---- bem vindo ao sistema ---- ");

        int numero = -1;
        int contador = 0;
        int soma =0;


        while(numero!=0 ){
            System.out.println("digite numero ou 0 para sair e ter opções ");
            numero = ler.nextInt();
            soma += numero;

            if (numero !=0 ){
                contador++;
         }
        }


        System.out.println(" escolha uma opcao do que quer fazer ");
        System.out.println(" 1- contar quantidade de vezes digitadas ");
        System.out.println(" 2- somar numeros ");
        System.out.println( "3- media");

        int opcao = ler.nextInt();

        switch(opcao ){
            case 1:
                System.out.println( "contador : " + contador );
                break;

            case 2:
                System.out.println("soma: " + soma);
                break;

            case 3:
                if (contador > 0 ){
                double media = (double) soma / contador;
                    System.out.printf("media: %.2f\n", media);
            }else{
                    System.out.println(" nada digitado ");
                }
        }

        ler.close();


    }
}
