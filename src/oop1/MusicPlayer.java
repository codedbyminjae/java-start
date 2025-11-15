package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("START");
    }

    void off() {
        isOn = false;
        System.out.println("STOP");
    }

    void volumeUp() {
        volume++;
        System.out.println("player Volume = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("player Volume = " + volume);
    }

    void showStatus() {
        System.out.println("status");
        if (isOn) {
            System.out.println("ON" + volume);
        } else {
            System.out.println("OFF");
        }
    }

}
