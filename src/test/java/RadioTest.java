import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void selectionRadioStationFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionRadioStationSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionRadioStationAboveMaxFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionRadioStationBelowMinFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(-1);
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
    public void setToMaxRadioStationsFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setToMaxRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setToMaxRadioStations() {
        Radio radio = new Radio();
        radio.setToMaxRadioStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationsFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(9);
        radio.nextStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationsSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(9);
        radio.nextStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationMaxFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationMaxSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(10);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsMinLimitValuesFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsMinLimitValuesSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsMinFirstConstructor() {
        Radio radio = new Radio(11);
        radio.setSelectionRadioStation(0);
        radio.prevStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationsMinSecondConstructor() {
        Radio radio = new Radio();
        radio.setSelectionRadioStation(0);
        radio.prevStation();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionLevelVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        int expected = 100;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionLevelVolumeMaxLimitValue() {
        Radio radio = new Radio();
        radio.setLevelVolume(99);
        int expected = 99;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionLevelVolumeMinLimitValue() {
        Radio radio = new Radio();
        radio.setLevelVolume(1);
        int expected = 1;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectionLevelVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setLevelVolume(101);
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
        radio.setLevelVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMinLimitValue() {
        Radio radio = new Radio();
        radio.setLevelVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxLimitValue() {
        Radio radio = new Radio();
        radio.setLevelVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setLevelVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setLevelVolume(50);
        radio.decreaseVolume();
        int expected = 49;
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
        int expected = 100;
        int actual = radio.getCurrentLevelVolume();
        Assertions.assertEquals(expected, actual);
    }
}