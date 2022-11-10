public class Q5 {
    public static void main(String[] args) {

        int n=14;
        int nh=n/2;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i<=nh && j<nh-i  ||
                    i>=nh && j<=i-nh+1  ||
                    i==0 || i==n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

//below is the output

// input = 14
// output

//        **************
//        ******
//        *****
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******
//        **************