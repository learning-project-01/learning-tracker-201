### Types of Operators in Java
- Arithmetic Operators
- Relational (Comparison) Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators
- Unary Operators
- Ternary (Conditional) Operator
- Instanceof Operator
### **1. Arithmetic Operators**
Used for mathematical calculations.
Operator	Description	Example
+	Addition	int sum = a + b;
-	Subtraction	int diff = a - b;
*	Multiplication	int prod = a * b;
/	Division	int div = a / b;
%	Modulus (remainder)	int rem = a % b;
Example:

java
Copy code
int a = 10, b = 3;
System.out.println(a + b);  // Output: 13
System.out.println(a % b);  // Output: 1
2. Relational (Comparison) Operators
Used to compare two values.

Operator	Description	Example
==	Equal to	a == b
!=	Not equal to	a != b
>	Greater than	a > b
<	Less than	a < b
>=	Greater than or equal to	a >= b
<=	Less than or equal to	a <= b
Example:

java
Copy code
int a = 5, b = 10;
System.out.println(a < b);  // Output: true
3. Logical Operators
Used to combine multiple conditions.

Operator	Description	Example
&&	Logical AND	(a > b) && (c > d)
`		`
!	Logical NOT	!(a > b)
Example:

java
Copy code
int a = 5, b = 10, c = 15;
System.out.println((a < b) && (c > b));  // Output: true
System.out.println(!(a > b));           // Output: true
4. Bitwise Operators
Used to perform bit-level operations.

Operator	Description	Example
&	Bitwise AND	a & b
`	`	Bitwise OR
^	Bitwise XOR	a ^ b
~	Bitwise Complement	~a
<<	Left Shift	a << 2
>>	Right Shift	a >> 2
Example:

java
Copy code
int a = 5, b = 3;
System.out.println(a & b);  // Output: 1 (0101 & 0011 = 0001)
5. Assignment Operators
Used to assign values to variables.

Operator	Description	Example
=	Assign	a = 10;
+=	Add and assign	a += b;
-=	Subtract and assign	a -= b;
*=	Multiply and assign	a *= b;
/=	Divide and assign	a /= b;
%=	Modulus and assign	a %= b;
Example:

java
Copy code
int a = 10, b = 5;
a += b;  // Equivalent to a = a + b
System.out.println(a);  // Output: 15
6. Unary Operators
Operate on a single operand.

Operator	Description	Example
+	Positive	+a
-	Negative	-a
++	Increment	a++ or ++a
--	Decrement	a-- or --a
!	Logical NOT	!a
Example:

java
Copy code
int a = 5;
System.out.println(++a);  // Output: 6
System.out.println(a--);  // Output: 6 (then a becomes 5)
7. Ternary (Conditional) Operator
Shorthand for if-else.

Syntax	Description
condition ? value1 : value2	If condition is true, use value1; otherwise, use value2.
Example:

java
Copy code
int a = 5, b = 10;
int max = (a > b) ? a : b;
System.out.println(max);  // Output: 10
8. instanceof Operator
Checks if an object is of a specific type.

Example:

java
Copy code
String s = "Hello";
System.out.println(s instanceof String);  // Output: true
Summary Table
Operator Type	Purpose
Arithmetic	Perform math operations
Relational	Compare two values
Logical	Combine conditions
Bitwise	Work at the binary level
Assignment	Assign values
Unary	Operate on single operands
Ternary	Shorthand conditional logic
instanceof	Type-checking for objects
