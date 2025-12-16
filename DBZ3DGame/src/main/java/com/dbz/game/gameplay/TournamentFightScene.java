package com.dbz.game.gameplay;

import com.dbz.game.engine.scene.Scene;
import com.dbz.game.entities.Fighter;

public class TournamentFightScene extends Scene {

    private Fighter player;
    private Fighter enemy;
    private boolean finished = false;

    @Override
    public void load() {
        System.out.println("[TournamentFightScene] Preparando combate...");

        player = new Fighter("Goku", 1000);
        enemy = new Fighter("Vegeta", 1000);
    }

    @Override
    public void update(float deltaTime) {
        if (finished) return;

        enemy.damage(50);
        player.damage(30);

        System.out.println("Goku HP: " + player.getHealth());
        System.out.println("Vegeta HP: " + enemy.getHealth());

        if (player.getHealth() <= 0 || enemy.getHealth() <= 0) {
            finished = true;
            System.out.println("¡Pelea finalizada!");

            if (player.getHealth() > enemy.getHealth()) {
                System.out.println("GANADOR: Goku");
            } else {
                System.out.println("GANADOR: Vegeta");
            }
        }

        try { Thread.sleep(700); } catch (Exception ignored) {}
    }

    @Override
    public void render() {}
}
