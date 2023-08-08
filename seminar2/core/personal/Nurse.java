package seminar2.core.personal;

import java.time.LocalDate;

public class Nurse extends Medpersonal implements bandage{
     public Nurse() {
    }

    public Nurse(int id, String name,LocalDate hireDate) {
        super(id, name,hireDate);
    }

    @Override
    public void bandage() {
       System.out.println(CLASS_NAME+ " перевязка проведена");
    }

}
