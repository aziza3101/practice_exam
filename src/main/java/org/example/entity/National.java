package org.example.entity;

public class National {
    private String food;
    private String language;
    private String game;
    public National(String food, String language, String game) {
        this.food = food;
        this.language = language;
        this.game = game;
    }
    public National() {
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "National{" +
                "food='" + food + '\'' +
                ", language='" + language + '\'' +
                ", game='" + game + '\'' +
                '}';
    }
}
