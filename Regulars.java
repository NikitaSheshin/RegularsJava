import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulars {
    public Boolean checkIP(String ip) {
        return ip.matches("^([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\." +
            "([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\.([01]?\\d\\d?|25[0-5]|2[0-4]\\d)\\.([01]?\\d\\d?|25[0-5]|2[0-4]\\d)$");
    }

    public Boolean checkGUID(String ip){
        return ip.matches("^[0-9A-Fa-f]{8}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{4}-[0-9A-Fa-f]{12}$");
    }

    public Boolean checkURL(String ip){
        return ip.matches
                ("^((http|https)?:\\/\\/(www\\.)?)?[0-9A-Za-z+~s\\/#=\\+?@%\\.][0-9A-Za-z+~s\\/\\-\\+?#=\\\\@%\\.]{0,254}[0-9A-Za-z+~s\\/\\+?#=\\\\@%\\.]\\.[a-z]{2,6}$");
    }
}
