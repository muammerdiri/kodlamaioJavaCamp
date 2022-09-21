package multiDimensionalsArrays;

public class Main {

	public static void main(String[] args) {

		String [][] cities = new String[3][3]; 
		
		cities [0][0] = "Ankara";
		cities [0][1] = "İstanbul";
		cities [0][2] = "İzmit";
		cities [1][0] = "Uşak";
		cities [1][1] = "Afyon";
		cities [1][2] = "Manisa";
		cities [2][0] = "Hakkari";
		cities [2][1] = "Batman";
		cities [2][2] = "Gaziantep";
		
		for(int i = 0;i<cities.length;i++) {
			for(int j =0;j<3;j++) {
				System.out.println(cities[i][j]);
			}
			System.out.println("---------------");
		}
		
	}

}
