package com.Dengine.game;

import com.Dengine.engine.AbstractGame;
import com.Dengine.engine.GameContainer;
import com.Dengine.engine.Renderer;

import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {
    @Override
    public void update(GameContainer gc, float dt) {
        if(gc.getInput().isKeyDown(KeyEvent.VK_A)){
            System.out.println("A was pressed");
        }
    }

    @Override
    public void render(GameContainer gc, Renderer r) {

    }

    public static void main(String[] args){
        new GameContainer(new GameManager()).start();
    }
}
