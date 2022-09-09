import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulars {
    public Boolean checkIP(String ip) {
        return ip.matches("^([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\." +
            "([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\.([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\.([01]?\\d\\d?|25[0-5]|2[0-4]\\d)$");
    }
}
