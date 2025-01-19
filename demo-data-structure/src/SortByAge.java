import java.util.Comparator;

public class SortByAge implements Comparator<DemoPQ.Person> {
    @Override
    public int compare(DemoPQ.Person p1, DemoPQ.Person p2) {
        return p1.getAge() > p2.getAge() ? -1 : 1;

    }

}
