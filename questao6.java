import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		System.out.println("Entre com o primeiro numero: ");
		a = ler.nextInt();
		System.out.println("Entre com o segundo numero: ");
		b = ler.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		c = ler.nextInt();
		System.out.println("Entre com o quarto numero: ");
		d = ler.nextInt();
		System.out.println("Entre com o quinto numero: ");
		e = ler.nextInt();
		if(a > b & a > c & a > d & a > e) {
			System.out.println(+a);
						
		}
		if(b > a & b > c & b > d & b > e) {
			System.out.println(+b); 
		}if(c > b & c > a & c > d & c > e) {
			System.out.println(+c);
		}if(d > b & d > c & d > a & d > e) {
			System.out.println(+d);
		}if(e > b & e > c & e > d & e > a) {
			System.out.println(+e);
		}
	}
}