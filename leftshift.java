public class leftshift {
    public static void main(String[] args) {
        int value=3;
        int shift=2;
        int result=value<<shift;
        System.out.println("value:"+Integer.toBinaryString(value));
        System.out.println("shift:"+Integer.toBinaryString(shift));
        System.out.println(result);

        System.out.println(Integer.toBinaryString(result));
    }
    
}
