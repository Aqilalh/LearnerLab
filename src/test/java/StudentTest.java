
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testImplemention(){
        //given
        Student student = new Student();
        //when
        Boolean expectedReposnse = student instanceof Learner;
        //then
        Boolean actualResponse = expectedReposnse;
        Assertions.assertEquals(expectedReposnse,actualResponse,"testing implementation");
    }

    @Test
    public void testInheritance(){
        Student student = new Student();

        Boolean expectedBoolean = student instanceof Person;

        Boolean actualBoolean = expectedBoolean;
        Assertions.assertEquals(expectedBoolean,actualBoolean, "Testing Inheritance");

    }

    @Test
    public void testLearn(){
        //given
        Double expectedHours = 5.0;
        //when
        Student student = new Student(23444,"Aqil");
        //then
        student.learn(expectedHours);

        Double actual = student.getTotalStudyTime();

        Assertions.assertEquals(expectedHours,actual);

    }

}