public class DortIslem {

    public int sum(int num, int num2){
        return num+num2;
    }
    public int sum(int... nums){

        int total=0;
        for(int num:nums){
            total+=num;
        }
        return total;
    }

}
