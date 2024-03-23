//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(10,"Hello");

        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        pair.setFirst(20);
        pair.setSecond("world");

        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());

        System.out.println("");

        DataContainer<String> stringContainer = new DataContainer<>();
        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        String fruit = stringContainer.get(1);
        stringContainer.remove(1);
        System.out.println("Fruit at index 1:" + fruit);

        System.out.println("Size of container: " + stringContainer.getSize());




    }
}