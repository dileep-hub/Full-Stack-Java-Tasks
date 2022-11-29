

public class Q8 {

    static final int ASCII_SIZE = 256;

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println("Max occurring character is "
                + getMaxOccurringChar(str));

    }

    static char getMaxOccurringChar(String str)
    {


        int count[] = new int[ASCII_SIZE];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

}

//output
//Max occurring character is l