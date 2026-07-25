package shivam;

import java.util.Arrays;

public class solution8 {

    public static String lcp(String[]str){
        StringBuilder sb= new StringBuilder();
        Arrays.sort(str);
        String fw=str[0];
        String lw=str[str.length-1];
        for (int i=0;i<fw.length();i++){
            if (fw.charAt(i)!=lw.charAt(i)){
                break;
            }
            sb.append(fw.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] words= {"clip","clipboard","cli"};
        System.out.println(lcp(words));
    }
}
