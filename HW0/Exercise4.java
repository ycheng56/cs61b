public class Exercise4 {

    public static void windowPosSum(int[] a, int n) {
        int sum_value;
        for (int i=0; i < a.length; i++) {
            sum_value = 0;
            if (a[i]<=0) {
                continue;
            }
            int j = i;
            while (j<=i+n && j<a.length){
                sum_value += a[j];
                j++;
            }
            a[i] = sum_value;
        }
    }
    
      public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
      }

}
