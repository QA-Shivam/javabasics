package PracticeString;

public class DecodeStringGroupBased {
    public static String deccode(String str){
    StringBuilder result= new StringBuilder();
    StringBuilder letters=new StringBuilder();
    for (char ch:str.toCharArray()){
        if (Character.isLetter(ch)){
            letters.append(ch);
        } else if (Character.isDigit(ch)) {
            int count =ch-'0';
            for (int i=0;i<count;i++){
                result.append(letters);
            }
            letters.setLength(0); // empty the group
        }
    }
    return result.toString();
    }

    public static void main(String[] args) {
        String str="Si2v1a2";
        System.out.println(deccode(str));
    }
}
