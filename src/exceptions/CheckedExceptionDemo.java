package exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
//        ced.urlTesterByTryCatch("https://wszib.edu.pl");
//        ced.urlTesterByTryCatch("httXp://wszib.edu.pl");


        ced.urlTesterByThrows("httXp://wszib.edu.pl");


//        try {
//            ced.urlTesterByThrows("httXp://wszib.edu.pl");
//        } catch (MalformedURLException e) {
//            System.out.println("Bład..." + e.getMessage());
//        }


    }

    public void urlTesterByTryCatch(String urlString) {
        try {
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("błąd: " + e.getLocalizedMessage());
//            e.printStackTrace();
        }
    }


    public void urlTesterByThrows(String urlString) throws MalformedURLException {
        URL url = new URL(urlString);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }

}
