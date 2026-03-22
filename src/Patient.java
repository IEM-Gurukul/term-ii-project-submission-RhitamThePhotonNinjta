import java.util.*;
public class Patient implements Runnable {
private String name;
private int age;
private String condition;
private String priority;
private int heartRate;
private String bloodPressure;
private double temperature;
private List<String> history;
public Patient(String name, int age, String condition,
  int heartRate, String bloodPressure, double temperature) {
    this.name = name;
    this.age = age;
    this.condition = condition;
    this.heartRate = heartRate;
    this.bloodPressure = bloodPressure;
    this.temperature = temperature;
    this.priority = EmergencyPriority.getPriority(condition);
    this.history = new ArrayList<>();
}
public String getName() { return name; }
public String getCondition() { return condition; }
public String getPriority() { return priority; }
public void addHistory(String record) {
    history.add(record);
}
public void display() {
    System.out.println("\nPatient: " + name);
    System.out.println("Age: " + age);
    System.out.println("Condition: " + condition);
    System.out.println("Priority: " + priority);
    System.out.println("Vitals: HR=" + heartRate +
            ", BP=" + bloodPressure +
            ", Temp=" + temperature);
    System.out.println("History: " + history);
}
@Override
public void run() {
    try {
        Thread.sleep(500);
        HospitalSystem.addPatient(this);
        System.out.println(name + " arrived and added to queue.");
    } catch (InterruptedException e) {
        System.out.println("Thread error: " + e.getMessage());
}
}
}