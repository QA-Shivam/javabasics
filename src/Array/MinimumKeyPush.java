package Array;

/*
It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters.
The keys can be remapped to any amount of letters, but each letter must be map ped to exactly one key. You need to find the
minimum number of times the keys will be pushed to type the string word.
 */


public class MinimumKeyPush {
    public static void main(String[] args) {
        String word="sjkdndyum";
        int length=word.length();
        int countPush=0;
        for (int i=0;i<length;i++){
            countPush=countPush+(i/8)+1;
        }
        System.out.println(countPush);
    }
}
