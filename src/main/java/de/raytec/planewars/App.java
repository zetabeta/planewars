package de.raytec.planewars;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "my-gdx-game";
        cfg.useGL20 = false;
        cfg.width = 480;
        cfg.height = 320;

        new LwjglApplication(new MyGame(), cfg);
    }
}
