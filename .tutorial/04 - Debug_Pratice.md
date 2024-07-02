# Common Error


When playing with variables and inputs the most commen error is inputing somthing like string into a int method however there also other possable problem try and fix this

```java
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Username");
    String userName = myObj.nextLine();  
    System.out.println("Password");

    System.out.println("Username is " + userName);
    System.out.println("Password is " + userPass);

  }
}
```


<details> <summary> 👀 Answer </summary>

```java
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Username");
    String userName = myObj.nextLine();  
    System.out.println("Password");
    String userPass = myObj.nextLine();  

    System.out.println("Username is " + userName);
    System.out.println("Password is " + userPass);

    }
}
```

</details>

