package com.zbackendu.cvmaker;

public class Candidate{
    String name, lastName, email, Gender;
    private Candidate(String name, String lastName, String email, Gender gender){
        this.name = name;
        this. lastName = lastName;
        this.email = email;
        this.Gender = String.valueOf(gender);
    }
    public static class Builder{
        private String name, lastName, email;
        private Gender gender;
        public Builder(){
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public Builder setGender(Gender gender){
            this.gender = gender;
            return this;
        }
        public Candidate build(){
            return new Candidate(name, lastName, email, gender);//access do zmiennych prywatnych?
        }
    }
}
