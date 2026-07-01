package PracticeString;

public class DecodeStringGroupBased {
    public static String deccode(String str){
        StringBuilder result= new StringBuilder();
        StringBuilder letters=new StringBuilder();
        for (char c: str.toCharArray()){
            if (Character.isLetter(c)){
                letters.append(c);
            } else if (Character.isDigit(c)) {
                int count= c-'0';
                for (int i=0;i<count;i++){
                    result.append(letters);
                }
                letters.setLength(0);
            }
        }
        result.append(letters);
        return result.toString();
    }

    public static void main(String[] args) {
        String str="Si2v1a2i";
        System.out.println(deccode(str));
    }
}
