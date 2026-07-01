package PracticeString;

public class DecodeStringCharBased {
    public static String decode(String str){
        StringBuilder result=new StringBuilder();
        StringBuilder letters= new StringBuilder();
        for (char c:str.toCharArray()){
            if (Character.isLetter(c)){
                letters.append(c);
            } else if (Character.isDigit(c)) {
                int count =c-'0';
                result.append(letters);
                char lastchar=letters.charAt(letters.length()-1);
                for (int i=1;i<count;i++){
                    result.append(lastchar);
                }
                letters.setLength(0);
            }
        }
        result.append(letters);
        return result.toString();
    }

    public static void main(String[] args) {
        String s="sh2i1ve2k";
        System.out.println(decode(s));
    }
}
