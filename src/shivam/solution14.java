package shivam;

public class solution14 {
    public static String decode(String s){
        StringBuilder result= new StringBuilder();
        StringBuilder letters= new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetter(c)){
                letters.append(c);
            }
            if (Character.isDigit(c)){
                int count= c-'0';
                char lastletter=letters.charAt(letters.length()-1);
                result.append(letters);
                for (int i=1;i<count;i++){
                    result.append(lastletter);
                }
                letters.setLength(0);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="shi1v2am2";
        System.out.println(decode(str));
    }
}
