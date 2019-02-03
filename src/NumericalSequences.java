public class NumericalSequences {
    public static void main(String[] args) {

        oddNumbersOne(20);
        System.out.println();
        SequenceTwo(20);
        System.out.println();
        SequenceThree(10);
        System.out.println();
        SequenceFour(20);
    }


    private static void oddNumbersOne(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf(i + ", ");
            }
        }
    }
    private static void SequenceTwo(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf(100 * i + ", " + 10 * i + ", ");
        }
    }

    private static void SequenceThree(int n) {
        for(int i = 0; i <= n; i+=2 ){
            System.out.printf(i+ ", ");
        }for(int i = n-2; i >= 0; i-=2){
            System.out.printf(i + ", ");
        }
    }

    private static void SequenceFour(int n) {
            int[] a = new int[n];
            a[0] = 1;
            a[1] = 1;
            System.out.print(a[0] + ", " + a[1] + ", ");
            for ( int i = 2; i < n; i++){
                a[i] = a[i-1] + a[i-2];
                System.out.print(a[i] + ", ");
            }

        }
}
