package org.kurkundi.solutions.collections;

import java.util.HashMap;

public class CountOccurenceInString {
    public static void main(String[] args){
        String str = "This is Vijay learning the Java from the scratch";
        char[] arr = String.join(" ",str).toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char a: arr) {
            if(!hashMap.containsKey(a)){
                hashMap.put(a,1);
            }
            else {
                int i=hashMap.get(a);
                i++;
                hashMap.put(a,i);
            }
        }
        System.out.println(hashMap);

    }
}
