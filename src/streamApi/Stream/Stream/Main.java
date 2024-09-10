import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {

    List<String> mensages = new ArrayList<>();

    mensages.add("Tomorrow is gonna be fun");
    mensages.add("I have to study for exams");


    // Using lambda expression
    mensages.forEach(mesage-> System.out.println(mesage));

    //Using the reference method to instantiate an arbitrary object
    mensages.forEach(System.out::println);

}
