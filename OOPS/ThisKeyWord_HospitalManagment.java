package OOPS;

import java.util.Scanner;

// Creating Class Patient
class Patient {

    private String patientId;
    private String patientName;
    private String disease;

    // Constructor
    public Patient(String patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
    }

    // Setter Methods
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    // Getter Methods
    public String getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDisease() {
        return disease;
    }

    
}

public class ThisKeyWord_HospitalManagment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many patients do you want to add? : ");
        int n = Integer.parseInt(sc.nextLine());

        // Array of Patient Objects
        Patient[] patients = new Patient[n];

        // Input Patient Details
        for (int i = 0; i < patients.length; i++) {

            System.out.println("\nEnter Details for Patient " + (i + 1));

            System.out.print("Enter Patient ID : ");
            String patientId = sc.nextLine();

            System.out.print("Enter Patient Name : ");
            String patientName = sc.nextLine();

            System.out.print("Enter Disease : ");
            String disease = sc.nextLine();

            patients[i] = new Patient(patientId, patientName, disease);
        }

        // Display Patient Details
        System.out.println("\n===== PATIENT DETAILS =====");

        for (int i = 0; i < patients.length; i++) {
            System.out.println("\nPatient " + (i + 1));
            System.out.println(patients[i]);
        }

        sc.close();
    }
}