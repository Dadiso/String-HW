/**
 * Write a description of class MyString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyString
{
    private String string;

    /**
     * Constructor for objects of class MyString
     */
    public MyString(String s)
    {
        // initialise instance variables
        this.string = s;
    }
    
    public String getString(){
        return string;
    }
    
    public String setString(){
        return string;
    }

    public boolean isPalindrome(){
        int i = 0, reverse = string.length()-1 ;
        while (i < reverse){
            if (string.charAt(i) == string.charAt(reverse)){
                return true;
                i++;
                reverse--;
            }
        }
        return false;
    }
    
    public String removeDigits(){
        int i;
        String result = "";
        for (i=0; i<string.length(); i++){
            if (!Character.isDigit(string.charAt(i))){
                result = result + string.charAt(i);
            }
        }
        return result;
    }
}
