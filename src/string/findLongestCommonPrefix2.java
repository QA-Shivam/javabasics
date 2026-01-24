package string;

import java.util.Arrays;

public class findLongestCommonPrefix2 {

    public static String findLongestCommonPrefix(String [] words){
        StringBuilder result= new StringBuilder();
        Arrays.sort(words);
        char [] firstWord= words[0].toCharArray();
        char [] lastWord=words[words.length-1].toCharArray();
        for (int i=0;i<firstWord.length;i++){
            if (firstWord[i]!=lastWord[i]){
                break;
            }
            else {
                result.append(firstWord[i]);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
     String [] words= {"clip","clipboard","cold"};
        System.out.println(findLongestCommonPrefix(words));
    }
}
