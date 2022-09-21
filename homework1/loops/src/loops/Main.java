package loops;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Muammer");
		names.add("Melisa");
		names.add("Yasemin");
		names.add("Mehmet");
		names.add("Ahmet");
		

		
		for(int i =0; i< names.size();i++) {
			System.out.println("name: "+ names.get(i));
		}
		
		//------------ While Loop ----------------
		
		int i =1;
		while(names.size()<=5) {
			
			System.out.println("name: "+ names.get(i));
			i++;
		}
		
		
		//------------ Do While Loop ----------------
		
		int j =1;
		do {
			System.out.println(j);
		} while (j<10);
		System.out.println("Loop Finish!");
		
	}

}
