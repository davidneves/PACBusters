package org.academiadecodigo.psychokineticgame.gameobjects;

import org.academiadecodigo.psychokineticgame.interfaces.MovableRepresentation;
import org.academiadecodigo.psychokineticgame.interfaces.Representable;

/**
 * Created by vi.KINGS Ana Tomas, David Neves, Mario Ponte and Pavel Racu on 06/06/16.
 */
public abstract class MovableGameObject extends GameObject {

    public MovableGameObject(Representable representation) {
        super(representation);
    }

    public void move(int dx, int dy) {
        ((MovableRepresentation) getRepresentation()).move(dx, dy);
    }
}
