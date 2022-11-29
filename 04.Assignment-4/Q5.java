
import java.util.Arrays;
import java.util.Locale;

public class Q5 {
    public static void main(String[] args) {

        String s1 = "raj";
        String s2 = "jar";

        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        // Function Call
        if (checkAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

    static boolean checkAnagram(char[] str1, char[] str2)
    {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

}

// output
//The two strings are anagram of each other