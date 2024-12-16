public class palindrom {
    public static void main(String[] args) {
        String a="1218121";
        int n=1218121;
        int i=0;
        int j=a.length()-1;
        boolean check=palindrom(a,j,i);
        System.out.println(check);
        System.out.println(isPalindrome(n));
    }

    private static boolean  palindrom(String a,int j,int i) {
        if(i==j){
            return true;
        }

        if(a.charAt(i)!=a.charAt(j)){
            return false;
        }
        if(i<j+1)
            return palindrom(a,i+1,j-1);

        return true;
    }

    public static boolean isPalindrome(int num) {

        if (num < 0) {
            return false;
        }

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit+" ");
            reversed = reversed * 10 + digit;
            num /= 10; 
           
        }

        return original == reversed;
    }
    
    
}
