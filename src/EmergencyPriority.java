public class EmergencyPriority {

    public static String getPriority(String condition) {
        condition = condition.toLowerCase();

        if (condition.contains("heart") || condition.contains("accident"))
            return "Critical";
        else if (condition.contains("fever") || condition.contains("infection"))
            return "Serious";
        else
            return "Normal";
    }
    public static int getPriorityValue(String priority) {
        switch (priority) {
            case "Critical": return 1;
            case "Serious": return 2;
            default: return 3;
        }
    }
}