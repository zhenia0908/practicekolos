package com.zhenia.practicekolos.task1;

import java.util.ArrayList;
import java.util.List;

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
     public Pacient addPatient(Pacient pacient, Hospital hospital){
             //нам надо получить челиков которые есть в этой больнице
         List<Pacient> listOfPatients = hospital.getListOfPacients();
             listOfPatients.add(pacient);
             if (listOfPatients.contains(pacient)) {
                 MedicalCard medicalCard = new MedicalCard();
                 pacient.setMedicalCard(medicalCard);
             }    return pacient;
         }


     public Pacient removePatient(Pacient pacient, Hospital hospital){
         List<Pacient> listOfPatients =  hospital.getListOfPacients();
         listOfPatients.remove(pacient);
         if ( listOfPatients.contains(pacient)){
             cards.remove(pacient.getMedicalCard());
         }
        return pacient;
     }




    public static void main(String[] args) {
        Tester tester = new Tester();
Hospital hospital = new Hospital(1, "kulman 9", 1);
        Pacient pacient1 = new Pacient("Vania", "Ivanov", 30, "Google", "programist");
        Pacient pacient2 = new Pacient("Petia", "Ivanov", 31, "supermarket", "shop assistant");
        Pacient pacient3 = new Pacient("Igor", "Ivanov", 32, "Google", "programist");
        tester.addPatient(pacient1, hospital);
        tester.addPatient(pacient2, hospital);
        tester.addPatient(pacient3, hospital);
        tester.removePatient(pacient1, hospital);
        System.out.println(tester.cards);

    }
}
