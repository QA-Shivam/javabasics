package PracticeString;

public class replacevowelwithchar2 {
    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
    public static String replaceVowel(String str, String replace){
        char arr[]= str.toCharArray();
        StringBuilder sb= new StringBuilder();
        for (char c: arr){
            if (isVowel(c)){
                sb.append(replace);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceVowel("Shivam","X"));
    }
}
