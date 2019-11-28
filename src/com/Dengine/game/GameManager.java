package com.Dengine.game;

import com.Dengine.engine.AbstractGame;
import com.Dengine.engine.GameContainer;
import com.Dengine.engine.Renderer;
import com.Dengine.gfx.Image;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {

    private Image image;

    public GameManager() {
        image = new com.Dengine.gfx.Image("/test.png");
    }

    @Override
    public void update(GameContainer gc, float dt) {
        if(gc.getInput().isKeyDown(KeyEvent.VK_A)){
            System.out.println("A was pressed");
        }
    }

    @Override
    public void render(GameContainer gc, Renderer r) {
        r.drawImage(image, gc.getInput().getMouseX() - 32, gc.getInput().getMouseY() -32);
    }

    public static void main(String[] args){
        new GameContainer(new GameManager()).start();
    }
}
