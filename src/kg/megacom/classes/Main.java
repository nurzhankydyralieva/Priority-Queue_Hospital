package kg.megacom.classes;

import kg.megacom.comparator.*;
import kg.megacom.enums.Doctors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number from 1 till 5 ");
        int order = scan.nextInt();
        PriorityQueue<Hospital> patientQueue = new PriorityQueue<>(new AdmissionComparator());
        patientQueue.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-10-1999 22:00"), "Man", "Stomach ache", 1988, Doctors.GASTROENTEROLOGIST, 1));
        patientQueue.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("10-05-2000 21:00"), "Woman", "Broken arm", 1985, Doctors.TRAUMATOLOGIST, 2));
        patientQueue.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("06-10-1999 20:00"), "Man", "Heart attack", 1980, Doctors.CARDIOLOGIST, 2));
        patientQueue.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-06-2010 22:00"), "Woman", "Fever heat", 1970, Doctors.THERAPIST, 3));
        patientQueue.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("08-03-1989 05:00"), "Man", "Headache", 1983, Doctors.NEUROPATHOLOGIST, 2));
        patientQueue.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("07-10-1985 05:00"), "Woman", "Examination", 2000, Doctors.THERAPIST, 5));
        for (Hospital i : patientQueue) {
            System.out.println(i);
        }
        PriorityQueue<Hospital> patientQueueTwo = new PriorityQueue<>(new YearComparator());
        patientQueueTwo.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-10-1999 22:00"), "Man", "Stomach ache", 1985, Doctors.GASTROENTEROLOGIST, 1));
        patientQueueTwo.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("10-05-2000 21:00"), "Woman", "Broken arm", 1982, Doctors.TRAUMATOLOGIST, 1));
        patientQueueTwo.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("06-10-1999 20:00"), "Man", "Heart attack", 1980, Doctors.CARDIOLOGIST, 3));
        patientQueueTwo.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-06-2010 22:00"), "Woman", "Fever heat", 1981, Doctors.THERAPIST, 4));
        patientQueueTwo.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("08-03-1989 05:00"), "Man", "Headache", 1975, Doctors.NEUROPATHOLOGIST, 5));
        patientQueueTwo.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("07-10-1985 05:00"), "Woman", "Examination", 1970, Doctors.THERAPIST, 5));

        PriorityQueue<Hospital> patientQueueThree = new PriorityQueue<>(new ComparatorID());
        patientQueueThree.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-10-1999 22:00"), "Man", "Stomach ache", 1985, Doctors.GASTROENTEROLOGIST, 1));
        patientQueueThree.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("10-05-2000 21:00"), "Woman", "Broken arm", 1982, Doctors.TRAUMATOLOGIST, 1));
        patientQueueThree.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("06-10-1999 20:00"), "Man", "Heart attack", 1980, Doctors.CARDIOLOGIST, 3));
        patientQueueThree.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-06-2010 22:00"), "Woman", "Fever heat", 1981, Doctors.THERAPIST, 4));
        patientQueueThree.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("08-03-1989 05:00"), "Man", "Headache", 1975, Doctors.NEUROPATHOLOGIST, 5));
        patientQueueThree.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("07-10-1985 05:00"), "Woman", "Examination", 1970, Doctors.THERAPIST, 5));

        PriorityQueue<Hospital> patientQueueFour = new PriorityQueue<>(new ComparatorDoctor());
        patientQueueFour.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-10-1999 22:00"), "Man", "Stomach ache", 1985, Doctors.GASTROENTEROLOGIST, 1));
        patientQueueFour.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("10-05-2000 21:00"), "Woman", "Broken arm", 1982, Doctors.TRAUMATOLOGIST, 1));
        patientQueueFour.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("06-10-1999 20:00"), "Man", "Heart attack", 1980, Doctors.CARDIOLOGIST, 3));
        patientQueueFour.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-06-2010 22:00"), "Woman", "Fever heat", 1981, Doctors.THERAPIST, 4));
        patientQueueFour.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("08-03-1989 05:00"), "Man", "Headache", 1975, Doctors.NEUROPATHOLOGIST, 5));
        patientQueueFour.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("07-10-1985 05:00"), "Woman", "Examination", 1970, Doctors.THERAPIST, 5));

        PriorityQueue<Hospital> patientQueueFive = new PriorityQueue<>(new ComparatorСomplaint());
        patientQueueFive.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-10-1999 22:00"), "Man", "Stomach ache", 1985, Doctors.GASTROENTEROLOGIST, 1));
        patientQueueFive.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("10-05-2000 21:00"), "Woman", "Broken arm", 1982, Doctors.TRAUMATOLOGIST, 1));
        patientQueueFive.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("06-10-1999 20:00"), "Man", "Heart attack", 1980, Doctors.CARDIOLOGIST, 3));
        patientQueueFive.offer(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("12-06-2010 22:00"), "Woman", "Fever heat", 1981, Doctors.THERAPIST, 4));
        patientQueueFive.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("08-03-1989 05:00"), "Man", "Headache", 1975, Doctors.NEUROPATHOLOGIST, 5));
        patientQueueFive.add(new Hospital(new SimpleDateFormat("dd-MM-yyyy HH:mm").parse("07-10-1985 05:00"), "Woman", "Examination", 1970, Doctors.THERAPIST, 5));

        switch (order) {
            case 1:
                System.out.println("\n------------ Sorted by year of admission ---------------");
                while (!patientQueue.isEmpty()) {
                    System.out.println("Patient admission " + patientQueue.poll().getPatientAdmission());
                }
                break;
            case 2:
                System.out.println("\n-- Sorted by year of birth --");
                while (!patientQueueTwo.isEmpty()) {
                    System.out.println("Patient's year of birth " + patientQueueTwo.poll().getYearOfBirth());
                }
                break;
            case 3:
                System.out.println("\n- Sorted by random ID -");
                while (!patientQueueThree.isEmpty()) {
                    System.out.println("Patient's ID " + patientQueueThree.poll().getID());
                }
                break;
            case 4:
                System.out.println("\n------ Sorted by Doctor ------");
                while (!patientQueueFour.isEmpty() && !patientQueueFive.isEmpty()) {
                    System.out.println("Doctor - " + patientQueueFour.poll().getDoctor());
                }
                break;
            case 5:
                System.out.println("\n----- Sorted by complaint ------");
                while (!patientQueueFive.isEmpty()) {
                    System.out.println("A complaint - " + patientQueueFive.poll().getaСomplaint());
                }
                break;
            default:
                System.out.println("You entered wrong number");
        }
    }
}