package com.company;

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
