package string;

public class replacevowelwithchar1 {
    public static String  replacevowel(String str, String with){
    return  str.replaceAll("(?i)[aeiou]",with);
    }
    public static void main(String[] args) {
        System.out.println(replacevowel("Automation","*"));
    }
}
