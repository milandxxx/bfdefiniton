package com.dbz.game.gameplay;

import com.dbz.game.engine.scene.Scene;
import com.dbz.game.entities.Fighter;

public class TrainingMode extends Scene {

    private Fighter player;

    @Override
    public void load() {
        System.out.println("[TrainingMode] Entrenamiento iniciado.");
        player = new Fighter("Goku", 9999);
    }

    @Override
    public void update(float deltaTime) {
        System.out.println("Entrenando... Golpeando aire...");
        player.damage(-10);

        try { Thread.sleep(700); } catch (Exception ignored) {}
    }

    @Override
    public void render() {}
}
