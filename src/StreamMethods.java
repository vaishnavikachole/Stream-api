import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args)
    {
        List<String> names = List.of("Aman","Ankita","Ravi","Ravina","Aasha");
        //map
         List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        List<Integer> numbers = List.of(23,1,45,67,8,90,78,89);
        List<Integer> num = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(num);

        //for each

        names.stream().forEach(
                e ->{
                    System.out.println(e);
                }
        );

        names.stream().forEach(System.out::println);
        names.stream().sorted().forEach(System.out::println); //sorted
        Integer numberMin =  numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(numberMin);

        Integer numberMax = numbers.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println(numberMax);







    }
}
