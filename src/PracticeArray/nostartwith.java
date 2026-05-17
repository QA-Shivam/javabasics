package PracticeArray;

import java.util.Arrays;

public class nostartwith {
    public static void main(String[] args) {
        int [] arr={2,34,455,642,223,542,221,228};
      int res[]=  Arrays.stream(arr).mapToObj(String::valueOf).filter(x->x.startsWith("22"))
                .mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(res));
    }
}
