package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    
    String mail;
    
    public Mail (String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        Pattern p = Pattern.compile("\\@(.+[.].+)");
        Matcher m = p.matcher(mail);
        m.find();
        return m.group();
    }
}
