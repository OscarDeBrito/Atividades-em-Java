import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    	int b;
        int a;
        char operacao;
        int d;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com a opera��o a ser realizada (+, - ou *): ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.println("Entre com o primeiro n�mero: ");
        a = entrada.nextInt();
        System.out.println("Entre com o segundo n�mero: ");
        b = entrada.nextInt();
        
        switch( operacao )
        {
            case '+':
            	d = a + b;
                System.out.println("O resultado da opera��o �: "+ d);
                break;        
                
            case '-':
            	d = a - b;
                System.out.println("O resultado da opera��o �: "+ d);
                break;
                
            case '*':
            	d = a * b;
                System.out.println("O resultado da opera��o �: "+ d);
                break;
                default:
                System.out.println("Opera��o inv�lida"); 
            
            
        }
        

    }
}
