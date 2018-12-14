package view;

import model.Histogram;
import model.Mail;
import java.util.List;

public class MailHistogramBuilder {
    
    public MailHistogramBuilder(){}
    
    public Histogram<String> build (List<Mail> mails){
        Histogram<String> histogram = new Histogram();
        for (Mail mail : mails) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
