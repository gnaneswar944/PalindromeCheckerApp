import java.util.*;
public class PalindromeCheckerApp{
    private static boolean Check(String s,int start ,int end){
        if(start >= end){
            return true;
        }
        if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)) ){
            return false;
        }
        return Check(s,start +1,end -1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        boolean isPalindrome = Check(input,0,input.length()-1);
        if(isPalindrome){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
