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