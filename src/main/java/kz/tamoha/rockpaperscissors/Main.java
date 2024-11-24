package kz.tamoha.rockpaperscissors;

import kz.tamoha.rockpaperscissors.game.Game;
import kz.tamoha.rockpaperscissors.model.Computer;
import kz.tamoha.rockpaperscissors.model.Player;
import kz.tamoha.rockpaperscissors.model.Score;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();
        Score score = new Score();
        Game game = new Game(player, computer, score);
        game.playRound();
    }
}

