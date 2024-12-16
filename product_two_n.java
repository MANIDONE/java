public class product_two_n {
    
    public static void main(String[] args) {
        int a=2;
        int b=8;
        
        System.out.println(multiple(a,b));
    }

    public  static int multiple(int a,  int b) { 
       if(b==0||a==0){
        return 0;
       }

        return a+ multiple(a, b-1);
    }
}
