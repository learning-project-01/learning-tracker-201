public class instanceVariable
{
    String name;

    public static void main(String[] args)
    {
        // Creating objects
        instanceVariable obj1 = new instanceVariable();
        instanceVariable obj2 = new instanceVariable();

        // Assigning values to instance variables
        obj1.name = "Alice";
        obj2.name = "Bob";

        // Accessing instance variables
        System.out.println("Object 1 Name: " + obj1.name); // Output: Alice
        System.out.println("Object 2 Name: " + obj2.name); // Output: Bob
    }
}
