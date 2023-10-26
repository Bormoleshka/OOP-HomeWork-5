class StudentGroupService{
    public StudentGroup createStudentGroup(Teacher teacher, list<Student> students){
        return new StudentGroup(teacher, students);
    }
}