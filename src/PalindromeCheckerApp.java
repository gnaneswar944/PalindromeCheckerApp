import java.util.*;
public class PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        input = input.toLowerCase();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : input.toCharArray()){
            list.add(c);

        }
        boolean isPalindrome = true;
        while(list.size() > 1){
            if(!list.removeFirst().equals(list.removeLast())){
                isPalindrome = false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
