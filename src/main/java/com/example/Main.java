package com.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    // Générer un nom utilisateur aléatoire
    public String generateRandomName() {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    // Générer un âge aléatoire entre 18 et 60
    public int generateRandomAge() {
        Random random = new Random();
        return 18 + random.nextInt(43);  // Age entre 18 et 60
    }

    // Générer un email aléatoire
    public String generateRandomEmail(String name) {
        Random random = new Random();
        String domain = "@example.com";
        return name.toLowerCase() + random.nextInt(100) + domain;
    }

    // Générer un numéro d'utilisateur unique
    public String generateRandomUsername() {
        Random random = new Random();
        return "user" + random.nextInt(10000);  // Générer un numéro entre 0 et 9999
    }

    @Override
    public void start(Stage primaryStage) {
        // Créer des données utilisateur aléatoires
        String name = generateRandomName();
        int age = generateRandomAge();
        String email = generateRandomEmail(name);
        String username = generateRandomUsername();

        // Créer l'interface graphique
        Label nameLabel = new Label("Nom : " + name);
        Label ageLabel = new Label("Âge : " + age);
        Label emailLabel = new Label("Email : " + email);
        Label usernameLabel = new Label("Numéro d'utilisateur : " + username);

        // Organiser les éléments dans une VBox (colonne)
        VBox vbox = new VBox(10, nameLabel, ageLabel, emailLabel, usernameLabel);

        // Créer la scène et ajouter la VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Configurer la fenêtre principale (Stage)
        primaryStage.setTitle("Compte Utilisateur");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
