import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Deque<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());


        while (!queue.isEmpty()) {
            Person s = queue.peek();
            if (s.numberOfTickets > 0) {
                System.out.println(s.name + " " + s.surname + " прокатился");
                s.numberOfTickets -= 1;
                if (s.numberOfTickets != 0) {
                    queue.offerLast(s);
                } else {
                    queue.remove(s);
                }
            }
            queue.remove(s);
        }
    }

    static List<Person> generateClients() {

        Person person = new Person("Artem", "Aseev", 5);
        Person person1 = new Person("Tanya", "Kolobkova", 3);
        Person person2 = new Person("Masha", "Xolod", 4);
        Person person3 = new Person("Oleg", "Rubcov", 2);
        Person person4 = new Person("Kolya", "Petuxov", 6);

        List<Person> list = new ArrayList<>();

        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        return list;
    }
}
