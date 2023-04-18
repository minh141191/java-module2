package day10.minitest;

import java.util.Comparator;

public class AvgComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1 instanceof Student && o2 instanceof Student) {
            if (((Student) o1).getAvgPoint() > ((Student) o2).getAvgPoint()) {
                return 1;
            } else if (((Student) o1).getAvgPoint() == ((Student) o2).getAvgPoint()) {
                return 0;
            } else {
                return -1;
            }
        } else if (o1 instanceof Student) {
            return 1;
        } else if (o2 instanceof Student) {
            return -1;
        } else {
            return 0;
        }
    }
}
