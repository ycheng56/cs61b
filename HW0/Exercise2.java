public class Exercise2 {

    public static int max(int[] m) {
        int maxNum = 0;
        for (int i : m){
            if (i > maxNum){
                maxNum = i;
            }
        }    
        return maxNum;
     
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
        System.out.println(max(numbers));
     }
}
