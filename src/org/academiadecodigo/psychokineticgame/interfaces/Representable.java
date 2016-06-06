package org.academiadecodigo.psychokineticgame.interfaces;

/**
 * Created by <vi.KINGS_> Ana Tomas, David Neves, Mario Ponte and Pavel Racu on 06/06/16.
 */
public interface Representable {

    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void updatePicture(String path);

    void deleteObject();
}
