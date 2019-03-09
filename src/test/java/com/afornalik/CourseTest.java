package com.afornalik;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

public class CourseTest {

    public static final String ANY_COURSE_NAME = "course name";
    private static final LocalDate ANY_START_DATE = LocalDate.of(2020,11,05);

    @Test
    public void shouldNameBeSet(){
        Course course = new Course("Java", LocalDate.now());


    }

    @Test
    public void shouldHaveTheSameName() {

        Course course = new Course(ANY_COURSE_NAME,LocalDate.now());

        String resoult = course.name();

        Assert.assertEquals(ANY_COURSE_NAME, resoult);
    }

    @Test
    public void shouldCourseBeStarted(){
        Course course1 = new Course(ANY_COURSE_NAME,ANY_START_DATE);

       Boolean result = course1.isStartedBefore(LocalDate.of(2017,11,05));

       Assert.assertFalse(result);
    }

    @Test
    public void shouldCourseNotBeStarted(){
        Course course1 = new Course(ANY_COURSE_NAME,LocalDate.now().plusDays(2));


       // Assert.assertTrue(course1.isStartedBefore());
    }


    @Test
    public void name() {
    }
}