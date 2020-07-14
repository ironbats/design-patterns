package br.com.patterns.flyweight;

import org.jfugue.Player;

public class TocaPiano {

    void tocaPiano(String code){

        Player player = new Player();
        player.play(code);
        System.out.println(code);
    }
}
