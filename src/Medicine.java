public class Medicine extends Treatment {
    public void treat(Patient p) {
        System.out.println("Providing medicines to " + p.getName());
        p.addHistory("Medicine given");
    }

}
