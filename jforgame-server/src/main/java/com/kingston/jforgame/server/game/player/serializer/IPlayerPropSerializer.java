package com.kingston.jforgame.server.game.player.serializer;

import com.kingston.jforgame.server.game.database.user.player.PlayerEnt;

import java.io.Serializable;

public interface IPlayerPropSerializer extends Serializable {

    void serialize(PlayerEnt player);

    void deserialize(PlayerEnt player);

}
