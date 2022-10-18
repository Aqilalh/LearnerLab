import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testConstructor(){
        //given
        long expectedId = 45555555;
        String expectedName = "Aqil";
        //when
        Person person = new Person(expectedId,expectedName);
        //then
        long actualId = person.getId();
        String actualName = person.getName();
        Assertions.assertEquals(expectedId,actualId,"Testing id");
        Assertions.assertEquals(expectedName,actualName,"Testing name");
    }

    @Test
    public void testSetName(){
        //given
        String expectedName = "aqil";
        //when
        Person person = new Person(expectedName);
        //then
        String actualName = person.getName();
        Assertions.assertEquals(expectedName,actualName,"Testing set name");
    }


}

