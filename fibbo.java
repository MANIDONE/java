public class fibbo {

    public static void main(String[] args) {
        
        int num=9;
        System.out.println(fibbo(num));
    }

    private static int fibbo(int num) {
        if(num==0 || num==1){
            return num;
        }

        

        int r1=fibbo(num-1);
        int r2=fibbo(num-2);
            return r1+r2;
        
    }
    
}
