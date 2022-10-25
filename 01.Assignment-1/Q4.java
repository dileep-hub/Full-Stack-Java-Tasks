public class Q4 {
    public static void main(String[] args) {


        int m=14;
        int n = m-1;
        int nh = n/2;

        for(int i=0; i<n;i++) {
            for(int j=0; j<n; j++) {
                if(i>=nh && j<=i-nh  ||
                    i>=nh && (j>= (n- (i-nh) -1))  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int k=1;
        while(k<m) {
            System.out.print("*");
            k++;
        }

    }
}


//input = 14
//output






//        *           *
//        **         **
//        ***       ***
//        ****     ****
//        *****   *****
//        ****** ******
//        *************
//        *************

