public class String_comparession {
    public static void main(String[] args) {


        
    System.out.println("-------------------------------------------------------------------------------------");
        String input = "AAABBBBCC";
        
    int count = 1;

    char last = input.charAt(0);

    StringBuilder output = new StringBuilder();

    for(int i = 1; i < input.length(); i++){
    if(input.charAt(i) == last){
    count++;
    }else{
        if(count > 1){        //count + last 3a
            output.append(""+last+count);
        }else{
            output.append(last);
        }
    count = 1;
    last = input.charAt(i);
    }
    }
    if(count > 1){
    output.append(""+last+count);
    }else{
    output.append(last);
    }
     System.out.println(output.toString());
    System.out.println("-------------------------------------------------------------------------------------");


    
    class Solution {
        public int compress(char[] chars) {
            int writeIndex = 0;  // Index where we will write the compressed characters
            int readIndex = 0;   // Index to read from the original characters
            int n = chars.length;
    
            while (readIndex < n) {
                char currentChar = chars[readIndex];
                int count = 0;
    
                // Count the number of times currentChar repeats
                while (readIndex < n && chars[readIndex] == currentChar) {
                    readIndex++;
                    count++;
                }
    
                // Write the current character to the result
                chars[writeIndex++] = currentChar;
    
                // If the count is greater than 1, write the count as well
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[writeIndex++] = c;
                    }
                }
            }
    
            return writeIndex;  // Return the length of the compressed array
        }
    }
    


    }
}
