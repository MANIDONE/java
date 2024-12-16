public class rightShift {
    public static void main(String[] args) {
        int value=8;
        int shift=2;
        int result=value>>shift;
        System.out.println(value+" value:"+Integer.toBinaryString(value));
        System.out.println(shift+" shift:"+Integer.toBinaryString(shift));
        System.out.println(result);

        System.out.println(Integer.toBinaryString(result));
    }
    
}
