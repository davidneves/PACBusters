package org.academiadecodigo.psychokineticgame.gameobjects;

import org.academiadecodigo.psychokineticgame.interfaces.MovableRepresentation;
import org.academiadecodigo.psychokineticgame.interfaces.Representable;
import org.academiadecodigo.psychokineticgame.interfaces.RepresentableFactory;

/**
 * Created by vi.KINGS Ana Tomas, David Neves, Mario Ponte and Pavel Racu on 06/06/16.
 */
public class GameObjectsFactory {

    private RepresentableFactory representableFactory;


    public GameObjectsFactory(RepresentableFactory representableFactory) {
        this.representableFactory = representableFactory;
    }


    public GameObject createObject(GameObjectType type) {

        GameObject gameObject;

        switch (type) {
            case GHOST:
                gameObject = new Ghost((MovableRepresentation) representableFactory.createRepresentation(type));
                break;
            case PLAYER:
                gameObject = new Player((MovableRepresentation) representableFactory.createRepresentation(type));
                break;
            case BATTERY:
                gameObject = new Battery(representableFactory.createRepresentation(type));
                break;
        }

        return gameObject;
    }


    public RepresentableFactory getRepresentableFactory() {
        return representableFactory;
    }
}
