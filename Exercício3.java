import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, me informe um número e eu falarei se ele é ímpar ou par");
        
        System.out.print("\nInforme o número: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número informado é PAR, pois é divisivel por 2!");
        }else{
            System.out.println("O número informado é ÍMPAR, pois NÃO é divisivel por 2!");
                        

        }
        
        
    }
}
