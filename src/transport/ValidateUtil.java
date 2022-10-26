package transport;

public class ValidateUtil {
    public static String validateString(String value) {
        if (value!=null && !value.isEmpty() && !value.isBlank()) {
            return value;
        }else{
            return "Incorrect entry";
        }
    }

    public static int validateInt(int value) {
        if (value > 0) {
            return value;
        } else {
            return 0;
        }
    }
}
