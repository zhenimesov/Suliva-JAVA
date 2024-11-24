package kz.tamoha.rockpaperscissors.game;

import kz.tamoha.rockpaperscissors.model.Computer;
import kz.tamoha.rockpaperscissors.model.Player;
import kz.tamoha.rockpaperscissors.model.Score;
import kz.tamoha.rockpaperscissors.model.media.Message;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Scanner;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Game {
    Player player;
    Computer computer;
    Score score;

    public void playRound() {
        System.out.println(Message.GREETING_MESSAGE.getText());
        Scanner scan = new Scanner(System.in);

        while (true) {
            String playerChoice = player.getChoice(scan);
            if (playerChoice.equals("0")) {
                break;
            }

            String computerChoice = computer.getChoice();
            determineWinner(playerChoice, computerChoice);
            score.displayScore(computerChoice);
        }
    }

    private void determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("НИЧЬЯ");
        } else if ((playerChoice.equals("камень") && computerChoice.equals("ножницы")) ||
                (playerChoice.equals("бумага") && computerChoice.equals("камень")) ||
                (playerChoice.equals("ножницы") && computerChoice.equals("бумага"))) {
            System.out.println(Message.WIN_PLAYER.getText());
            score.incrementPlayerScore();
        } else {
            System.out.println(Message.WIN_COMPUTER.getText());
            score.incrementComputerScore();
        }
    }
}



