import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Enter a String:");
        String input = sc.nextLine();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        boolean palindrome = true;
        for(char c : input.toCharArray()){

                if(c != stack.pop()) {
                    palindrome = false;
                    break;
                }
            }
            if(palindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");

    }
}
