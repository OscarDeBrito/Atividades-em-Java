import java.util.Scanner;
public class exercicio {

	public static void main(String[] args) {
		// Declarações
		int a,b,c,d; // variável do tipo String
		 Scanner ler = new Scanner(System.in); // NEW → cria um novo objeto
		 // Instruções
		 System.out.print("Digite o DDD:\n");
		 a = ler.nextInt();
		 if(a == 62 ){
		 System.out.println("Goiânia");
		 }
		 else if(a == 61) {
			 System.out.println("Brasília");
		 }
		 else if(a == 65) {
			 System.out.println("Cuiabá");
		 }
		 else if (a == 67){
			 System.out.println("\n A capital é:" + "\n Campo Grande");
		 }
		 else {
			 System.out.println("DDD não pertence a capital do centro-oeste\r\n"
			 		+ "brasileiro");
		 }
		 }
		 } 
		 
		 
	


