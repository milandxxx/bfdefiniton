package com.dbz.game.gameplay;

import com.dbz.game.engine.scene.SceneManager;

public class TournamentMode {

    public static void start() {
        System.out.println("[TournamentMode] Iniciando modo Torneo...");

        SceneManager.register("TournamentBracketScene", new TournamentBracketScene());
        SceneManager.register("TournamentFightScene", new TournamentFightScene());

        SceneManager.changeScene("TournamentBracketScene");
    }
}
