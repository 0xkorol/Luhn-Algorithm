package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {

    public static void main(String[] args) {

        String xml = "<html>as aks sk  a d</html>";
        String stringPattern = "<html>(.*?)</html>";
        Pattern pattern = Pattern.compile(stringPattern);

        Matcher matcher = pattern.matcher(xml);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
