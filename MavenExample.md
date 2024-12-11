## What is Maven?
- Maven is a powerful build automation tool used primarily for Java projects.
- It simplifies project management by handling dependencies, project builds, and deployment processes.
- Maven relies on a file called pom.xml (Project Object Model), which contains the project configuration,
   dependencies, and build instructions.

**Key Features of Maven:**

**Dependency Management:** 
- Automatically downloads and manages required libraries (dependencies) from a central repository.
- Build Automation: Compiles source code, packages applications (e.g., into JAR or WAR files), and runs tests.
- Project Structure: Enforces a standard directory layout for projects, such as:

```
src/main/java   -> Java source code
src/main/resources -> Non-code resources (e.g., properties files)
src/test/java   -> Test source code
```
**Plugins:**
- Offers various plugins for compiling code, running tests, packaging applications, and more.
  
**Repository:**
- Downloads libraries from remote repositories like Maven Central and stores them locally in ~/.m2/repository.

## What is JUnit?
- JUnit is a testing framework for Java that allows developers to write and run unit tests.
- to verify the behavior of individual pieces of code.
- JUnit 5 is the latest version, consisting of three main components:

**JUnit Platform:** Provides the test runtime environment.

**JUnit Jupiter:** Contains new features and annotations for writing tests.

**JUnit Vintage:** Supports older versions (JUnit 3 and 4) for backward compatibility.

**Key Features of JUnit:**

**Annotations:** Provides clear and concise ways to define and manage tests using annotations like:

**@Test:** Marks a method as a test case.

**@BeforeEach and @AfterEach:** Run code before/after each test.

**@BeforeAll and @AfterAll:** Run code once before/after all tests.

**Assertions:** Methods to check if expected and actual values match, like assertEquals, assertTrue, etc.

**Integration:** Works seamlessly with build tools like Maven and CI/CD pipelines.

**Example**

```
pom.xml
```
**JUnit 5 dependency**
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>calculator</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

**CalculatorExample**
```
package com.example;

public class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int subtract(int a, int b)
    {
        return a - b;
    }

    public int multiply(int a, int b)
    {
        return a * b;
    }

    public int divide(int a, int b)
    {
        if (b == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
```

**Junit Test case**
```

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest
{

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd()
    {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract()
    {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply()
    {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide()
    {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivideByZero()
    {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}
```
