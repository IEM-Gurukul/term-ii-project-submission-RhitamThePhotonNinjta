public class Doctor {
    String docName;
    Doctor(String docName) {
        this.docName = docName;
    }
 public void treatPatient(Patient p) {
        System.out.println("\n Doctor " + docName + " is checking " + p.getName());
    Treatment t;
      if (p.getPriority().equalsIgnoreCase("critical")) {
            System.out.println(" Critical Condition! Sending to Emergency...");
            t = new Surgery();
     } else {
            if (p.getCond().equalsIgnoreCase("fever")) {
                t = new Medicine();
            } else if (p.getCond().equalsIgnoreCase("injury")) {
                t = new FirstAid();
            } else {
                t = new Treatment();
            }
        }
        t.treat(p);
    }
}