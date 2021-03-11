package kg.megacom.comparator;

import kg.megacom.classes.Hospital;

import java.util.Comparator;

public class ComparatorDoctor implements Comparator<Hospital> {
    @Override
    public int compare(Hospital o1, Hospital o2) {
        return o1.getDoctor().compareTo(o2.getDoctor());
    }
}
