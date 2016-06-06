package org.academiadecodigo.psychokineticgame.interfaces;

import org.academiadecodigo.psychokineticgame.gameobjects.GameObjectType;

/**
 * Created by vi.KINGS Ana Tomas, David Neves, Mario Ponte and Pavel Racu on 06/06/16.
 */
public interface RepresentableFactory {

    Representable createRepresentation(GameObjectType type);

}
