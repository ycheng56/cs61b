public class DrawTriangle {
    public static void main(String[] args) {
        drawTriangle(10);
    }

    public static void drawTriangle(int N){
        int col = 0;
        int row = 0;
        int SIZE = N;

        while (row < SIZE) {
            col = 0;
            row = row + 1;
            while (col < row) {
                System.out.print('*');
                col = col + 1;
            }
            System.out.println();
        }


    }
}
