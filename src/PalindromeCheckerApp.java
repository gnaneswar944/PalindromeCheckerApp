import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }
        boolean palindrome = true;
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                palindrome = false;
                break;
            }
        }
        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
        sc.close();
    }
}