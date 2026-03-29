public class Patient {
 private String name;
 private String cond;
 private String priority;
    public Patient(String name, String cond, String priority) {
        this.name = name;
        this.cond = cond;
        this.priority = priority;
    }
  public String getName() {
        return name;
    }
  public String getCond() {
        return cond;
    }
 public String getPriority() {
        return priority;
    }
}