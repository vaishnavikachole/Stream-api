import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
            public static void main(String[] args) {
                List<Integer> list = List.of(2, 4, 8, 55, 67, 99);
//        list.add(6);
                System.out.println(list);

                List<Integer> list2 = Arrays.asList(12, 45, 78, 99, 100, 63);
                System.out.println(list2);

                List<Integer> listEven = new ArrayList<>();
                for (int i : list) {
                    if (i % 2 == 0) {
                        listEven.add(i);
                    }
                }
                System.out.println(listEven);

                // stream api
                Stream<Integer> stream = list.stream();

                //filter // we can add filter map and other methods on stream object.
                List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
                System.out.println(newList);

                List<Integer> list3 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); //method chaining
                System.out.println(list3);

                List<Integer> newList2 = list2.stream().filter(a -> a > 70).collect(Collectors.toList());
                System.out.println(newList2);


            }
    }
