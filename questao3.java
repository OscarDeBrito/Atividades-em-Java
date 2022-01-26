import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    	int b;
        int a;
        char operacao;
        int d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com a operação a ser realizada (+, - ou *): ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.println("Entre com o primeiro número: ");
        a = entrada.nextInt();
        System.out.println("Entre com o segundo número: ");
        b = entrada.nextInt();
        
        switch( operacao )
        {
            case '+':
            	d = a + b;
                System.out.println("O resultado da operação é: "+ d);
                break;        
                
            case '-':
            	d = a - b;
                System.out.println("O resultado da operação é: "+ d);
                break;
                
            case '*':
            	d = a * b;
                System.out.println("O resultado da operação é: "+ d);
                break;
                default:
                System.out.println("Operação inválida"); 
            
            
        }
        

    }
}
