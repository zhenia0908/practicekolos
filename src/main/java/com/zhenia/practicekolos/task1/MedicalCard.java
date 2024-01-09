package com.zhenia.practicekolos.task1;

import java.util.Objects;

public class MedicalCard {
    //Медицинская карта - Больница, которой она принадлежит, индентификационный номер
    private Hospital hospital;
    private String number;
    public MedicalCard(Hospital hospital, String number){
        this.hospital = hospital;
        this.number = number;
    }
    public MedicalCard(){}

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "MedicalCard{" +
                "hospital=" + hospital +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedicalCard that = (MedicalCard) o;

        if (!Objects.equals(hospital, that.hospital)) return false;
        return Objects.equals(number, that.number);
    }


}
