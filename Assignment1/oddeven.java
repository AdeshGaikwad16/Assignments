package Assignment1;

public class oddeven {
    public static void main(String[] args) {
        int val=0;
        
        System.out.println(oddevenprob(val));
    }

    public static String oddevenprob(int val){
        if(val%2 == 0 && val!=0){
            return val +" is an even no";
        }else if(val%2!=0){
             return val +" is an odd no";
        }else if(val==0){
            return "???";
        }
        return null;
    }
}