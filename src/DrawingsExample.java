public class DrawingsExample {
    public static void main(String[] args) {
        drawDiagonal();
        System.out.println();
        drawTwo();
        System.out.println();
        drawThree();
        System.out.println();
        drawFour();
    }


    private static void drawDiagonal() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = '*';
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


    private static void drawTwo() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    a[i][j] = '*';
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    private static void drawThree() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5) {
                    a[i][j] = '*';
                } else if (j == 0 || j == 5) {
                    a[i][j] = '*';
                } else {
                    a[i][j] = ' ';
                }
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }

    private static void drawFour() {
        char[][] a = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == i) {
                    a[i][j] = '*';
                }else if(j == 5 - i){
                    a[i][j] = '*';
                }else{
                    a[i][j] = ' ';
                }
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
