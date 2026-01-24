package string;


/*
the simple approach to this solution would be first sort the words then compare first word with last
 */
public class findLongestCommonPrefix1 {
    public static String longetprefix(String[] words) {
       if (words.length==0 || words==null){
           return "";
       }
       if (words.length==1){
           return words[0];
       }
       String referenceWord= words[0];

       for (int charIndex=0; charIndex<referenceWord.length();charIndex++){
           char currentChar=referenceWord.charAt(charIndex);
           for (int wordIndex=1; wordIndex<words.length;wordIndex++){
               String currecntWord= words[wordIndex];
               if (charIndex>=currecntWord.length() || currentChar!=currecntWord.charAt(charIndex)){
                   return referenceWord.substring(0,charIndex);
               }
           }
       }
       return referenceWord;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "abc", "ababab", "abdbas"};
        System.out.println(longetprefix(words));
    }
}
