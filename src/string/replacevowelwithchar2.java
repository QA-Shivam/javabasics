package string;

public class replacevowelwithchar2 {
    public static String replaceVowel(String str,String replacewith){
        char [] arr= str.toLowerCase().toCharArray();
        StringBuilder sb= new StringBuilder();
        for (char c : arr){
            if (isvowel(c)){
                sb.append(replacewith);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static void main(String[] args) {
        System.out.println(replaceVowel("Shivam","X"));
    }
}
