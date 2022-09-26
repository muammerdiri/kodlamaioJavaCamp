public class Main {

    static void wantedNumberFunction(int [] numbers, int wantedNumber){

        boolean isThere = false;

        for (int number:numbers){
            if(number == wantedNumber){
                isThere = true;
                break;
            }else {
                isThere = false;
            }
        }

        if (isThere ==false){
            System.out.println("Sayı Mevcut Değildir: "+wantedNumber);
        }else {
            System.out.println("Sayı Bulundu: "+wantedNumber);
        }
    }

    public static void main(String[] args) {

        int [] numbers = new int[]{1,2,5,6,8,9};


        wantedNumberFunction(numbers,14);
    }
}