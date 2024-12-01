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
  . Stores data unique to each object.
  . Example: In a class Student, name and rollNumber can be instance variables to store details of each student.
 
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

 . Example: A method getDetails() can return a Student's name and roll number.

### ***NOTE***

**1.Class**
- A class is a blueprint or template for creating objects.
- It defines attributes (variables) and methods (functions) that objects of the class will have.
- A class provides structure and behavior to an object.

 **example**
 ```java
     
---
**2.Object**
**2.Method**
**3.Constructor**
