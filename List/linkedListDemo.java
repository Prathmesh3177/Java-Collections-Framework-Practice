import java.util.LinkedList;


public class linkedListDemo {
public static void main(String[] args) {
    LinkedList<Integer> list= new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    list.remove(1);

    list.addFirst(1);

    list.addLast(5);

    list.removeFirst();
    list.removeLast();

    
    System.out.println(list);

    
}
}

/* | **Method**                  | **Description**                                                     |
| --------------------------- | ------------------------------------------------------------------- |
| `add(E e)`                  | Adds an element to the end of the list.                             |
| `add(int index, E element)` | Inserts element at the specified position.                          |
| `addFirst(E e)`             | Adds element at the beginning of the list.                          |
| `addLast(E e)`              | Adds element at the end of the list (same as `add`).                |
| `offer(E e)`                | Inserts element at the end (returns `true` on success).             |
| `offerFirst(E e)`           | Inserts element at the beginning.                                   |
| `offerLast(E e)`            | Inserts element at the end.                                         |
| `push(E e)`                 | Pushes an element onto the front (like a stack).                    |
| `get(int index)`            | Returns element at specified index.                                 |
| `getFirst()`                | Returns first element (throws exception if empty).                  |
| `getLast()`                 | Returns last element (throws exception if empty).                   |
| `peek()`                    | Retrieves first element, returns `null` if empty.                   |
| `peekFirst()`               | Retrieves first element, returns `null` if empty.                   |
| `peekLast()`                | Retrieves last element, returns `null` if empty.                    |
| `poll()`                    | Retrieves and removes the first element, returns `null` if empty.   |
| `pollFirst()`               | Same as `poll()`.                                                   |
| `pollLast()`                | Retrieves and removes the last element.                             |
| `pop()`                     | Removes and returns the first element (like a stack).               |
| `remove()`                  | Removes and returns the first element.                              |
| `remove(int index)`         | Removes element at specified index.                                 |
| `remove(Object o)`          | Removes the first occurrence of the specified element.              |
| `removeFirst()`             | Removes and returns the first element.                              |
| `removeLast()`              | Removes and returns the last element.                               |
| `clear()`                   | Removes all elements from the list.                                 |
| `contains(Object o)`        | Returns `true` if the list contains the specified element.          |
| `indexOf(Object o)`         | Returns the index of the first occurrence of the specified element. |
| `lastIndexOf(Object o)`     | Returns the index of the last occurrence.                           |
| `set(int index, E element)` | Replaces element at the specified index.                            |
| `size()`                    | Returns number of elements in the list.                             |
| `isEmpty()`                 | Returns `true` if list has no elements.                             |
| `toArray()`                 | Returns an array containing all elements.                           |
| `toArray(T[] a)`            | Returns elements in the specified array type.                       |
| `clone()`                   | Returns a shallow copy of the LinkedList.                           |
| `equals(Object o)`          | Compares list with another object for equality.                     |
| `iterator()`                | Returns an iterator over elements.                                  |
| `listIterator()`            | Returns a list iterator.                                            |
| `listIterator(int index)`   | Returns a list iterator starting at index.                          |
| `descendingIterator()`      | Returns an iterator from last to first element.                     |
 */
