package kz.tamoha.rockpaperscissors.model.media;

import lombok.Getter;

@Getter
public enum Message {
    GREETING_MESSAGE("Добро пожаловать в игру Камень-Ножницы-Бумага!"),
    WIN_PLAYER("Игрок выиграл!"),
    WIN_COMPUTER("Компьютер выиграл!"),
    ERROR_TYPE("Неправильный ввод!");

    private final String text;

    Message(String text) {
        this.text = text;
    }

}
