 class Windowing {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 3;
        int sum = 0;
        int max;

        for (int j = 0; j < k; j++) {
            sum += a[j];
        }

        max = sum;

        for (int j = k; j < a.length; j++) {
            sum += a[j] - a[j - k]; 
            max = Math.max(sum, max);
        }

        System.out.println("Maximum sum of a window of size " + k + ": " + max);
    }
}
