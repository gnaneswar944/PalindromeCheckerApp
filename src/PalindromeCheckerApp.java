import java.util.*;
class PalindromeService{
    public boolean checkPalindrome(String input){
        input = input.toLowerCase();
        int start = 0;
        int end = input.length()-1;
        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end --;}
        return true;}}    public class PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        PalindromeService obj = new PalindromeService();
        boolean isPalindrome = obj.checkPalindrome(input);

        if(isPalindrome){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
