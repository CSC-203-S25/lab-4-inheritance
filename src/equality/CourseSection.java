package equality;
import java.time.LocalTime;

public class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

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

      if (this.prefix == null || othr.prefix == null ||
              this.startTime == null || othr.startTime == null ||
              this.endTime == null || othr.endTime == null) {
         return false;
      }
      return this.prefix == othr.prefix &&
              this.number == othr.number &&
              this.enrollment == othr.enrollment &&
              this.startTime.getHour() == othr.startTime.getHour() &&
              this.startTime.getMinute() == othr.startTime.getMinute() &&
              this.endTime.getHour() == othr.endTime.getHour() &&
              this.endTime.getMinute() == othr.endTime.getMinute();
   }
}
