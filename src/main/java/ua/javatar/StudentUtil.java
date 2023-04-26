package ua.javatar;

public class StudentUtil {

    private StudentUtil(){}

    public static String adjustName(String name) {
        if (name == null || name.isBlank()) {
            return "";
        }
        String trimmedName = name.trim().toUpperCase();
        if (trimmedName.length() > 1) {
            trimmedName = trimmedName.charAt(0) + trimmedName.substring(1).toLowerCase();
        }

        return trimmedName;
    }
}
