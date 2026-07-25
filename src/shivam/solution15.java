package shivam;

public class solution15 {
    public static String decode(String s){
        StringBuilder result= new StringBuilder();
        StringBuilder letter= new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetter(c)){
                letter.append(c);
            }
            else if (Character.isDigit(c)){
                int count=c-'0';
                for (int i=0;i<count;i++){
                    result.append(letter);
                }
                letter.setLength(0);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="Sh2ha1ma2";
        System.out.println(decode(str));
    }
}
