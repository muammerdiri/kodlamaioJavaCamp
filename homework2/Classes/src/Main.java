public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager=customerManager2;
        customerManager.add();
        System.out.println("-----------------------");
        customerManager.delete();
        System.out.println("-----------------------");
        customerManager.update();


        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);



        int [] arr1 = new int[]{1,2,3};
        int [] arr2 = new int[]{4,5,6};

        arr2 =arr1;
        arr1[0] =10;
        System.out.println(arr2[0]);


    }
}