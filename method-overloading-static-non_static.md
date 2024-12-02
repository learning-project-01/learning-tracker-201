### Static Method overloading 
- Method overloading is the ability to define multiple methods in the same class with the same name but different parameter lists.
- With static methods, method overloading works just like it does with instance methods, as the method signature determines which method is 
  called at compile time.
- The compiler chooses the appropriate method based on the number and type of arguments.
- All methods belong to the class (static) and can be invoked without creating an object.
- Overloading works because the methods have different parameter lists.

**example**
```java
 public class Multiplier
{

    // Non-static method to multiply two integers
    public int multiply(int a, int b)
    {
        return a * b;
    }

    // Overloaded non-static method to multiply three integers
    public int multiply(int a, int b, int c)
    {
        return a * b * c;
    }

    // Overloaded non-static method to multiply two doubles
    public double multiply(double a, double b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Multiplier multiplier = new Multiplier(); // Create an object

        // Calling different versions of the non-static 'multiply' method
        System.out.println("Multiplication of two integers: " + multiplier.multiply(5, 10)); // 50
        System.out.println("Multiplication of three integers: " + multiplier.multiply(2, 3, 4)); // 24
        System.out.println("Multiplication of two doubles: " + multiplier.multiply(5.5, 1.2)); // 6.6
    }
}
```

### Non-static method overloading
- Overloading with non-static methods works similarly to static methods. 
- However, the key difference is that these methods operate on instance variables or require an object of the class to invoke them.
- Non-static methods require an object to invoke them.
- Overloading is based on method signatures, just like with static methods.
- Non-static methods can interact with instance variables and rely on object-specific data.

**example**
```java
public class Multiplier
{

    // Non-static method to multiply two integers
    public int multiply(int a, int b)
    {
        return a * b;
    }

    // Overloaded non-static method to multiply three integers
    public int multiply(int a, int b, int c)
    {
        return a * b * c;
    }

    // Overloaded non-static method to multiply two doubles
    public double multiply(double a, double b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Multiplier multiplier = new Multiplier(); // Create an object

        // Calling different versions of the non-static 'multiply' method
        System.out.println("Multiplication of two integers: " + multiplier.multiply(5, 10)); // 50
        System.out.println("Multiplication of three integers: " + multiplier.multiply(2, 3, 4)); // 24
        System.out.println("Multiplication of two doubles: " + multiplier.multiply(5.5, 1.2)); // 6.6
    }
}
```  
