import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		 int num, soma = 0;
	        int cont = 0;
	        do{
	            System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
	            num = ent.nextInt(); // usuario digita um n�mero
	            
	            if(num >= 0){ // se o n�mero digitado for MAIOR que zero, executa a conta
	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
	                cont++; // conta quantas vezes o usu�rio digitou um n�mero
	            }
	        } while(num >= 0); // se o n�mero digitado for MAIOR que zero, faz o LOOP novamente
	        
	        System.out.println("A soma �: " + soma); // soma
	        
	    }


}


