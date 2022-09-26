public class Main {
    public static void main(String[] args) {

       int sumResult = sum(1,2,3,6,9,8);
       System.out.println(sumResult);
    }

    public static int sum(int... numbers){
        int total=0;
        for(int number :numbers)
             total+= number;

        return total;
    }
}