package view;

import model.Mail;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MailListReader {
    
    public MailListReader(){}
    
    public List<Mail> read(String fileName) throws IOException{
        List<Mail> mails = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader(fileName))) {
            String token;
            while((token = input.readLine()) != null) {
                if(token.matches(".+@(.+[.].+)")){
                    mails.add(new Mail(token));
                }
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return mails;
    }
    
}