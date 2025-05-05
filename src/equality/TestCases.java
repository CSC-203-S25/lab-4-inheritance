package equality;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.time.LocalTime;
import java.util.List;

import org.junit.Test;

public class TestCases
{
   @Test
   public void testExercise1()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertTrue(one.equals(two));
      assertTrue(two.equals(one));
   }

   @Test
   public void testExercise2()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(1, 10), LocalTime.of(2, 0));

      assertFalse(one.equals(two));
      assertFalse(two.equals(one));
   }

   @Test
   public void testExercise3()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));
      final CourseSection two = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 40), LocalTime.of(11, 0));

      assertEquals(one.hashCode(), two.hashCode());
   }

   @Test
   public void testExercise4()
   {
      final CourseSection one = new CourseSection("CSC", "203", 35,
         LocalTime.of(9, 10), LocalTime.of(10, 0));
      final CourseSection two = new CourseSection("CSC", "203", 34,
         LocalTime.of(9, 10), LocalTime.of(10, 0));

      assertNotEquals(one.hashCode(), two.hashCode());
   }

   // TODO: Write test cases for equals and hashCode in Student.
   //    What would convince you that those methods are working as expected?

   @Test
   public void testExercise5() {
      List<CourseSection> courses1 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      List<CourseSection> courses2 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      Student s1 = new Student("Ross", 20, courses1);
      Student s2 = new Student("Ross", 20, courses2);
      assertTrue(s1.equals(s2));
      assertTrue(s2.equals(s1));
      assertEquals(s1.hashCode(), s2.hashCode());

   }
   @Test
   public void testExercise6() {
      List<CourseSection> courses1 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      List<CourseSection> courses2 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      Student s1 = new Student("Ross", 20, courses1);
      Student s2 = new Student("Arjan", 20, courses2);
      assertFalse(s1.equals(s2));
      assertFalse(s2.equals(s1));
      assertNotEquals(s1.hashCode(), s2.hashCode());

   }

   @Test
   public void testExercise7() {
      List<CourseSection> courses1 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      List<CourseSection> courses2 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      Student s1 = new Student("Ross", 20, courses1);
      Student s2 = new Student("Ross", 21, courses2);
      assertFalse(s1.equals(s2));
      assertFalse(s2.equals(s1));
      assertNotEquals(s1.hashCode(), s2.hashCode());

   }

   @Test
   public void testExercise8() {
      List<CourseSection> courses1 = Arrays.asList(
              new CourseSection("CSC", "202", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "141", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      List<CourseSection> courses2 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      Student s1 = new Student("Ross", 20, courses1);
      Student s2 = new Student("Ross", 20, courses2);
      assertFalse(s1.equals(s2));
      assertFalse(s2.equals(s1));
      assertNotEquals(s1.hashCode(), s2.hashCode());

   }

   public void testExercise9() {
      List<CourseSection> courses1 = Arrays.asList(
              new CourseSection("CSC", "202", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "141", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      List<CourseSection> courses2 = Arrays.asList(
              new CourseSection("CSC", "203", 35,
                      LocalTime.of(9, 40), LocalTime.of(11, 0)),
              new CourseSection("MAT", "101", 50,
                      LocalTime.of(8,  0), LocalTime.of(9, 15))
      );

      Student s1 = new Student("Ross", 20, courses1);
      Student s2 = s1;
      assertTrue(s1.equals(s2));
      assertFalse(s1.equals(null));
   }
}
