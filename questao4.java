import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		 int num, soma = 0;
	        int cont = 0;
	        do{
	            System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
	            num = ent.nextInt(); // usuario digita um número
	            
	            if(num >= 0){ // se o número digitado for MAIOR que zero, executa a conta
	                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
	                cont++; // conta quantas vezes o usuário digitou um número
	            }
	        } while(num >= 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente
	        
	        System.out.println("A soma é: " + soma); // soma
	        
	    }


}


