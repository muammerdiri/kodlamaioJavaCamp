package business.concrete;

import business.abstracts.CourseService;
import core.log.abstracts.ILog;
import dataAccess.abstracts.IHibernateCourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {

    private IHibernateCourseDao iHibernateCourseDao;
    private List<Course> list;
    private ILog logger;

    public CourseManager(IHibernateCourseDao iHibernateCourseDao, List<Course> list, ILog logger) {
        this.iHibernateCourseDao = iHibernateCourseDao;
        this.list = list;
        this.logger = logger;
    }

    @Override
    public void add(Course course) throws Exception {
        if(course.getPrice()<=0){
            throw new Exception("Course price cannot be 0(zero)!");
        }
        for (Course c:list){
            if(c.getCourseName().equals(course.getCourseName()))
                throw new Exception("Course names cannot be the same!");
            else if (c.getCategoryId() == course.getCategoryId())
                throw  new Exception("Category name cannot be the same");

        }
        iHibernateCourseDao.add(course);
        list.add(course);
        logger.log();
    }

    @Override
    public void delete(Course course) {
        iHibernateCourseDao.delete(course);
    }

    @Override
    public void update(Course course) {
        iHibernateCourseDao.update(course);
    }

    @Override
    public List<Course> getAll() {
        return iHibernateCourseDao.getAll();
    }
}
