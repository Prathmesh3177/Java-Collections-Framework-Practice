import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList<>();
        // Add method in list
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(2);    

        /*this method add the element at that index 
        but not remove the current element 
        just shift it to next index*/
        list.add(0,3);

        //Set method in list
        //This method replace the element it removes the current element and replace it with new 
        list.set(2,9);

        //Remove method in list
        list.remove(2);
        
        

        for(int x: list){
            System.out.println(x);
        }

        //Contains Method
        System.out.println(list.contains(5));

        //Get method
        System.out.println(list.get(5));

        //This find the index of element
        System.out.println(list.indexOf(1));

        //List Size
        System.out.println("List size"+ " " + list.size());

        //Clear delete all the elements in list
        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list);

    }
}
/* 
| Method                      | Description                                 |
| --------------------------- | ------------------------------------------- |
| `add(E e)`                  | Adds an element at the end                  |
| `add(int index, E element)` | Inserts an element at a specific index      |
| `get(int index)`            | Retrieves element at the specified index    |
| `set(int index, E element)` | Replaces element at a specific index        |
| `remove(int index)`         | Removes element at the index                |
| `remove(Object o)`          | Removes the first occurrence of the element |
| `clear()`                   | Removes all elements                        |
| `size()`                    | Returns number of elements                  |
| `isEmpty()`                 | Checks if the list is empty                 |
| `contains(Object o)`        | Checks if list contains a specific element  |
| `indexOf(Object o)`         | Returns the index of first occurrence       |
| `lastIndexOf(Object o)`     | Returns the index of last occurrence        |
| `toArray()`                 | Converts list to array                      |
| `subList(int from, int to)` | Returns a view of the portion of this list  |

*/