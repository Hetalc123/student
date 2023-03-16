import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        System.out.println("Details");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String sr = sc.nextLine();
        System.out.println("Roll number");
        int rn = sc.nextInt();
        System.out.println("Enter marks");
        System.out.println("Maths");
        int m1 = sc.nextInt();
        System.out.println("English");
        int m2 = sc.nextInt();
        System.out.println("History");
        int m3 = sc.nextInt();
        int Total = m1+m2+m3;
        System.out.println("Total marks");
        System.out.println(Total);
    }
}