package org.academiadecodigo.psychokineticgame.gameobjects;

import org.academiadecodigo.psychokineticgame.interfaces.Representable;

/**
 * Created by <vi.KINGS_> Ana Tomas, David Neves, Mario Ponte and Pavel Racu on 06/06/16.
 */
public abstract class GameObject {

    private Representable representation;

    public GameObject(Representable representation) {
        this.representation = representation;

    }

    public Representable getRepresentation() {
        return representation;
    }


}
