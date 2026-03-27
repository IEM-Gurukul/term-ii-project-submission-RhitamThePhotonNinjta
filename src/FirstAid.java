public class FirstAid {
       public void treat(Patient p) {
        System.out.println("Providing first aid to " + p.getName());
        p.addHistory("First Aid given");
    }
}
