package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import javax.print.attribute.standard.MediaTray;



public class Game2048 extends Game {
    public static final int SIDE = 4;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
    }
}