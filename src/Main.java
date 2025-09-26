public class Main {
    public static void main(String[] args) {
        TV tv3 = new TV(1,1, true);
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);
        // tv2
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("TV1's channel is "+ tv1.getChannel()+ " and volume level is "+ tv1.volumeLevel);
        System.out.println("TV2's channel is "+ tv2.getChannel()+ " and volume level is "+ tv2.volumeLevel);
    }
}

class TV {
    private int channel = 1;
    public int volumeLevel = 1;
    public boolean on = false;
    // no arguments constructor
    TV(){
        System.out.println("No args constructor");
    }
    // arguments constructor
    TV(int channel, int volumeLevel, boolean on){
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
        System.out.println("All args constructor");
    }
    public void turnOn(){
        on = true;
        System.out.println("Starting Turn On TV...");
    }
    public void turnOff(){
        on = false;
        System.out.println("Shutting down!");
    }
    // setters for channel and volume
    public void setChannel(int newChannel){
        if (on && (channel >=1 && channel <= 120)){
            this.channel = newChannel;
        }
    }
    public int getChannel(){
        return this.channel;
    }
    public void setVolumeLevel(int newVolumeLevel){
        if(on && (volumeLevel >=1 && volumeLevel <= 7)){
            this.volumeLevel = newVolumeLevel;
        }
    }
    public void channelUp(){
        System.out.println("Channel Number increasing: "+ this.channel);
        if(on && (channel <= 120)){
            channel ++;
        }
    }
    public void channelDown(){
        System.out.println("Channel Number decreasing: "+ this.channel);
        if (on && (channel >= 1)){
            channel --;
        }
    }
    public void volumeUp(){
        System.out.println("Volume is increasing by: "+ this.volumeLevel);
        if (on && (volumeLevel <= 7)){
            volumeLevel++;
        }
    }
    public void volumeDown(){
        System.out.println("Volume is decreasing by: "+ this.volumeLevel);
        if(on && (volumeLevel >=1)){
            volumeLevel --;
        }
    }
    public String name;
}