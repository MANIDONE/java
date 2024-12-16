

public class subsequance {



  
    public static void main(String[] args)
    {
        String s = "ABC";
        findsubsequences(s,"",0); 
        
    }

    private static void findsubsequences(String s, String ans,int index)
    {
        if (index==s.length()) {
            System.out.print(ans+" ");
            return;
        }
        findsubsequences(s,ans+s.charAt(index),index+1);

        findsubsequences(s,ans+" ",index+1);     
    }

}
