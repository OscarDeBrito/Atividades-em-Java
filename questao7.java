import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char a;
		System.out.println("Digite o caracter a ser verificado: ");
		a = ler.next().charAt(0);
		if(a== Integer.parseInt("20")|| a == 1|| a == 2|| a == 3|| a == 4|| a == 5|| a == 6|| a == 7|| a == 8|| a == 9) {
			System.out.println("true ");
		} else {
			System.out.println("false ");
		}
		
		
			   
		
		

	}

}

