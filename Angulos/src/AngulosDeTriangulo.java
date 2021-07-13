import java.util.Scanner;

public class AngulosDeTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el valor de 3 angulos para determinar si "
				+ " es un triangulo valido");
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe tu primer angulo");
		 int ang1 = sc.nextInt();
		 System.out.println("Escribe tu segundo angulo");
		 int ang2 = sc.nextInt();
		 System.out.println("Escribe tu tercer angulo");
		 int ang3 = sc.nextInt();
		 
		 int total = ang1 + ang2 + ang3;
		 
		 if(total ==  180) {
			 System.out.println("Tu triangulo es validdo");
		 }else {
			 System.out.println("Los angulos internos no son de un "
			 		+ " triangulo valido");
		 }
		 
		 
	}

}
