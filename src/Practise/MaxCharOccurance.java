package Practise;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

public class MaxCharOccurance {

    private static void getCharAndCount(String str) {
        String s = str.toLowerCase().trim();
        int n = s.length();
        char ans = 0;
        int count = 0;

        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<n;i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);

            if(count<mp.get(c)){
                ans = c;
                count = mp.get(c);
            }
        }
        System.out.println("Character : "+ans);
        System.out.println("Count : "+count);
    }

    private static int getCharCount(String str, char ch){
        String s= str.toLowerCase().trim();
        int count = 0;
        count =(int) s.chars().filter(c->c==ch).count();
        return count;
    }

    private static void getCharAndCountForAll(String str) {
        Map<Character, Integer> mp = new HashMap<>();
        String s = str.toLowerCase().replaceAll("\\s", "");
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] arg){
        String str = "Rahul yadavvvv";
        getCharAndCount(str);

        //Using lambda expression to count charactor
        System.out.println("Using Lambda expression");
        char ch = 'h';
        int count = getCharCount(str, ch);
        System.out.println("Char "+ch+" count : "+count);

        System.out.println("Printing count of all characters");
        getCharAndCountForAll(str);
    }

}
