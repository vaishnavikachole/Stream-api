import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream);

        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        String name[] = {"Durgesh","Amit","Ankit","Divya"};

        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e->{
            System.out.println(e);
        });

//        Stream stream3 = (Stream) Arrays.stream(new int[]{2,4,68,44,55});
//        stream3.forEach(e ->
//            System.out.println(e));

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(78);
        list2.add(90);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> System.out.println(e));




    }
}
