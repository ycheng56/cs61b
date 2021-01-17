public class Exercise3 {
    public static int max(int[] m) {
        int i = 0;
        int maxNum = 0;
        while (i < m.length) {
            if (m[i]>maxNum) {
                maxNum = m[i];
            }
            i++;
        }
        return maxNum;   
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
        System.out.println(max(numbers));
    }
}
