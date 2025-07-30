import java.util.ArrayList;


class Student{
    int id;
    String name;
    int marks;
    public Student(int id,String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

}
public class comparatorDemo {
    public static void main(String[] args) {
         ArrayList<Student>list =new ArrayList<>();
        // Add method in list
        list.add(new Student(1,"Omkar",20));
        list.add(new Student(2,"ganesh",10));
        list.add(new Student(3,"amar",500));
        list.add(new Student(4,"daya",30));
        list.add(new Student(5,"sanket",20)); 

         list.sort((o1, o2) -> {
            if (o1.getMarks() - o2.getMarks() > 0) {
                return 1;
            } else if (o1.getMarks() - o2.getMarks() < 0) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student s: list){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
        }
        

       
    }
}
