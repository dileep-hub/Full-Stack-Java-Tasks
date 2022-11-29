
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (uniqueCharacters(s)) {

            System.out.println("True it contains unique chars");
        } else {
            System.out.println("Contain duplicates");
        }

    }

    static public boolean uniqueCharacters(String str)
    {
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;

        return true;
    }

}
//
//output
//hheh
//        Contain duplicates