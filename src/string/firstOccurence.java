package string;

public class firstOccurence {
    public static int firstOccurence(String str,String txt){
        if(str.contains(txt)){
            return str.indexOf(txt);
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstOccurence("GeeksForGeeks ","G"));
    }
}
