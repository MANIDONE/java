public class second_larg {
    public static void main(String[] args) {      
        int[] arr = {1,2,4,5,6,8};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) 
            System.out.println("There is no second largest element.");
         else
            System.out.println("The second largest element is: " + second);
    }
}