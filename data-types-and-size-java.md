In java data types are devided into two main catagories
### **1. primitive Data Type**
- Primitive Data Types :Java has 8 primitive data types. Each type has a fixed size (platform-independent) to 
  maintain consistency across all systems.

**byte**             
- Stores small integers (-128 to 127). **size :** 1 byte (8 bits).
-**example**: byte a = 10;

**short**
- Stores medium integers (-32,768 to 32,767). **size :** 2 bytes (16 bits).
- **example**: short a = 32000;

**int**
- Stores large integers (-2^31 to 2^31-1). **size :** 	4 bytes (32 bits).
- **example**: int c = 100000;

**long**
-	Stores very large integers (-2^63 to 2^63-1). **size :** 	8 bytes (64 bits).
-	**example**: long d = 100000L;

**float**
- Stores fractional numbers, single-precision. **size :** 	4 bytes (32 bits).
-	**example**: float e = 5.75f;

**double**
- Stores fractional numbers, double-precision. **size :** 	8 bytes (64 bits).
- **example**: double f = 19.99;

**char**  
- Stores a single character (Unicode). **size :**  2 bytes (16 bits).
- **example**: char g = 'A';

**boolean** 
- Stores true/false values. **size :** 1 bit.
- **example**: boolean h = true;

---

### **2. Non-Primitive Data Types**
- These include classes, arrays, interfaces, and more. They don’t have fixed sizes as they depend on the 
  implementation and content.
- Non-primitive data types, also known as reference types.They don't store actual data directly; instead, they 
  store a reference (memory address) to the data. The actual data resides in a specific memory location (the 
  heap).
  
- **example**:
- **Classes**: A class is a blueprint for creating objects.It can include fields (variables) and methods 
  (functions).
  
- **Arrays**: An array is a collection of elements of the same data type.The size of the array depends on the 
  number of elements it holds.
  
- **Interfaces**: An interface is like a contract. It defines a set of methods that a class must implement but 
  doesn’t provide the method's actual code.It is used for achieving abstraction and multiple inheritance.
  
- **Strings**: Strings are objects in Java, even though they behave like primitive types.A string represents a 
  sequence of characters.
  
- **Wrapper Classes**: Each primitive type has a corresponding wrapper class (e.g., Integer for int, Double for 
  double). Wrapper classes allow primitives to be treated as objects, which is useful in collections like 
  ArrayList.
