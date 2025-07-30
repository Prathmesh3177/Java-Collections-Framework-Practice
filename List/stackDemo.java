import java.util.Stack;

public class stackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();  // Stack is LIFO

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println(stack.indexOf(5));
        System.out.println(stack);

        stack.clear();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);

        stack.pop();
        
        System.out.println(stack.peek());

        System.out.println(stack);

    }
}

/*| **Method**         | **Description**                                                                                                   |
| ------------------ | ----------------------------------------------------------------------------------------------------------------- |
| `push(E item)`     | Pushes an item onto the top of the stack.                                                                         |
| `pop()`            | Removes and returns the item at the top of the stack.                                                             |
| `peek()`           | Returns the item at the top of the stack without removing it.                                                     |
| `empty()`          | Returns `true` if the stack is empty.                                                                             |
| `search(Object o)` | Returns the 1-based position of the object from the top of the stack (top = position 1). Returns -1 if not found. |
 */

 /*
                      INHERITED FORM VECTOR CLASS
 
 | **Method**                  | **Description**                                             |
| --------------------------- | ----------------------------------------------------------- |
| `add(E e)`                  | Adds an element to the end of the stack (same as `push()`). |
| `add(int index, E element)` | Inserts element at the specified index.                     |
| `get(int index)`            | Returns the element at the specified index.                 |
| `set(int index, E element)` | Replaces the element at the specified index.                |
| `remove(int index)`         | Removes element at the specified index.                     |
| `remove(Object o)`          | Removes the first occurrence of the specified object.       |
| `indexOf(Object o)`         | Returns the index of the first occurrence.                  |
| `lastIndexOf(Object o)`     | Returns the index of the last occurrence.                   |
| `clear()`                   | Removes all elements from the stack.                        |
| `size()`                    | Returns the number of elements.                             |
| `isEmpty()`                 | Checks if the stack (vector) is empty.                      |
| `toArray()`                 | Returns an array containing all elements.                   |
| `toString()`                | Returns a string representation of the stack.               |
 */