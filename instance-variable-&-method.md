### instance variable
- An instance variable is declared within a class but outside any method, constructor, or block.
- It belongs to an object of the class.
- Every object gets its own copy of instance variables.
- Instance variables are used to store data specific to an object.

  **example**
  ```java
      public class InstanceVariableExample
      {
         // Instance variable
         String name;

         public static void main(String[] args)
          {
           // Creating objects
            InstanceVariableExample obj1 = new InstanceVariableExample();
            InstanceVariableExample obj2 = new InstanceVariableExample();

            // Assigning values to instance variables
            obj1.name = "Alice";
            obj2.name = "Bob";

           // Accessing instance variables
           System.out.println("Object 1 Name: " + obj1.name); // Output: Alice
           System.out.println("Object 2 Name: " + obj2.name); // Output: Bob
         }
      }
  
### Instance Method
- An instance method is a method that operates on instance variables of a class.
- It can access and modify instance variables.
- To call an instance method, you must create an object of the class first.

**example**
  ```java
     public class InstanceMethodExample
     {
        // Instance variable
           int age;

        // Instance method
        public void setAge(int newAge)
        {
           age = newAge; // Modifying the instance variable
        }

        public int getAge()
        {
          return age; // Accessing the instance variable
        }

        public static void main(String[] args)
        {
           // Creating an object
           InstanceMethodExample person = new InstanceMethodExample();

           // Using instance method to set age
           person.setAge(25);

           // Using instance method to get age
           System.out.println("Person's Age: " + person.getAge()); // Output: 25
        }
     }
```

### NOTE

**1.Class**
- A class is a blueprint or template for creating objects.
- It defines attributes (variables) and methods (functions) that objects of the class will have.
- A class provides structure and behavior to an object.

 **example**
 ```java
- Imagine you're an architect designing a house.
- The blueprint contains details about the structure of the house: number of rooms, size, type of windows, etc.
- However, the blueprint itself is not a house—it’s just a template for creating houses.
- Once a builder constructs houses based on the blueprint, those are the actual houses (objects).
// Class is the blueprint
public class House
{
    // Attributes (properties)
    int numberOfRooms;
    String color;

    // Method (behavior)
    void displayDetails()
    {
        System.out.println("Rooms: " + numberOfRooms + ", Color: " + color);
    }
 }

public class Main
{
    public static void main(String[] args)
    {
        // Object 1: A specific house
        House house1 = new House();
        house1.numberOfRooms = 3;
        house1.color = "Red";
        house1.displayDetails(); // Output: Rooms: 3, Color: Red

        // Object 2: Another specific house
        House house2 = new House();
        house2.numberOfRooms = 5;
        house2.color = "Blue";
        house2.displayDetails(); // Output: Rooms: 5, Color: Blue
    }
}
```
**2.Object**
- An object is an instance of a class.
- It is a real-world entity with specific values for the attributes defined in the class.
- Objects interact with each other using methods.

 **example**
 ```java
- Object (Instance): A car you drive (e.g., a red Tesla Model 3) is an object created from this prototype. Each car (object) has specific 
  values for its properties (like color and model) but follows the structure defined by the prototype (class).
// Class definition
public class Car
{
    // Attributes (properties)
    String make;
    String model;
    String color;

    // Method (behavior)
    void displayCarDetails()
    {
        System.out.println("Make: " + make + ", Model: " + model + ", Color: " + color);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Object 1: An instance of the Car class
        Car car1 = new Car();
        car1.make = "Tesla";
        car1.model = "Model 3";
        car1.color = "Red";
        car1.displayCarDetails(); // Output: Make: Tesla, Model: Model 3, Color: Red

        // Object 2: Another instance of the Car class
        Car car2 = new Car();
        car2.make = "Ford";
        car2.model = "Mustang";
        car2.color = "Blue";
        car2.displayCarDetails(); // Output: Make: Ford, Model: Mustang, Color: Blue
    }
}
```
**3.Method**
- A method is a function defined within a class.
- It defines the behavior or operations an object can perform.
- Methods can take inputs (parameters) and return a value.

  **example**
 ```java
  public class Calculator
{
    // Method to add two numbers
    int add(int a, int b)
    {
        return a + b; // Returning the sum
    }

    public static void main(String[] args)
    {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();

        // Calling the method and printing the result
        int result = calc.add(5, 10);
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}
```
**4.Constructor**
- A constructor is a special method used to initialize an object.
- It has the same name as the class and does not have a return type.
- A constructor is called automatically when an object is created.
**Types of Constructors:**
- Default Constructor: No arguments, provided by the compiler if not defined.
- Parameterized Constructor: Takes arguments to initialize object attributes.

**example**
 ```java
public class Person
{
    String name;
    int age;

    // Constructor to initialize attributes
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args)
    {
        // Creating an object using the constructor
        Person person = new Person("Alice", 30);

        // Calling the method
        person.displayDetails(); // Output: Name: Alice, Age: 30
    }
}
```
