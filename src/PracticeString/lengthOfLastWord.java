package PracticeString;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s="Hello World ";
        s=s.trim();
        int len=0;
        for (int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)!=' '){
             len++;
            }else {
                break;
            }
        }
        System.out.println(len);

    }
}
