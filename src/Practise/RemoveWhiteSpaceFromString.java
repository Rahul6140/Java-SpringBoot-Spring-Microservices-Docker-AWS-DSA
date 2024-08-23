package Practise;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {

    //Writing own logic
    static String whiteSpaceRemoval(String str)
    {
        char[] word = str.toCharArray();
        String stringWithoutSpace = "";
        for(int i=0; i<word.length; i++)
        {
            if( (word[i] !=' ') && (word[i] !='\t'))
            {
                stringWithoutSpace = stringWithoutSpace+word[i];
            }
        }
        return stringWithoutSpace;
    }

    public static void main(String[] arg)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to remove white space : ");

        String inputString = sc.nextLine();

        System.out.println("Input String : "+inputString);

        //Using Built-in Method
        String word = inputString.replaceAll("\\s+", "");
        System.out.println("By using Built-in method : "+word);

        //By writing own logic
        String word1 = whiteSpaceRemoval(word);
        System.out.println("By writing own logic : "+word1);

    }

}
