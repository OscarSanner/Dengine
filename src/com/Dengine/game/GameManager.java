package com.Dengine.game;

import com.Dengine.engine.AbstractGame;
import com.Dengine.engine.GameContainer;
import com.Dengine.engine.Renderer;
import com.Dengine.gfx.Image;
import com.Dengine.gfx.ImageTile;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {

    private ImageTile image;

    public GameManager() {
        image = new com.Dengine.gfx.ImageTile("/test.png", 16, 16);
    }

    @Override
    public void update(GameContainer gc, float dt) {
        if(gc.getInput().isKeyDown(KeyEvent.VK_A)){
            System.out.println("A was pressed");
        }

        temp += dt * 20;

        if (temp > 3){
            temp = 0;
        }
    }

    float temp = 2;

    @Override
    public void render(GameContainer gc, Renderer r) {
        r.drawImageTile(image, gc.getInput().getMouseX() - 8, gc.getInput().getMouseY() -16, (int)temp, 0);
    }

    public static void main(String[] args){
        new GameContainer(new GameManager()).start();
    }
}
