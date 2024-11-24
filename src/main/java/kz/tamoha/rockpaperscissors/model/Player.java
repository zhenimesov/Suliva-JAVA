package kz.tamoha.rockpaperscissors.model;

import java.util.Scanner;

public class Player {
    public String getChoice(Scanner scan) {
        System.out.println("Введите ваш выбор (камень, ножницы, бумага) или 0 для выхода:" + "\n");
        return scan.nextLine().toLowerCase();
    }
}
