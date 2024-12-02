### 1. For Index Loop using 1d-array
***Example**
```java
public class ForIndexLoop {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println("Using for index loop:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
```
### 1. While Index Loop 
***Example**
```java
public class WhileIndexLoop {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println("Using while index loop:");
        int index = 0;
        while (index < intArray.length) {
            System.out.println(intArray[index]);
            index++;
        }
    }
}
```
### 1. Do While Index Loop 
***Example**
```java
public class DoWhileIndexLoop {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println("Using do-while index loop:");
        int index = 0;
        do {
            System.out.println(intArray[index]);
            index++;
        } while (index < intArray.length);
    }
}
```
### 1. For Each Loop  
**Explanation**
- he for-each loop (or enhanced for loop) in Java is a simplified version of the for loop.
- It is specifically designed to iterate over collections like arrays, ArrayList,
   or other data structures without the need to manage an index manually.
- The for-each loop extracts one element at a time from the collection and assigns it to the variable.
- The loop continues until all elements have been processed.
- No need for managing an index (i) or worrying about ArrayIndexOutOfBoundsException.
  
**Syntax**
```
for (datatype variable : collection)
{
    // Body of the loop
}
```
**Program**
```
public class FilterStringArray
{
    public static void main(String[] args)
    {
        String[] names = {"biswa", "jit", "soumya", "raja", "siba"};

        System.out.println("Names with length greater than 3:");
        for (String name : names)
        {
            if (name.length() > 3)
            {
                System.out.println(name);
            }
        }
    }
}
//op-biswa,soumya,raja,siba
```
