public class Reverseword {
    public String reverseWords(String s, String delimiters) {       
        char[] str = s.toCharArray();
        int i = 0;
        
        for (int j = 0; j < str.length; j++) {
            if (delimiters.indexOf(str[j]) != -1) {
                reverse(str, i, j - 1);
                i = j + 1; 
            }
        }
        reverse(str, i, str.length - 1);
        return new String(str);        
    }
    
    public void reverse(char[] str, int l, int r) {
        while (l < r) {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++; 
            r--;
        }
    }

   public static void main(String[] args) {
        Reverseword rw = new Reverseword();
        String delimiters = " ";
        if (args.length >= 2) {
            delimiters = args[1];
        }
        System.out.println("Input: " + args[0]);
        System.out.println("Output: " + rw.reverseWords(args[0], delimiters));
   }
}