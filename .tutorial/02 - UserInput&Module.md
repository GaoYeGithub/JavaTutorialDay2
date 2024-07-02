# User Input and Using Module

Java has a many feature and module like scanner that allow the user to add inputs

```java
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter Input");
    String userName = myObj.nextLine();  
    myObj.close();
    System.out.println("Input is " + userName);
  }
}
```

If everything works as expected your console should allow you to input any string

here are more type you can play around with

|   Method             |                 Description                 |
|   :---:              |                    :---:                    |
|   nextBoolean()	     |     Reads a boolean value from the user     |
|   nextByte()		     |     Reads a byte value from the user        |
|   nextDouble()		   |     Reads a double value from the user      |
|   nextFloat()			   |     Reads a float value from the user       |
|   nextInt()			     |     Reads a int value from the user         |
|   nextLine()			   |     Reads a String value from the user      |
|   nextLong()			   |     Reads a long value from the user        |
|   nextShort()			   |     Reads a short value from the user       |

```java
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, age and salary:");

    String name = myObj.nextLine();
    int age = myObj.nextInt();
    double salary = myObj.nextDouble();
    myObj.close();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}
```