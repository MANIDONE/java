public class hamming {
    static int hamming(int n1,int n2){
        int x = n1 ^ n2;
        int setBits = 0;
     
        while (x > 0) 
        {
            setBits += x & 1;
            x >>= 1;
        }
     
        return setBits;
    }
    public static void main(String[] args) {
        
        int n1 =0, n2 = 15;
     
        System.out.println(hamming(n1, n2));
    }
    
}
