package kz.tamoha.rockpaperscissors.model;

public class Computer {
    public String getChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "камень";
            case 1 -> "бумага";
            case 2 -> "ножницы";
            default -> "";
        };
    }
}
