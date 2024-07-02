import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Hello who are you");
    String name = myObj.nextLine();  
    System.out.println("How many minutes have you coded");
    int mins = myObj.nextInt();  
    myObj.close();
    int total = mins + 15;
    System.out.println("Hello " + name + " congratulate for codeing " + total);
  }
}