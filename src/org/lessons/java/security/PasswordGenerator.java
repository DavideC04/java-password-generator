package org.lessons.java.security;

public class PasswordGenerator {

    public static void main(String[] args) {

        // Dichiaro le variabili del nome, cognome e colore

        String userName;
        String userSurname;
        String favoriteColor;

        // Data di nascita

        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        // Inserisco un valore alle variabili

        userName = "Davide";
        userSurname ="Cangiano";
        favoriteColor ="Rosso";
        dayOfBirth = 7;
        monthOfBirth = 4;
        yearOfBirth = 1997;

        // Dichiaro ed inizializzo una variabile String che contenga la data
        // giorno / mese / anno

        String dateOfBirth = dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth;

        // Dichiaro una variabile che contenga la somma dell'anno di nascita
        // giorno + mese + anno

        int datePassword = dayOfBirth + monthOfBirth + yearOfBirth;

        // Dichiaro una variabile che contenga la password generate dalla somma delle variabili
        // nome + cognome + colore + somma dell'anno di nascita

        String passwordGenerate = userName + "-" +  userSurname + "-" +  favoriteColor + "-" + datePassword;

        // Stampo in console

        System.out.println("Il tuo nome: " + userName);
        System.out.println("Il tuo cognome: " + userSurname);
        System.out.println("Il tuo colore preferito: " + favoriteColor);
        System.out.println("La tua data di nascita: " + dateOfBirth);
        System.out.println("La password generata è: " + passwordGenerate);


    }
}
