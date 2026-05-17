package PracticeString;

public class reverseWordsOfSentence {

    public static String reverseWords(String str){
        String words[]= str.trim().split("\\s+");
        for (int i=0;i<words.length;i++){
            char []word=words[i].toCharArray();
            int left=0;
            int right=word.length-1;
            while (left<right){
                char temp=word[left];
                word[left]=word[right];
                word[right]=temp;
                left++;
                right--;
            }
            words[i]= new String(word);
        }
        return String.join(" ",words);
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
