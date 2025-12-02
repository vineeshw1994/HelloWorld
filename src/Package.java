import java.util.Scanner;

 class Package {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
         System.out.println("Enter you name");
          String name = sc.nextLine();
          System.out.println("Enter you age");
          int age = sc.nextInt();
          System.out.println("Hi " + name + "Your now at " + age);
     }
}
