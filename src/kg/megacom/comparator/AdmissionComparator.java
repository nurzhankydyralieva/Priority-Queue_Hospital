package kg.megacom.comparator;

import kg.megacom.classes.Hospital;

import java.util.Comparator;

public class AdmissionComparator implements Comparator<Hospital> {

    @Override
    public int compare(Hospital o1, Hospital o2) {
       if(o1.getPatientAdmission().after(o2.getPatientAdmission())){
           return 1;
       }else if(o1.getPatientAdmission().before(o2.getPatientAdmission())){
           return -1;
       } else{
           return 0;
       }
    }

}
