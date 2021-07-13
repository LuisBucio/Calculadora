import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe tu primer numero");
		 int num1 = sc.nextInt();
		 System.out.println("Escribe tu segundo numero");
		 int num2 = sc.nextInt();
		 System.out.println("¿Qué operación deseas realizar?");
		 System.out.println("1-Suma");
		 System.out.println("2-Resta");
		 System.out.println("3-Multiplicación");
		 System.out.println("4-División");
		 int operacion = sc.nextInt();
		 String mensaje = "";
		 int suma = num1 + num2;
		 int resta = num1 - num2;
		 int multiplicacion = num1 * num2;
		 int division = num1 / num2 ;
		 
		 switch (operacion) {
		 case 1:
			 mensaje = "El resultado es " + suma;
			 break;
		 case 2:
			 mensaje = "El resultado es " + resta;
			 break;
		 case 3:
			 mensaje = "El resultado es " + multiplicacion;
			 break;
		 case 4:
			 mensaje ="El resultado es " + division;
			 break;
		default:
			mensaje ="El numero seleccionado no es valido";
			break;
			 
		 }
			System.out.println(mensaje);
			
	}
}
