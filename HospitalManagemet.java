       // Hospital Management Assignment IN Java
        
        
import java.util.ArrayList;

import java.util.*;

public class HospitalMangement {
    public static void main(String[] args) {

        ArrayList patients = new ArrayList();
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to our Hospital Application ");
        int patientId =0;

        do 
        {
           
            System.out.println("Select your choice what you want to do ");
            System.out.println("1) Add Patient ");
            System.out.println("2) Book Appoinment ");
            System.out.println("3) Exit App "); 

            int choice = input.nextInt();
           
            
                if(choice ==1)
                {
                // Add Patient
                System.out.print("Enter Patient ID: ");
                 patientId = input.nextInt();
                System.out.print("Enter Patient Name: ");
                String patientName = input.next();
                System.out.print("Enter Patient Age: ");
                int patientAge = input.nextInt();
                System.out.print("Enter Patient Gender: ");
                String patientGender = input.next();
                System.out.print("Enter Patient Contact Number: ");
                String patientContactNumber = input.next();
                System.out.print("Enter Patient Address: ");
                String patientAddress = input.next();
                
               // Patient patient = new Patient(int patientId, patientName, patientAge, patientGender, patientContactNumber, patientAddress);
                patients.add(patientId);
                 patients.add(patientName);
                 patients.add(patientAge);
                 patients.add(patientGender);
                 patients.add(patientContactNumber);
                 patients.add(patientAddress);
                 
                System.out.println("Patient added successfully!");
            }

            else if(choice ==2)
            {
                System.out.println("Entre the patient id - ");
                int id = input.nextInt();

                if(id == patientId)
                {
                  System.out.println("Your Appoinment has been booked");
                }
                else 
                {
                    System.out.println("Add patient first ");
                }
            }

            else if(choice==3)
            {
                System.out.println("Thanks for using our App ");
                System.exit(choice);
            }

            else 
            {
                System.out.println("please select the correct option ");
            }
            
        
        
    }
    while(true);
    
}
}
