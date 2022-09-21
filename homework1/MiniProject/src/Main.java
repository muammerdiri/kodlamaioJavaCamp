import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		
		
		Scanner scnScanner = new Scanner(System.in);
		
		
		
		
		/*
		 * System.out.print("Sayi Giriniz: "); int number = scnScanner.nextInt(); int
		 * counter = 0;
		 * 
		 * 
		 * for(int i =2;i<number;i++) {
		 * 
		 * if(number % i ==0); counter++;
		 * 
		 * }
		 * 
		 * if (counter ==0 ) { System.out.println(number + " sayisi asal sayidır.");
		 * 
		 * }else { System.err.println(number + " sayisi asal sayi degildir.");
		 * 
		 * } scnScanner.close();
		 */ 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("(Tam)Sayı giriniz: ");
	        int number = scanner.nextInt();
	        int counter = 0;
	        
	        for(int i = 2; i < number; i++)
	        {
	            if(number % i == 0) {
	                counter++;
	            }
	        }
	        if(counter == 0) {
	            System.out.println(number + " Asal bir sayidir.");
	        }
	        else {
	            System.out.println(number + " Asal bir sayi degildir.");
	        }
	    }
	}