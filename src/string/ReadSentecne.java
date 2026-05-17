package string;

public class ReadSentecne {
    public static void main(String[] args) {
        String str="Hello World ";
        String words[]=str.split("\\s+");
        for (String s:words){
            System.out.println(s+": " +s.length());
        }
    }
}
