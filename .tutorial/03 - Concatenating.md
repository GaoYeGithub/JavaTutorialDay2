# Concatenating

Concatenating might seem like a big and diffcult however it super simple in fact you aleardy done in the course

```java
public class Main {
  public static void main(String[] args) {
    String name = "Gary";
    String lastName = "Gao";
    System.out.println("Hello " + name);
    String fullName = firstName + lastName;
  }
}
```

Yes that it fusing two different string together in concating

## The fancy way

```java
public class Main {
  public static void main(String[] args) {
    String firstName = "John ";
    String lastName = "Doe";
    System.out.println(firstName.concat(lastName));
  }
}
```

This is part of the string method something we will learn more later however all .concat() is connect the the first word and the second word