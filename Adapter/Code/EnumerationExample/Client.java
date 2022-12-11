import java.util.Stack;

public class Client {

    public static void main(String[] args) {

        String[] names = {"Robert", "John", "Julie", "Lora"};
        Enumeration enumeration1 = new ArrayEnumeration(names);
        Iterator iterator1 = new EnumerationIterator(enumeration1);

        System.out.print("Names : ");

        while (iterator1.hasNext()) {

            System.out.print(iterator1.next());

            if (iterator1.hasNext())
                System.out.print(", ");

        }

        System.out.println();


        Stack <String> countries = new Stack<>();

        countries.push("India");
        countries.push("USA");
        countries.push("UK");
        countries.push("Germany");
        countries.push("Turkey");

        Enumeration enumeration2 = new StackEnumeration(countries);
        Iterator iterator2 = new EnumerationIterator(enumeration2);

        System.out.print("Countries : ");

        while (iterator2.hasNext()) {

            System.out.print(iterator2.next());

            if (iterator2.hasNext())
                System.out.print(", ");

        }

        System.out.println();


        // iterator2.remove();


    }
    

}
