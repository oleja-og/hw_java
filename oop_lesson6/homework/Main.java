package homework;

import homework.Model.ReportUser;
import homework.Model.Updater;
import homework.Model.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        System.out.println(user);

        Updater updater = new Updater();
        user = updater.update(user,"Is no Bob");
        System.out.println(user);

        ReportUser report = new ReportUser(user);
        report.report();
    }
}