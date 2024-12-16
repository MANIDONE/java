 class nextgreater {
    public static void main(String args []){
        int num1[]={2,3,4,1};
        int nums2[]={4,6,2,5,1,-1,0,3};
       int res[] = nextGreaterElement(num1,nums2);
       for (int i : res) {
        System.out.println(i);
       }
      
            }
            public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                 
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            result[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        result[i] = -1;
                    }
                    break; 
                }
            }
        }
        
        return result;
    }
}