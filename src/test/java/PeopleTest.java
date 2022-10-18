


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

    public class PeopleTest {

        @Test
        public void testAdd() {
            int expected = 1;
            People people = new People();

            people.add(new Person(2244L, "Abdullah"));
            int actual = people.count();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void testRemove() {
            int expected = 0;
            People people = new People();

            Person person = new Person(4354l, "Ali");

            people.add(person);
            people.remove(person);

            int actual = people.count();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void testFindById() {

            People people = new People();
            List<Person> personList = new ArrayList<>();

            personList.add(new Person(5655l, "Aqil"));

            people.setPerosnList(personList);

            Person expected = personList.get(0);

            Person actual = people.findById(5655l);
            Assertions.assertEquals(expected, actual);

        }
    }
