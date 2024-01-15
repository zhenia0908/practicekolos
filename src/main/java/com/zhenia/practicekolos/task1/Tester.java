package com.zhenia.practicekolos.task1;

import java.util.ArrayList;

public class Tester {
    /*1. Компоратор - всегда они равны(возвращаешь единицу)
2. прайвит поле медицинская карта в пациенте
3. в больнице должен быть лист челиков
public void addPatient(Pacient pacient){
    //добавляешь методом add для конкретной больницы    //смотришь методом c contains
    //если есть - создаешь карту, сетаешь ему, и добавляешь в общий список}
public void removePatient(Pacient pacient){    listOfPacients.remove(pacient);
    if (!listOfPacients.contains(pacient)){        pacient.setMedicalCard(null);
        cards.remove(pacient.getMedicalCard());    }
}*/

    ArrayList<MedicalCard>cards = new ArrayList<>();
     public void addPatient(Pacient pacient, Hospital hospital){
         hospital.getListOfPacients() =
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
Hospital hospital = new Hospital(1, "kulman 9", 1);
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
