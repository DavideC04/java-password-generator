package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGeneratorScanner {
    public static void main(String[] args) {

        // Dichiaro le variabili del nome, cognome e colore
        String userName;
        String userSurname;
        String favoriteColor;

        // Data di nascita
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        // Dichiaro lo scanner per chiedere l'input all'utente

        Scanner scanner = new Scanner (System.in);

        // Stampo e chiedo in console i valori dall'utente

        System.out.println("Inserisci il tuo nome: ");
        userName = scanner.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        userSurname = scanner.nextLine();

        System.out.println("Inserisci il tuo colore preferito: ");
        favoriteColor = scanner.nextLine();

        System.out.println("Inserisci il giorno della tua nascita: ");
        dayOfBirth = scanner.nextInt();

        System.out.println("Inserisci il mese della tua nascita: ");
        monthOfBirth = scanner.nextInt();

        System.out.println("Inserisci l'anno della tua nascita: ");
        yearOfBirth = scanner.nextInt();


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
