import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People {
    private List<Person> perosnList = new ArrayList<>();

    public List<Person> getPerosnList() {
        return perosnList;
    }

    public void setPerosnList(List<Person> perosnList) {
        this.perosnList = perosnList;
    }

    public void add(Person person) {
        perosnList.add(person);
    }

    public Person findById(Long id) {
        for (Person i : perosnList) {
            Long x = i.getId();
            if (x.equals(id)) {
                return i;
            }
        }
        return null;
    }

    public Boolean contains(Person person) {
        return perosnList.contains(person);
    }


    public void remove(Person person) {
        perosnList.remove(person);
    }

    public void remove(Long id) {
        for (Person x : perosnList) {
            if (x.getId() == id) {
                perosnList.remove(x);
            }
        }
    }

    public void removeAll() {
        perosnList.clear();
    }

    public int count() {
        return perosnList.size();
    }

    public Person[] toArray() {
        return perosnList.toArray(new Person[0]);
    }

    public Iterator<Person> iterator() {
        return perosnList.iterator();
    }
}
