package com.zhenia.practicekolos.task1;

import java.util.Comparator;

public class PacienNameComporator implements Comparator<Pacient> {

    public int compare(Pacient o1, Pacient o2) {
        int surnameChecking = o1.getSurname().compareTo(o2.getSurname());

        if (surnameChecking != 0) {
            return surnameChecking;
        }
        return o1.getName().compareTo(o2.getName());
    }
}



