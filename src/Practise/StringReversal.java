package Practise;

public class StringReversal {

    //Recursion Method for String reversal
    static String recursiveMethod(String word)
    {
        if(word == null || word.length()<=1){
            return word;
        }

        return recursiveMethod(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] arg){

        String word = "Rahul";

        //StringBuffer method
        StringBuffer s1 = new StringBuffer(word).reverse();
        System.out.println("With StringBuffer : "+s1);

        //StringBuilder Method
        StringBuilder s2 = new StringBuilder(new StringBuilder(word).reverse());
        System.out.println("With StringBuilder : "+s2);

        //Iterative Method
        char[] str = word.toCharArray();
        System.out.print("With iterative method : ");
        for(int i = word.length()-1; i>=0; i--)
        {
            System.out.print(str[i]);
        }

        System.out.println();

        //Recursive Method
        System.out.println("With Recursive method : "+recursiveMethod(word));

    }
}
