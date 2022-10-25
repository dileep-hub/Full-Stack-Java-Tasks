public class Q1 {
    public static void main(String[] args) {


        int n =10;
        int nh=n/2;

        for(int i=0; i<n; i++) {

            // I
            for(int j=0; j<n; j++) {
                if(i==0 && j < nh ||
                   j==nh/2  ||
                   i==n-1 && j<nh)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // N
            for(int j=0; j<n; j++) {
                if(j==0 ||
                    i==j || j==n-1)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // E
            for(int j=0; j<n; j++) {
                if(j==2 ||
                    i==0 && j>2 && j<n-2 ||
                    i==nh && j>2 && j<n-2 ||
                    i==n-1 && j>2 && j<n-2)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // U
            for(int j=0; j<n; j++) {
                if(j==1 || j== (3*n)/4 ||
                    i==n-1 && j>=1 && j<= (3*n)/4)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // R
            for(int j=0; j<n; j++) {
                if(j==0 ||
                    i==0 && j<nh ||
                    i==nh && j<nh ||
                    i>0 && i<nh && j==nh ||
                    i-j == nh)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // O
            for(int j=0; j<n; j++) {
                if(i==0 && j< (3*n)/4 ||
                    j==0 || j== (3*n)/4 ||
                    i==n-1 && j<(3*n)/4)     {
                    System.out.print("*");
                } else System.out.print(" ");
            }

            // N
            for(int j=0; j<n; j++) {
                if(j==0 ||
                        i==j || j==n-1)  {
                    System.out.print("*");
                } else System.out.print(" ");
            }


            System.out.println();
        }


    }
}


// output
//      *****     *        *  ******   *     *  *****     ********  *        *
//        *       **       *  *        *     *  *    *    *      *  **       *
//        *       * *      *  *        *     *  *    *    *      *  * *      *
//        *       *  *     *  *        *     *  *    *    *      *  *  *     *
//        *       *   *    *  *        *     *  *    *    *      *  *   *    *
//        *       *    *   *  ******   *     *  *****     *      *  *    *   *
//        *       *     *  *  *        *     *  **        *      *  *     *  *
//        *       *      * *  *        *     *  * *       *      *  *      * *
//        *       *       **  *        *     *  *  *      *      *  *       **
//      *****     *        *  ******   *******  *   *     ********  *        *
