package kg.megacom.classes;

import kg.megacom.enums.Doctors;

import java.util.Date;
import java.util.Random;

public class Hospital implements Comparable<Hospital> {
    private Date patientAdmission;
    private String gender;
    private String aСomplaint;
    private int yearOfBirth;
    private Doctors doctor;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Hospital(Date patientAdmission, String gender, String aСomplaint, int yearOfBirth, Doctors doctor, int ID) {
        this.patientAdmission = patientAdmission;
        this.gender = gender;
        this.aСomplaint = aСomplaint;
        this.ID = new Random().nextInt(100);
        this.doctor = doctor;
        this.yearOfBirth = yearOfBirth;
    }

    public Hospital() {
    }

    public Date getPatientAdmission() {
        return patientAdmission;
    }

    public void setPatientAdmission(Date patientAdmission) {
        this.patientAdmission = patientAdmission;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getaСomplaint() {
        return aСomplaint;
    }

    public void setaСomplaint(String aСomplaint) {
        this.aСomplaint = aСomplaint;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "patientAdmission=" + patientAdmission +
                ", gender='" + gender + '\'' +
                ", aСomplaint='" + aСomplaint + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", doctor=" + doctor +
                '}';
    }

    @Override
    public int compareTo(Hospital o) {
        return 0;
    }
}
