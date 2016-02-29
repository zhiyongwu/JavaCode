package Java.chapter8.exam;

/**
 * Created by Administrator on 2016/1/26.
 */
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    //constructor
    public TV(){}

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int channel){
        if(on && channel >= 1 && channel < 120){
            this.channel = channel;
        }
    }

    public void setVolumeLevel(int volumeLevel){
        if(on && volumeLevel > 0 && volumeLevel <= 7){
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }

    public void channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }

    public void volumeUp(){
        if(on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if(on && volumeLevel > 1){
            this.volumeLevel--;
        }
    }

}

class Test{
    public static void main(String[] args) {
        TV t = new TV();
        t.setChannel(1);
    }
}
