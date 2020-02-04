package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA: " + rectangle.area());
		System.out.println("PERIMETER: " + rectangle.perimeter());
		System.out.println("DIAGONAL: " + rectangle.diagonal());
	}

}
