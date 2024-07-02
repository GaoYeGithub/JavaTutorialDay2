# Variables  in Java

## Display & Types of Variables 

👉 Copy this code into your coding editor in `main.py` and see what happens when you hit `run`:


```java
public class Main {
  public static void main(String[] args) {
    String name = "Gary";
    String lastName = "Gao";
    System.out.println(name);
    System.out.println("Hello " + name);
    String fullName = firstName + lastName;
  }
}
```
<details><summary>💡Hint</summary>as you can see to save a string you 
String "variables name" and "string";
To display just the variable you need to just print it however if you want to print with another string you need +

same for interger or a who number just replace String with int
</details>


```java
public class Main {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;
    System.out.println(num1 + num2);
  }
}
```
<details><summary>💡Hint</summary>And if you print it you will see the value of x + y
So other thing you might want to test out</details>


```java
public class Main {
  public static void main(String[] args) {
    int num = 15;
    num = 20;
    System.out.println(num);
  }
}
```
<details><summary>💡Hint</summary>The number to change to the new number</details>



```java
public class Main {
  public static void main(String[] args) {
    final int num = 15;
      num = 20;
    System.out.println(num);
  }
}
```

<details><summary>💡Hint</summary>It should produce 
generate error: cannot assign a value to a final variable</details>

You can also play around with other input types

```java
public class Main {
  public static void main(String[] args) {
    int myNum = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";
  }
}
```