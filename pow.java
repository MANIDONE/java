public class pow { 
    
        
        public static void main(String[] args) {
            int a=4;
            int b=2;
            
            System.out.println(multiple(a,b));
        }
    
        public  static int multiple(int a,  int b) { 
           if(b==1){
            return a;
           }
           int num = multiple(a, b-1);
           return num*a;
        }
    
}
