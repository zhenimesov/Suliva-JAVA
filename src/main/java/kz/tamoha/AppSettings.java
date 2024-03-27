package kz.tamoha;

import java.util.Scanner;

public class AppSettings {
    public void playRound() {
        System.out.println(Message.GREETING_MESSAGE.getText());
        while (true) {
            int computerChoice = (int) (Math.random() * 3);
            String computerChoiceString = String.valueOf(computerChoice);
            Scanner scan = new Scanner(System.in);

            String res = scan.nextLine().toLowerCase();
            int playerChoice = 3;

            if (res.equals("камень")) {
                playerChoice = 0;
                stoneScicsorsPapar(computerChoice, playerChoice);
                replaceIntToString(computerChoiceString);
            } else if (res.equals("бумага")) {
                playerChoice = 1;
                stoneScicsorsPapar(computerChoice, playerChoice);
                replaceIntToString(computerChoiceString);
            } else if (res.equals("ножницы")) {
                playerChoice = 2;
                stoneScicsorsPapar(computerChoice, playerChoice);
                replaceIntToString(computerChoiceString);
            } else if (res.equals("0")) {
                break;
            } else {
                System.out.println(Message.ERROR_TYPE.getText());
            }
        }
    }

    int playerScore = 0;
    int computerScore = 0;

    public void stoneScicsorsPapar(int computerChoice, int playerChoice) {

        if (computerChoice == playerChoice) {
            System.out.println("НИЧЬЯ");
        } else if (playerChoice == 1 && computerChoice == 2) {
            System.out.println(Message.WIN_COMPUTER.getText());
            computerScore++;
        } else if (playerChoice == 2 && computerChoice == 0) {
            System.out.println(Message.WIN_COMPUTER.getText());
            computerScore++;
        } else if (playerChoice == 0 && computerChoice == 1) {
            System.out.println(Message.WIN_COMPUTER.getText());
            computerScore++;
        } else if (computerChoice == 0 && playerChoice == 1) {
            System.out.println(Message.WIN_PLAYER.getText());
            playerScore++;
        } else if (computerChoice == 1 && playerChoice == 2) {
            playerScore++;
            System.out.println(Message.WIN_PLAYER.getText());
        } else if (computerChoice == 2 && playerChoice == 0) {
            System.out.println(Message.WIN_PLAYER.getText());
            playerScore++;
        }
    }

    public void replaceIntToString(String computerChoiceString){
        System.out.println("Робот выбрал: " + computerChoiceString
                .replace("0", "Камень\n")
                .replace("1", "Бумага\n")
                .replace("2", "Ножницы\n\n")
                + "Общий счет: \n" +
                "Игрок: " + playerScore + "\n"
                + "Компьютер: " + computerScore );
    }
}



