public class Main{
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.setTeacherid(1);
        
        List<Student> students = List.of(
            new Student(1),
            new Student(2),
            new Student(3)
            );
            
            Controller controller = new Controller();
            StudentGroup studentGroup = controller.createStudentGroup(teacher, students);
            System.out.println("Teacher id:" + studentGroup.getTeacher().getTeacherid());
            for (Student students : studentGroup.getStudent()){
                System.out.println("Student id:" + students.getStudentid());
            }
    }
}