package examples;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConverter {
    
    public DateTimeConverter(){
        System.out.println(convertTime("1647313785551"));
    }
    public String convertTime(String time){
        Date date = new Date(Long.parseLong(time));
        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
        return format.format(date);
    }
    
    public static void main(String args[]){
        new DateTimeConverter();
    }
}
