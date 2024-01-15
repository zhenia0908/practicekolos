package com.zhenia.practicekolos.task1;

import java.util.Comparator;

public class PacienNameComporator implements Comparator<Pacient> {

    public int compare(Pacient o1, Pacient o2){

      if(o1.getName().compareTo(o2.getName()) == 1 ){
           if( o1.getSurname().compareTo(o2.getSurname()) ==1){
               System.out.println("This is the same person");
           }
        }
        return 0;
    }
}
