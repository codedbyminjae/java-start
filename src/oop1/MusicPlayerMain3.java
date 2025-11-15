package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);
    }

    static void on (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("start");
    }

    static void off (MusicPlayerData data) {
        data.isOn = false;
        System.out.println("off");
    }

    static void volumeUp (MusicPlayerData data) {
        data.volume++;
        System.out.println("volume : " + data.volume);
    }

    static void volumeDown (MusicPlayerData data) {
        data.volume--;
        System.out.println("volume : " + data.volume);
    }

    static void showStatus (MusicPlayerData data) {
        System.out.println("status");
        if (data.isOn) {
            System.out.println("On, volume : " + data.volume);
        } else {
            System.out.println("Off, volume : " + data.volume);
        }
    }
}
