/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * Source: https://github.com/surajr/CodingInterview/
 * Licence: MIT
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class Reverseword {
    public String reverseWords(String s) 
    {       
        char [] str = s.toCharArray();
        int i = 0;
        
        for(int j=0; j < str.length; j++)
        {
            if(str[j] == ' ')
            {
                reverse(str, i, j-1);
                i = j+1; 
            }
        }
        reverse(str, i, str.length-1);
        return new String(str);        
    }
    
    public void reverse(char [] str, int l, int r)
    {
        while( l < r )
        {
            char temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++; r--;
        }
    }

   public static void main(String[] args) {
        Reverseword rw = new Reverseword();
        System.out.println("Input: " + args[0]);
        System.out.println("Output: " + rw.reverseWords(args[0]));
   }
}

