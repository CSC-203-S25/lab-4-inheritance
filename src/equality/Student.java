package equality;

import java.util.List;
import java.util.Objects;

public class Student
{
   private String name;
   private final int age;
   private final List<CourseSection> currentCourses;

   public Student(final String name, final int age,
      final List<CourseSection> currentCourses)
   {
      this.name = name;
      this.age = age;
      this.currentCourses = currentCourses;
   }

   // TODO: equals and hashCode methods for Student

   public int hashCode()
   {
      int result = 1;

      result = result * 41 + this.name.hashCode();
      result = result * 41 + this.age;
      result = result * 41 + this.currentCourses.hashCode();
      return result;

   }

   public boolean equals(Object obj) {
      if (this.getClass() != obj.getClass()) {
         return false;
      }
      Student other = (Student) obj;

      return this.name == other.name &&
              this.age == other.age &&
              this.currentCourses == other.currentCourses;
   }
}
