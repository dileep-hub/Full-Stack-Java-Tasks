public class Q3 {
    public static void main(String[] args) {

        int n = 14;
        int nh = (n)/2;


        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {

                if((i<nh) && j<=(nh)-i-1 ||
                        (i<nh) && (j>= (nh+i)) ||
                        (i>=0 && i<n && j==0) ||
                        (i==n-1 ) || (j==n-1) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}


// input=14
// output
//        * * * * * * * * * * * * * *
//        * * * * * *     * * * * * *
//        * * * * *         * * * * *
//        * * * *             * * * *
//        * * *                 * * *
//        * *                     * *
//        *                         *
//        *                         *
//        *                         *
//        *                         *
//        *                         *
//        *                         *
//        *                         *
//        * * * * * * * * * * * * * *

//input=10
//
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        *                 *
//        * * * * * * * * * *