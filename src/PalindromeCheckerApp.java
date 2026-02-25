import java.util.*;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine().toUpperCase();
        Deque<Character> deque = new LinkedList<>();
        for(char ch : str.toCharArray()){
            deque.addLast(ch);
        }
        boolean palindrome = true;
        while (deque.size() > 1){
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if(first != last){
                palindrome = false;
                break;
            }
        }
        if(palindrome)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}