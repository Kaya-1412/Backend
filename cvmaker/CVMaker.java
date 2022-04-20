package com.zbackendu.cvmaker;

public class CVMaker {
    public static void main(String[] args) {
        System.out.println("CV MAKER");
        System.out.println("HELLO WORLD");
        Candidate candidate = new Candidate.Builder().setName("imie")
                .setLastName("nazwisko")
                .setEmail("mail")
                .setGender(Gender.MALE)
                .build();
        System.out.println(candidate.Gender + " " + candidate.name);
    }
}
