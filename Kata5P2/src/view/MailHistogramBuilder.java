package view;

import model.Histogram;
import model.Mail;
import java.util.List;

public class MailHistogramBuilder {
    
    public MailHistogramBuilder(){}
    
    public Histogram<String> build (List<String> mails){
        Histogram<String> histogram = new Histogram();
        for (String mail : mails) {
            histogram.increment(mail);
        }
        return histogram;
    }
}
