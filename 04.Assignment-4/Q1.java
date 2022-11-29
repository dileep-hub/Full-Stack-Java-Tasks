
// Remove Duplicates from the String
public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(remDup(s));
		
	}
	
	public static String remDup(String str) {

        char[] ch = str.toCharArray();

        String res = "" + ch[0];


        for(int i=1; i<str.length(); i++) {
            Boolean flag = true;
            for(int j=0; j<i; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                res += str.charAt(i);
            }
        }

        return res;

    }

}
