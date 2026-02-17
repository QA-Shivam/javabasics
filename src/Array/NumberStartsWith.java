package Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
    public static List<Integer> getNumberStartsWith(List<Integer> list){
        List<Integer> result= list.stream()
                .map(String::valueOf)
                .filter(c->c.startsWith("22"))
                .map(Integer::valueOf).collect(Collectors.toList());
        return  result;
    }
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,34,455,642,223,542,221,228);
        System.out.println(getNumberStartsWith(numbers));
    }
}
