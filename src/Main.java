import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the name:");
        String name=scanner.nextLine();
        System.out.println("Enter the age:");
        Integer age=scanner.nextInt();
        Person myInfo=new Person(name, age);
        System.out.println("Name:"+myInfo.getName());
        System.out.println("Age:"+myInfo.getAge());
    }
}