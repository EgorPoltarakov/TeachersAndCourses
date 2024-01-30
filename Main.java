package HomeWork;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Teacher teacher1 = new Teacher("Stanislav Demichev", 26);
        Teacher teacher2 = new Teacher("Igor Chernigovskih", 60);
        Teacher teacher3 = new Teacher("Egor Poltarakov", 22);


        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        Course course1 = new Course("Developing", 15);
        Course course2 = new Course("Mathematik", 15);
        Course course3 = new Course("OOP", 75);
        Course course4 = new Course("Filosophy", 100);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher1.deleteCourse(course2);
        teacher1.addCourse(course3);
        teacher1.showInfo();

        course2.refactorCourse("History", 150);

        teacher2.addCourse(course2);
        teacher2.addCourse(course4);
        teacher2.showInfo();

        teacher3.refactorTeacher("Egorik Poltarakov", 24);

        Teacher.showAllTeachers(teachers);
        Course.showAllCourses(courses);

    }
}