import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        System.out.println("--------CALCULADORA--------");
        
        System.out.print("Me informe o primeiro valor: ");
        double primeiro_valor = entrada.nextDouble();

        System.out.print("\nMe informe a operação (+, -, * ou /) que você deseja utilizar: ");
        char operacao = entrada.next().charAt(0);

        System.out.print("\nMe informe o segundo valor: ");
        double segundo_valor = entrada.nextDouble();

        double resultado;

        System.out.println("\n--------RESULTADO--------");
//---------------------------------------------------------------------
        switch (operacao) {
            case '+':
                resultado = primeiro_valor + segundo_valor;
                System.out.println("Resultado: " + resultado);
            break;
//---------------------------------------------------------------------
            case '-':
                resultado = primeiro_valor - segundo_valor;
                System.out.println("Resultado: " + resultado);
            break;    
//---------------------------------------------------------------------
            case '*':
                resultado = primeiro_valor * segundo_valor;
                System.out.println("Resultado: " + resultado);
            break;    
//---------------------------------------------------------------------
            case '/':
                resultado = primeiro_valor / segundo_valor;
                System.out.println("Resultado: " + resultado);
        
            default:
                break;
        }

    }
}