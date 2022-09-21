package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double [] myList={
			1.1, 4.5, 5.6, 15.5,12.3
		}; 
		
		double total =0;
		double max=myList[0];
		
		for(double number:myList) {
			total+=number;
		
			if(max<number) {
				max=number;
			}
			
			System.out.print(number+", ");
			
		}
		System.out.println("\nEn Buyuk sayi: "+max);
		System.out.println("Total: "+total);

	}

}
