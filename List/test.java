import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student{
    int id;
    String name;
    double marks;
    
    public Student(int id, String name, double marks){
        this.id=id;
        this.name=name;
        this.marks= marks;

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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    
    
}
public class test {
    public static void main(String[] args) {

        List<Student>studentsData= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i =0; i<n;i++){
            System.out.println("Enter student Id: ");
            int id=sc.nextInt();
            sc.nextLine();
           
            System.out.println("Enter student name: ");
            String name= sc.nextLine();

            System.out.println("Enter student marks: ");
            double marks = sc.nextDouble();

            studentsData.add(new Student(id, name, marks));



        }
        sc.close();
       
        for(Student x: studentsData){
            System.out.println("ID:"+x.getId()+"\t"+"Name: "+x.getName()+"\t"+"Marks: "+x.getMarks());
        }
    }
}
