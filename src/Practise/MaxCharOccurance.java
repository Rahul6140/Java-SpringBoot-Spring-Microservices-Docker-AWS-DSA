package Practise;

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
    public static void main(String[] arg){
        String str = "Rahul yadavvvv";
        getCharAndCount(str);
    }

}
