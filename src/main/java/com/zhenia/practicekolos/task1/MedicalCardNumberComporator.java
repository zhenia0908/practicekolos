package com.zhenia.practicekolos.task1;

import java.util.Comparator;

public class MedicalCardNumberComporator implements Comparator<MedicalCard> {
    public int compare(MedicalCard o1, MedicalCard o2){
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
