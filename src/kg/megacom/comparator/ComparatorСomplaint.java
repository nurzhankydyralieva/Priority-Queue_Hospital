package kg.megacom.comparator;

import kg.megacom.classes.Hospital;

import java.util.Comparator;

public class ComparatorСomplaint implements Comparator<Hospital> {
    @Override
    public int compare(Hospital o1, Hospital o2) {
        return o1.getaСomplaint().compareTo(o2.getaСomplaint());
    }
}
