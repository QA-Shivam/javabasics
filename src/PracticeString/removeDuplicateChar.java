package PracticeString;

public class removeDuplicateChar {
    public static void main(String[] args) {
        String string="Automation";
        boolean [] seen = new boolean[256];
        StringBuilder result= new StringBuilder();
        for (char c: string.toCharArray()){
            if(!seen[c]){
                result.append(c);
                seen[c]=true;
            }
        }
        System.out.println(result);
    }
}
