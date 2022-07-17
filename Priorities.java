import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Priorities {

    public static void main(String[] args) {
        int nEvents;
        

        System.out.print("Insert number of events: ");

        Scanner sc = new Scanner(System.in);

        nEvents = Integer.valueOf(sc.nextLine());
        List<String> events = new ArrayList<String>(nEvents);

        for(int i = 0; i < nEvents; i++){
            String event = sc.nextLine();

            if(event.toUpperCase().equals("SERVED") || event.split(" ")[0].toUpperCase().equals("ENTER")){
                events.add(event);
            } else {
                    boolean valid = false;
                    while(!valid){
                        System.out.println("incorrect event");
                        System.out.println("Insert a correct event(SERVED or ENTER): ");
                        event = sc.nextLine();
                        if(event.toUpperCase().equals("SERVED") || event.split(" ")[0].toUpperCase().equals("ENTER")){
                            events.add(event);
                            valid = true;
                        }
                    }
                    
            }
        }
        
        System.out.println(getStudents(events));
    }

    static List<Student> getStudents(List<String> events){
        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < events.size(); i++) {
            String event = events.get(i);
            if(event.toUpperCase().equals( "SERVED")){
                if(students.size() > 0){
                    students.remove(0);
                }
            } else {
                Student student = new Student(Integer.valueOf(event.split(" ")[3]), event.split(" ")[1], Double.valueOf(event.split(" ")[2]));
                students.add(student);
                Collections.sort(students);
            }
        }  

        return students;
    }
    

}
