import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void selectionRadioStation() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectionRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectionRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMaxRadioStations() {
        Radio radio = new Radio();
        radio.setToMaxRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStations() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(7);
        radio.nextStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRadioStationMax(){
        Radio radio = new Radio();
        radio.setSelectionRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStations() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevRadioStationsMin() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectionLevelVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(8);
        int expected = 8;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectionLevelVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setLevelVolume(11);
        int expected = 0;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectionLevelVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setLevelVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setLevelVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(3);
        radio.decreaseVolume();
        int expected = 2;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
       @Test
    public void setToMaxLevelVolume() {
        Radio radio = new Radio();
        radio.setToMaxLevelVolume();
        int expected = 10;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
}


