package com.mrgxxd.inputvalidation;

public class InputValidation {

    private static final String TAG = "MRGXXD_IV";

    public boolean isEmail(String email){
        return email.contains("@");
    }
}
