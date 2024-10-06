package Practise;

public class Palindrome {

    public static void checkPalindrome(String word){
        String a = word.toLowerCase();
        if(isPalindrome(a)){
            System.out.println("The String provided is Palindrome");
        }else{
            System.out.println("The String provided is not Palindrome");
        }

    }
    public static boolean isPalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args){
        String word = "Radar";
        checkPalindrome(word);
    }
}
