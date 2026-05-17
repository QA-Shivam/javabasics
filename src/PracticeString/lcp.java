package PracticeString;

import java.util.Arrays;

public class lcp {
    public static String lcp(String[] lcp){
        StringBuilder sb=new StringBuilder();
        Arrays.sort(lcp);
        char[]fw= lcp[0].toCharArray();
        char[]lw=lcp[lcp.length-1].toCharArray();
        for (int i=0;i<fw.length;i++){
            if (fw[i]!=lw[i]){
                break;
            }else {
                sb.append(fw[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] words= {"clip","clipboard","cli"};
        System.out.println(lcp(words));
    }
}
