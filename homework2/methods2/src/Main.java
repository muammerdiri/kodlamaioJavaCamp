public class Main {

    public static void main(String[] args) {
        topla(1,2,6,7,5,9);
    }

    static void topla (int... a){
        int sumValue = 0;
        for (int number : a) {
            sumValue+=number;
            System.out.println(number+" " );
        }
        System.out.println("Toplam: "+sumValue);

    }
}