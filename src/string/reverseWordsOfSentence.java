package string;

public class reverseWordsOfSentence {

    public static String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
       for (int i=0;i<words.length;i++){
            char [] arr= words[i].toCharArray();
            int left=0;
            int right=arr.length-1;
            while (left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            words[i] = new String(arr);
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
