import java.util.concurrent.CopyOnWriteArrayList;

class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Safe iteration even if modified
        for (String fruit : list) {
            System.out.println(fruit);
            if (fruit.equals("Banana")) {
                list.remove("Banana");  // No ConcurrentModificationException!
            }
        }

        System.out.println("After iteration: " + list);
    }
}

//same methods as ArrayList