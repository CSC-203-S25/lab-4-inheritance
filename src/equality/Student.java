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

      result = result * 41 + this.prefix.hashCode();
      result = result * 41 + this.number.hashCode();
      result = result * 41 + this.enrollment;
      result = result * 41 + this.startTime.getHour();
      result = result * 41 + this.startTime.getMinute();
      result = result * 41 + this.endTime.getHour();
      result = result * 41 + this.endTime.getMinute();

      return result;
   }

   public boolean equals(Object obj) {
      if (this.getClass() != obj.getClass()) {
         return false;
      }
      CourseSection othr = (CourseSection) obj;

      return this.prefix == othr.prefix &&
              this.number == othr.number &&
              this.enrollment == othr.enrollment &&
              this.startTime.getHour() == othr.startTime.getHour() &&
              this.startTime.getMinute() == othr.startTime.getMinute() &&
              this.endTime.getHour() == othr.endTime.getHour() &&
              this.endTime.getMinute() == othr.endTime.getMinute();
   }
}
