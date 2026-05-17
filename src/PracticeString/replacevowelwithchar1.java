package PracticeString;

public class replacevowelwithchar1 {
    public static void main(String[] args) {
        String str="Javaiu";
        str=str.replaceAll("(i?)[aeiou]","#");
        System.out.println(str);
    }
}
