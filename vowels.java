public class vowels {

    public static void main(String[] args) {
        String s="IcreamAm";
        System.out.println(vowels(s));
            }
            private static String vowels(String s) {
            char[] word = s.toCharArray();
            int start = 0;
            int end = s.length() - 1;
            String vowels = "aeiouAEIOU";
        
            while (start < end) {
          
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            
            while (start < end && vowels.indexOf(word[end]) == -1) {

                end--;
            }
            
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            
            start++;
            end--;
        }
        
        String answer = new String(word);
        return answer;
            }
    
}
