package kz.tamoha.rockpaperscissors.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Score {
    int playerScore = 0;
    int computerScore = 0;

    public void incrementComputerScore(){
        computerScore++;

    }
    public void incrementPlayerScore(){
        playerScore++;
    }

    public void displayScore(String computerChoice){
        System.out.println("Робот выбрал: " + computerChoice);
        System.out.println("Общий счет: ");
        System.out.println("Игрок: " + playerScore);
        System.out.println("Компьютер: " + computerScore);
    }

}
