package string;

public class countMatchingPattern {
    public static int countMatchWithoutOverlap(String str, String pattern){
        if (str==null || str.isEmpty() ||pattern==null){
            return 0;
        }
        int index=0;
        int matches=0;
        while (true){
            int foundAt = str.indexOf(pattern,index);
            if (foundAt==-1){
                break;
            }
            matches++;
            index=foundAt+pattern.length();
        }
        return matches;
    }

    public static int countMatchWithOverlap(String str, String pattern) {
        if (str == null || str.isEmpty() || pattern == null) {
            return 0;
        }
        int match = 0;
        for (int i=0;i<=str.length()-pattern.length();i++){
            if (str.startsWith(pattern,i)){
                match++;
            }
        }
        return match;
    }

    public static void main(String[] args) {
        System.out.println(countMatchWithOverlap("111","11"));
    }
}
