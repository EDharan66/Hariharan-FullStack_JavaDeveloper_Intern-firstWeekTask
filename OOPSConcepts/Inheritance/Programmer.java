import java.util.HashMap;
import java.util.Map;

// create InternReport of parent class
class InternReport {

    HashMap<String, String> report = new HashMap<String, String>();

    InternReport() {
        report.put("10 AM - 10:15 AM", "Check chats & emails. Plan out the tasks to be done for the day.");
        report.put("10:15 AM - 11:15 AM", "Typing Practice / Typing test ( Friday )");
        report.put("11:15 AM - 11:30 AM", "Break");
        report.put("11:30 AM - 1:30 PM", "Working on tasks");
        report.put("1:30 PM - 2:00 PM", "Lunch");
        report.put("2:00 PM - 4:15 PM", "Working on tasks");
        report.put("4:15 PM- 4:30 PM", "Break");
        report.put("4:30 PM - 5:00 PM", "AU learning ( Learning meet on Tuesday )");
        report.put("5:00 PM - 6:00 PM", "Mondays and Wednesdays - Meet with HR");
        report.put("6:00 PM - 7:00 PM", "End of the day - Check-in call with the mentor");

    }

    void display(){
        for (Map.Entry display: report.entrySet()) {
            System.out.println(display.getKey()+" - "+display.getValue());
        }
    }

}

//programmer of child class , extends the parent class InternReport
public class Programmer extends InternReport {

    // creating main method for child class
    public static void main(String args[]) {

        //creating a object for current class
        Programmer p = new Programmer();

        System.out.println("Intern report is:");

        //child class can access the parent class
        p.display();
    }
}

/** types of inheritance
 * single
 * multilevel
 * hierarchical
 * multiple and hybrid inheritance is not supported in Java through class
 *
 * we can achieved multiple and hybrid by interface
 *
 */


/** intern report
 *
 * Check chats & emails. Plan out the tasks to be done for the day.
 * Typing Practice / Typing test ( Friday )
 * Break
 * Working on tasks
 * Lunch
 * Working on tasks
 * Break
 * AU learning ( Learning meet on Tuesday )
 * Mondays and Wednesdays - Meet with HR
 * End of the day - Check-in call with the mentor
 */