import java.util.Scanner;
public class Hospital {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        try {
            System.out.print("\nEnter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Disease (fever/injury/heart): ");
            String cond = sc.nextLine();
            System.out.print("Enter Priority (normal/critical): ");
            String priority = sc.nextLine();
            System.out.println("Select Doctor:");
            System.out.println("1. Dr. Arijit Deb ( Dentist )");
            System.out.println("2. Dr. Suranjan Kuila ( Cardiologist )");
            System.out.println("3. Dr. MD.Arman.Ali ( Neurology )");
                int choice = sc.nextInt();
                sc.nextLine();
                Doctor d;
        switch (choice) {
            case 1:
                d = new Doctor("Dr. Arijit Deb");
                break;
            case 2:
                d = new Doctor("Dr. Suranjan Kuila");
                break;
            case 3:
                d = new Doctor("Dr.MD.Arman.Ali");
                break;
            default:
                throw new IllegalArgumentException("Invalid Doctor Choice");
        }
                Patient p = new Patient(name, cond, priority);
                d.treatPatient(p);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
            System.out.print("\nAdd another patient? (yes/no): ");
            String again = sc.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                break;
         }
     }
     System.out.println("\nSystem Closed");
    }
}