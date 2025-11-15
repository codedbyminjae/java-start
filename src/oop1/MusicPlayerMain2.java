package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("start");

        data.volume++;
        System.out.println("volume: " + data.volume);

        data.volume++;
        System.out.println("volume: " + data.volume);

        data.volume--;
        System.out.println("volume: " + data.volume);

        System.out.println("status");

        if (data.isOn) {
            System.out.println("ON, volume: " + data.volume);
        } else {
            System.out.println("OFF, volume: " + data.volume);
        }

        data.isOn = false;
        System.out.println("off");
    }
}
