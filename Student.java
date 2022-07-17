public class Student implements Comparable<Student>{
 
    private int id;
    private String name;
    private double cgpa;

        
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        if (o.getCgpa() != this.cgpa){
            if(this.cgpa > o.getCgpa())
                return -1;
            else
                return 1;
        } else if(!o.getName().equals(this.name) ){
            return this.name.compareTo(o.getName());
        } else {
            if(this.id > o.getId())
                return 1;
            else
                return -1;
        }
        
    }

    @Override
    public String toString()
    {
        return name + " " + id;
    }

}