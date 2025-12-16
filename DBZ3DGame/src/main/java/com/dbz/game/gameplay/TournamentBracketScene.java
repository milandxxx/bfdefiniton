package com.dbz.game.gameplay;

import com.dbz.game.engine.scene.Scene;
import com.dbz.game.engine.scene.SceneManager;

public class TournamentBracketScene extends Scene {

    private int currentMatch = 1;
    private final int totalMatches = 7;

    @Override
    public void load() {
        System.out.println("[TournamentBracketScene] Cargando escena de llaves...");
    }

    @Override
    public void update(float deltaTime) {
        System.out.println("Pelea actual: " + currentMatch + "/" + totalMatches);

        if (currentMatch < totalMatches) {
            currentMatch++;
        } else {
            System.out.println("¡Torneo listo! Pasando al combate final...");
            SceneManager.changeScene("TournamentFightScene");
        }

        try { Thread.sleep(1000); } catch (Exception ignored) {}
    }

    @Override
    public void render() {}
}
