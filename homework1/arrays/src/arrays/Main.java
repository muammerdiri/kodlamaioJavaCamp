package arrays;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String studentString = "Tarik";
		String studentString2 = "Kemal";
		String studentString3 = "Mehmet";
		String studentString4 = "Melike";
		String studentString5 = "Gozde";
		
		
		System.out.println(studentString);
		System.out.println(studentString2+"\n.\n.\n.");
		
		String [] names = new String[5];
		names[0]= studentString;
		names[1]= studentString2;
		names[2]= studentString3;
		names[3]= studentString4;
		names[4]= studentString5;
		
		for(String name: names) {
			System.out.println("Name: "+name);
		}

	}

}
