package controller;

import myShelfieException.FatalException;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * interface containing all the method witch implementation differs between RMI and Socket
 */
public interface ControllerAskNotify {


    /**
     * asks the client to insert the number of player
     */
    void askNumberOfPlayers() throws FatalException;

    /**
     * this method tells to "nextClient" to start his turn, is divided in RMI and socket
     * @throws RemoteException RMI exception
     */
     void notifyStartYourTurn() throws IOException;

    /**
     * this method tells to the current user that his turn is finished, is divided in RMI and socket
     * @throws RemoteException RMI exception
     */
    void notifyEndYourTurn() throws IOException;

    /**
     * this method tells to all users to update their board to the new one, is divided in RMI and socket
     * @throws RemoteException RMI exception
     */
    void notifyUpdatedBoard() throws IOException;

    /**
     * this method tells to all users that the game they're playing is ended, is divided in RMI and socket
     * @throws RemoteException RMI exception
     */
    void notifyEndGame() throws IOException;

    /**
     * this method tells to all users that the game has started and that they aren't anymore in the waiting room, is divided in RMI and socket
     * @throws RemoteException RMI exception
     */
    void notifyStartPlaying() throws IOException, FatalException;

    /**
     * send an ask request to the client
     * @throws RemoteException RMI exception
     */
    void askPing() throws IOException;

    /**
     * notify to the remote client to add a new message to the conversation in the chat
     * @param nick: nickname of the sender
     * @param message: text message
     * @throws IOException when something in the network went wrong
     */
    void notifyNewMessage(String nick, String message) throws IOException;



}
