package Test;

import Utility.Gmail;

public class sendGmails {

    public static void main(String[] args) {

        String userName = "";//your email user name
        String password = "";//your email password

        String[] Receiver = {};//receiver's email adress

        String Subject = "Aylin Bekem";//subject
        String MSG = "Testing// You are so patient:0)";//message

        int times = 5;//decide how many times we sent
        int count=1;//count the each time
        while (times > 0) {//number of times that we send the email
            for (String each : Receiver) {//we can sent emails to multiple people

                Gmail.sendEmails(userName, password, each, Subject, MSG);
            }
            System.out.println("Sent "+count+" times ");
            times--;
        }
    }

}



