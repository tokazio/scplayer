package com.shuffle.scplayer.core;

/**
 * @author crsmoro
 * @author LeanderK
 * @version 1.0
 */
public interface SpotifyConnectPlayer {
    Track getPlayingTrack();

    boolean getShuffle();

    boolean getRepeat();

    short getVolume();

    int getSeek();

    String getAlbumCoverURL();

    boolean isPlaying();

    String getPlayerName();

    void setPlayerName(String playerName);

    void play();

    void pause();

    void prev();

    void next();

    void seek(int millis);

    void shuffle(boolean enabled);

    void repeat(boolean enabled);

    void volume(short volume);

    void login(String username, String password);

    void logout();

    boolean isLoggedIn();

    void close();

    void addPlayerListener(PlayerListener playerListener);

    void removePlayerListener(PlayerListener playerListener);
}
