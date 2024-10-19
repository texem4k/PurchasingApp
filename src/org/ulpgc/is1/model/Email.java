package org.ulpgc.is1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {
    private String account;

    public Email(String account) {
        this.account = account;
    }

    public String getEmail() {
        return account;
    }

    public boolean isValid(String account){
        Pattern pattern = Pattern.compile("@gmail.com|@hotmail.com|@ulpgc.es|@outlook.com", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(account);
        return matcher.find();
    }
    public void setAccount(String account) {
        if (isValid(account)) {
            this.account = account;
        }
    }
}
