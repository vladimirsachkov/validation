package com.achadigitaltask.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean idDocValidation (String code) {
        String regex = "^[A-z][\\w_]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code != null ? code : "");
        return matcher.matches();
    }
}
