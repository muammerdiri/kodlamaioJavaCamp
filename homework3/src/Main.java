import business.abstracts.CourseService;
import business.concrete.CourseManager;
import core.log.concrete.FileLogger;
import dataAccess.concrete.HibernateCourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Course> courses =new ArrayList<>();
        courses.add(new Course(1, 1, 2, "c# geliştirici kursu", 100));
        courses.add(new Course(2, 1, 3, "Java geliştirici kursu", 130));
        courses.add(new Course(3, 1, 1, "Javascript geliştirici kursu", 200));


        CourseService courseService = new CourseManager(new HibernateCourseDao(),courses,new FileLogger());
        courseService.add(new Course(4, 1, 4, "Python geliştirici kursu", 122));
    }
}