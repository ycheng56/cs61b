/* Drawing a Triangle */
public  class DrawingATriangle {
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int SIZE = 5;

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