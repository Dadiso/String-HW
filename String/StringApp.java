
/**
 * Write a description of class StringApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringApp
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Enter a word: ");
        String s = sc.next();
        String num = new String(s);
        
        if (s.isPalindrome() == true){
            System.out.println(s.isPalindrome() + " is a paindrome.");
        }
        else{
            System.out.println(s.isPalindrome() + " is not a palindrome.");
        }
        
        System.out.println("After removing digits, the string is : " + s.removeDigits());
    }
}
