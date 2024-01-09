package com.zhenia.practicekolos.task1;

import java.util.ArrayList;

public class Tester {
    ArrayList<Pacient> listOfPacients = new ArrayList<>();
    ArrayList<MedicalCard>cards = new ArrayList<>();
     public void addPatient(Pacient pacient){
         listOfPacients.add(pacient);
       if(  listOfPacients.add(pacient)){
           MedicalCard medicalCard = new MedicalCard();
           cards.add(pacient.getMedicalCard());
       }
     }
     public void removePatient(Pacient pacient){
         listOfPacients.add(pacient);
         if ( listOfPacients.remove(pacient)){
             cards.remove(pacient.getMedicalCard());
         }
     }




    public static void main(String[] args) {
        Tester tester = new Tester();

        Pacient pacient1 = new Pacient("Vania", "Ivanov", 30, "Google", "programist");
        Pacient pacient2 = new Pacient("Petia", "Ivanov", 31, "supermarket", "shop assistant");
        Pacient pacient3 = new Pacient("Igor", "Ivanov", 32, "Google", "programist");
        tester.addPatient(pacient1);
        tester.addPatient(pacient2);
        tester.addPatient(pacient3);
        tester.removePatient(pacient1);
        System.out.println(tester.cards);

    }
}
