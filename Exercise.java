package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int toplam = 0;

		System.out.print("Enter a number: ");
		int sayi = scan.nextInt();

		while (sayi > 0) {
			toplam += sayi % 10;
			sayi /= 10; 
		}
		System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);
	}
}
