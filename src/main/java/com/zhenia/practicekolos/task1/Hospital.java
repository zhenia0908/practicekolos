package com.zhenia.practicekolos.task1;

import java.util.ArrayList;
import java.util.Objects;

public class Hospital {
    //номер больницы, адрес, количество отделов, список людей, которые там лежат
  private  int numberOfHospital;
   private String address;
   private int numberOfDepartments;
    private ArrayList<Pacient> listOfPacients;

   public Hospital(int numberOfHospital, String address, int numberOfDepartments){
       this.numberOfHospital = numberOfHospital;
       this.address = address;
       this.numberOfDepartments = numberOfDepartments;
       this.listOfPacients = new ArrayList<>();
   }
   public Hospital(){}

    public ArrayList<Pacient> getListOfPacients() {
        return listOfPacients;
    }

    public void setListOfPacients(ArrayList<Pacient> listOfPacients) {
        this.listOfPacients = listOfPacients;
    }

    public int getNumberOfHospital() {
        return numberOfHospital;
    }

    public void setNumberOfHospital(int numberOfHospital) {
        this.numberOfHospital = numberOfHospital;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Hospital{" +
                "numberOfHospital=" + numberOfHospital +
                ", address='" + address + '\'' +
                ", numberOfDepartments=" + numberOfDepartments +
                +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (numberOfHospital != hospital.numberOfHospital) return false;
        if (numberOfDepartments != hospital.numberOfDepartments) return false;
        return Objects.equals(address, hospital.address);
    }


}
