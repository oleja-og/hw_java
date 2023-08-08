package seminar2.core.personal;

import java.time.LocalDate;

import seminar2.core.clients.owners.Owner;

public class Doctor extends Medpersonal implements operation{
    public Doctor() {
    }

    public Doctor(int id, String name,LocalDate hireDate) {
        super(id, name,hireDate);
    }

    @Override
    public void operation() {
         System.out.println(CLASS_NAME+ " провел операцию успешно");

    }
}
