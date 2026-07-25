package PracticeString;

public class DecodeString {

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        StringBuilder letters=new StringBuilder();
        StringBuilder result= new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetter(c)){
                letters.append(c);
            } else if (Character.isDigit(c)) {
                int count= c-'0';
                result.append(letters);

            }
        }
    }
}
