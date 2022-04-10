package org.milan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

    public static void printDuplicateChar(String str){
        if (str == null) {
            System.out.println("NULL STRING!");
            return;
        }
        if(str.length() == 1){
            System.out.println("ONLY ONE CHARACTER");
            return;
        }
        if (str.isEmpty()){
            System.out.println("EMPTY STRING!");
            return;
        }
        // LOGIC
        // FIRST CONVERT IT INTO TOCHARARRAY
        char[] words = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (Character ch : words){
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet =  map.entrySet();
        for (Map.Entry<Character,Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
    public static void main(String[] args) {

        String str = "java";
        printDuplicateChar(str);
    }
}
