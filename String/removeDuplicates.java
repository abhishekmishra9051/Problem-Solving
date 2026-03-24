package in5Minutes;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharacter {

    public static void main(String[] args){
        String str = "Programming";

        // Approach 1: Using Java Streams
        StringBuffer sb = new StringBuffer();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println("Approach 1: " + sb);

        // Approach 2: Check indexOf for duplicates
        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int inx = str.indexOf(ch, i+1);
            if(inx == -1) sb1.append(ch);
        }
        System.out.println("Approach 2: " + sb1);

        // Approach 3: Nested loop for duplicates
        char[] arr = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            boolean repeated = false;
            for(int j = i+1; j < str.length(); j++){
                if(arr[i] == arr[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated) sb2.append(arr[i]);
        }
        System.out.println("Approach 3: " + sb2);

        // Approach 4: Using HashSet
        StringBuilder sb3 = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));
        for(Character c : set)
            sb3.append(c);
        System.out.println("Approach 4: " + sb3);
    }
}