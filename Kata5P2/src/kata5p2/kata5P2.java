package kata5p2;

import java.io.IOException;
import view.MailListReader;
import model.Mail;
import view.MailHistogramBuilder;
import model.Histogram;
import java.util.List;
import view.HistogramDisplay;

public class kata5P2 {
    
    static List<String> listMails;
    static Histogram c;
    
    public static void main(String[] args) throws IOException{
        input();
        process();
        output();
    }
    

    
    public static void input() throws IOException{
        MailListReader a = new MailListReader();
        listMails = a.read("jdbc:sqlite:Kata5.db", "EMAIL");
    }
    
    public static void process(){
        MailHistogramBuilder b = new MailHistogramBuilder();
        c = b.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(c).execute();
    }
}
