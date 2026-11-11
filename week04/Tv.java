
public class Tv {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public Tv(int channel, int volumeLevel, boolean on) {
        if(channel < 0){
            throw new IllegalArgumentException("channnel cant be negative");

        }
        this.channel = channel;
        
        if(volumeLevel < 0 || volumeLevel > 100){

            throw new IllegalArgumentException("Invalid volume");
        }
        this.volumeLevel = volumeLevel;
        
        
        this.on = on;



    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean getOn() {
        return on;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void channelUp() {

        channel++;

    }

    public void channelDown() {

        if(channel == 0){

            System.out.println("No more channels");
            return;

        }
        channel--;

    }

    public void volumeUp() {

        if(volumeLevel == 100){

            System.out.println("Max volume reached");
            return; 

        }

        volumeLevel++;

    }

    public void volumeDown() {
        if(volumeLevel == 0){

            System.out.println("Muted");
            return;

        }
        volumeLevel--;
        
    }

    

}