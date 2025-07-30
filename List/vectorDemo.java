import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer>list = new Vector<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(0);

        System.out.println(list);



    }
}

/*| **Method**                                     | **Description**                                                     |
| ---------------------------------------------- | ------------------------------------------------------------------- |
| `add(E e)`                                     | Appends the specified element to the end of this vector.            |
| `add(int index, E element)`                    | Inserts the element at the specified position.                      |
| `addAll(Collection<? extends E> c)`            | Appends all elements from the given collection.                     |
| `addAll(int index, Collection<? extends E> c)` | Inserts all elements at the specified position.                     |
| `addElement(E obj)`                            | Adds the specified component to the end (legacy method).            |
| `capacity()`                                   | Returns the current capacity of the vector.                         |
| `clear()`                                      | Removes all elements from the vector.                               |
| `contains(Object o)`                           | Returns `true` if the vector contains the specified element.        |
| `containsAll(Collection<?> c)`                 | Returns `true` if vector contains all elements of the collection.   |
| `copyInto(Object[] anArray)`                   | Copies elements into the specified array (legacy method).           |
| `elementAt(int index)`                         | Returns the element at the specified index (legacy method).         |
| `elements()`                                   | Returns an enumeration of elements (legacy iteration).              |
| `ensureCapacity(int minCapacity)`              | Increases capacity if needed.                                       |
| `equals(Object o)`                             | Compares vector with another object.                                |
| `firstElement()`                               | Returns the first element.                                          |
| `get(int index)`                               | Returns the element at the specified index.                         |
| `indexOf(Object o)`                            | Returns the index of the first occurrence.                          |
| `indexOf(Object o, int index)`                 | Returns the index of the first occurrence from the specified index. |
| `insertElementAt(E obj, int index)`            | Inserts element at specified position (legacy method).              |
| `isEmpty()`                                    | Returns `true` if vector has no elements.                           |
| `lastElement()`                                | Returns the last element.                                           |
| `lastIndexOf(Object o)`                        | Returns index of the last occurrence.                               |
| `lastIndexOf(Object o, int index)`             | Returns the index of last occurrence before the given index.        |
| `remove(int index)`                            | Removes the element at the specified position.                      |
| `remove(Object o)`                             | Removes the first occurrence of the element.                        |
| `removeAll(Collection<?> c)`                   | Removes all elements in the specified collection.                   |
| `removeAllElements()`                          | Removes all elements (legacy method).                               |
| `removeElement(Object obj)`                    | Removes the first occurrence (legacy method).                       |
| `removeElementAt(int index)`                   | Deletes element at specified index (legacy method).                 |
| `retainAll(Collection<?> c)`                   | Retains only elements in the specified collection.                  |
| `set(int index, E element)`                    | Replaces element at specified index.                                |
| `setElementAt(E obj, int index)`               | Sets the element at given index (legacy method).                    |
| `setSize(int newSize)`                         | Sets the size of the vector. If increased, nulls are added.         |
| `size()`                                       | Returns the number of elements.                                     |
| `subList(int fromIndex, int toIndex)`          | Returns a view of the portion of the list.                          |
| `toArray()`                                    | Returns array containing all elements.                              |
| `toArray(T[] a)`                               | Returns typed array.                                                |
| `toString()`                                   | Returns string representation.                                      |
| `trimToSize()`                                 | Trims capacity to current size.                                     |
 */
