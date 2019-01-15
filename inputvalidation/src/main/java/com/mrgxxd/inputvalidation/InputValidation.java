package com.mrgxxd.inputvalidation;

import android.util.Log;
import android.widget.Switch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    private static final String TAG = "MRGXXD_IV";

    private Pattern pattern;
    private Matcher matcher;

    private String lang = "ID";

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final String STRONG_PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{6}$";

    private static final String NAME_PATTERN = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

    private static final String PHONE_NUMBER_PATTERN_INDO = "^(^\\+62\\s?|^0)(\\d{3,4}-?){2}\\d{3,4}$";

    public boolean isEmail(String email){
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isStrongPassword(String password){
        pattern = Pattern.compile(STRONG_PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public boolean isName(String name){
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public boolean isPhoneNumber(String phoneNumber){
        pattern = Pattern.compile(PHONE_NUMBER_PATTERN_INDO);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean isPhoneNumber(String phoneNumber, String lang){
        pattern = Pattern.compile(getPhoneRegex(lang));
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean isMatchRegex(String string, String regex){
        try {
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(string);
            return matcher.matches();
        }catch (Exception e) {
            Log.e(TAG, "Format regex is error");
            return false;
        }
    }

    //////////////////////////////// FUNCTION FOR THIS LIBRARY //////////////////////////////////
    private String getPhoneRegex(String lang){
        String regex;
        switch (lang){
            case "ID" :
                regex = PHONE_NUMBER_PATTERN_INDO;
                Log.d(TAG, "Regex found");
                break;
            default:
                regex = PHONE_NUMBER_PATTERN_INDO;
                Log.d(TAG, "Regex not found");
                break;
        }
        return regex;
    }
}
