package org.ulpgc.is1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {
    private String account;

    public Email(String account) {
        setEmail(account);
    }

    public boolean isValid(String account){
        Pattern pattern = Pattern.compile("^[\\w._%+-]+@(gmail\\.com|hotmail\\.com|ulpgc\\.es|outlook\\.com)$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(account);
        return matcher.find();
    }
    public void setEmail(String account) {
        if (isValid(account)) {
            this.account = account;
        }
        else {
            System.out.println("Email no válido");
        }
    }

}
