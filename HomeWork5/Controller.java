class Controller{
    private StudentGroupService studentGroupService;
    
    public Controller(){
        this.studentGroupService = new StudentGroupService();
    }
    
    public StudentGroup createTeacherAndStudents(Teacher teacher, List<Student> students){
        return studentGroupService.createStudentGroup(teacher, students);
    }
}