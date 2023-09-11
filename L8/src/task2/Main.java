package task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ParseException {
//        collection of linkedList type for better and faster sorting,
//        but how to set the limit for capacity?
        LinkedList<Worker> workers = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String fullName = "";
            String position = "";

            System.out.print("Full Name: ");
            fullName = br.readLine();
            System.out.print("Position: ");
            position = br.readLine();
            System.out.print("Year: ");
            int year = Integer.parseInt(br.readLine());

            isThisDateValid(String.valueOf(year), "yyyy");

            workers.add(new Worker(fullName, position, year));
        }

        Collections.sort(workers, Worker.workerComparator);
        System.out.println(workers);

        searchRelevantExperience(workers);

    }


    public static void searchRelevantExperience(LinkedList<Worker> a) {
        int validExperience;
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int workersExperience;

        Scanner sc = new Scanner(System.in);
        System.out.print("Valid experience: ");
        validExperience = sc.nextInt();

        System.out.println("Workers with valid experience:");

        for (int i = 0; i < a.size(); i++) {
            int workersStartYear = a.get(i).year;
            workersExperience = yearNow - workersStartYear;

            if (workersExperience >= validExperience) {
                System.out.println(a.get(i).fullName);
            }
        }
    }



    public static boolean isThisDateValid(String dateToValidate, String dateFromat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
        sdf.setLenient(false);

        try {
            // if not valid, it will throw ParseException
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
