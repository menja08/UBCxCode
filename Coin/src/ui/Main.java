package ui;

import model.Coin;

public class Main {

    public static void main(String[] args){

        Coin ivan = new Coin();
        ivan.flip();
        String value = ivan.checkStatus();
        System.out.println(value);
    }
}
