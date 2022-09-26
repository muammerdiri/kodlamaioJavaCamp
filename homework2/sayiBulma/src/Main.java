public class Main {
    public static void main(String[] args) {

        int [] numbers = new int[]{1,2,5,6,8,9};
        int wantedNumber = 5;
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
            System.out.println("Sayı Bulunamadı.");
        }else {
            System.out.println("Sayı Bulundu.");
        }

    }
}