import java.util.*;
public class Adivinarnumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int aleatorio=(int)(Math.random()*10);
		System.out.print(aleatorio);
		int intentos=0, numero=0;
		while(intentos<=4) {
			System.out.print("Ingresa un numero");
			numero=sc.nextInt();
			if(numero == aleatorio) {
				System.out.println("Felicidades Adivinaste el numero");
				break;
			}
			else {
				System.out.print("No es ese numero");
			}
			intentos++;
		}
		
		

	}

}
