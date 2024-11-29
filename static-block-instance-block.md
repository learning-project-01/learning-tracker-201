### Static Block
- The static block is used to initialize a static variable.
- The static block runs only once, when the class is loaded.
- You don't need to create an object of the class for the static block to execute.
### Note
#### **class is loadded:**
- The .class file is read by the JVM, and its bytecode is loaded into memory.
- This is the step where the static block is executed.
- If the class has static variables or static methods, they are also initialized at this stage.
- It is referenced for the first time (e.g., creating an object or calling a static method).
- The program starts execution and encounters the class in the main method.

#### **Class is Linked:**
- The JVM verifies the class bytecode (for correctness and security).
- Resolves references to other classes.

### **Class is Initialized:**
- The static variables are assigned their values.
- The static blocks (if any) are executed once during this step.
---
### Instance Block
- An instance block is used for initializing instance variables or executing code during the creation of an object.
- It runs every time an object of the class is created, before the constructor.
- To initialize instance variables.
- To provide additional logic during object creation before the constructor is called.
