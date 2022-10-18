
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class InstructorTest{

        @Test
        public void testImplementation() {
            Instructor instructor = new Instructor(12345, "aqil");

            Boolean expectedResponse = instructor instanceof Teacher;

            Boolean actualRepsonse = expectedResponse;

            Assertions.assertEquals(expectedResponse, actualRepsonse, "Testing implementation");
        }


        @Test
        public void testInheritance() {
            Instructor instructor = new Instructor(45555, "ali");

            Boolean expectedResponse = instructor instanceof Person;

            Boolean actualResponse = expectedResponse;

            Assertions.assertEquals(expectedResponse, actualResponse);
        }

        @Test
        public void testTeach() {
            Instructor instructor = new Instructor(33344, "Aqil");
            Student student = new Student(1222, "Hamza");
            double expectedHours = 23;

            instructor.teach(student, 23);

            double actualHours = student.getTotalStudyTime();
            Assertions.assertEquals(expectedHours, actualHours);
        }

        @Test
        public void testLecture() {
            Instructor instructor = new Instructor(3432, "Samir");
            Student student1 = new Student(89898, "Mo");
            double expectedHours = 24;

            Learner[] learners = {student1};
            instructor.lecture(learners, 24);
            double actualHours = student1.getTotalStudyTime();
            Assertions.assertEquals(expectedHours, actualHours, "Testing learner method");

        }

    }
