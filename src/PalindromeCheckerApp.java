import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long end2 = System.nanoTime();
        System.out.println("\nStack Result: " + stackResult);
        System.out.println("Stack Time: " + (end1 - start1) + " ns");

        System.out.println("\nDeque Result: " + dequeResult);
        System.out.println("Deque Time: " + (end2 - start2) + " ns");

        sc.close();
    }

    static boolean stackPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    static boolean dequePalindrome(String input) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : input.toCharArray())
            dq.addLast(c);

        while (dq.size() > 1)
            if (dq.removeFirst() != dq.removeLast())
                return false;

        return true;
    }
}