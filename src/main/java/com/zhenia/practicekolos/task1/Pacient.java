package com.zhenia.practicekolos.task1;

import java.util.Objects;

public class Pacient {
    // имя, фамилия, медицинская карта, возраст, место работы, должность
    private String name;
    private String surname;
    MedicalCard medicalCard;
    private int old;
    private String placeOfWork;
    private String jobTitle;

    public Pacient(String name, String surname,  int old, String placeOfWork, String jobTitle) {
        this.name = name;
        this.surname = surname;

        this.old = old;
        this.placeOfWork = placeOfWork;
        this.jobTitle = jobTitle;
    }
public Pacient(){}
    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", medicalCard=" + medicalCard +
                ", old=" + old +
                ", placeOfWork='" + placeOfWork + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pacient pacient = (Pacient) o;

        if (old != pacient.old) return false;
        if (!Objects.equals(name, pacient.name)) return false;
        if (!Objects.equals(surname, pacient.surname)) return false;
        if (!Objects.equals(medicalCard, pacient.medicalCard)) return false;
        if (!Objects.equals(placeOfWork, pacient.placeOfWork)) return false;
        return Objects.equals(jobTitle, pacient.jobTitle);
    }


    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
