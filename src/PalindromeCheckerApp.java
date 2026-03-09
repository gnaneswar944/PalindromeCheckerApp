import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();

        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        int choice = sc.nextInt();
        PalindromeStrategy strategy;
        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();
        boolean result = strategy.check(input);
        if (result)
            System.out.println("palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
interface PalindromeStrategy{
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy{
    public boolean check(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
            stack.push(c);

        for(char c : input.toCharArray())
            if(c != stack.pop())
                return false;

        return true;
    }
}
class DequeStrategy implements PalindromeStrategy{
    public boolean check(String input){
        Deque<Character> dq = new ArrayDeque<>();
        for(char c : input.toCharArray())
            dq.add(c);

        while(dq.size() > 1)
            if(dq.removeFirst() != dq.removeLast())
                return false;

        return true;
    }
}