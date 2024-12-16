import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters{
    public static void main(String[] args) 
    {

        String s="abcabcbb";
        //first method


        
        int n=s.length();
        int max=0;
        Set<Character> str = new HashSet<>();
        int left=0;
        for(int i=0;i<n;i++){
            if(!str.contains(s.charAt(i))){
                str.add(s.charAt(i));
                max=Math.max(max,i-left+1);
            }else{
                while(str.contains(s.charAt(i))){
                    str.remove(s.charAt(left));
                    left++;
                }
                str.add(s.charAt(i));
            }
        }

       System.out.println(max);

    //seond method



        int no=s.length();
        Set<Character>st=new HashSet<>();
        int start=0;
        int maxl=0;
        int end=0;
        while(end<no){
            char ch=s.charAt(end);
            if(!st.contains(ch)){
                st.add(ch);
                maxl=Math.max(maxl,end-start+1);
                end++;

            }
            else if(st.contains(ch)){
                st.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(maxl);
        

    }
}
