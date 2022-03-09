package com.company;

interface Doctor{
    public void viewProfile();
}
class Dentist implements Doctor{
    public void viewProfile(){
        System.out.println("Dentist");
    }
}
class Psychologist implements Doctor{
    public void viewProfile(){
        System.out.println("Psychologist");
    }
}
class Pediatrician implements Doctor{
    public void viewProfile(){
        System.out.println("Pediatrician");
    }
}
public class Main {

    public static void main(String[] args) {
        Dentist de = new Dentist();
        Psychologist ps = new Psychologist();
        Pediatrician pe = new Pediatrician();
        de.viewProfile();
        ps.viewProfile();
        pe.viewProfile();
    }
}
