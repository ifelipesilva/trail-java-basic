public class SystemTv {
  boolean isOn = false;
  int currentChannel = 1;
  int currentVolume = 25;


  public void changeChannel(int channel) {
    currentChannel = channel;
  }

  public void increaseChannel(){
    currentChannel++;
  }


  public void decreaseChannel(){
    currentChannel--;
  }

  public void turnOn() { 
    isOn = true;
  }
  
  public void turnOff() {
    isOn = false;
  }

  public void increaseVolume() {
    currentVolume++;
  }

  public void decreaseVolume() {
    currentVolume--;
  }


  public static void main(String[] args) { 
    SystemTv systemTv = new SystemTv();

    systemTv.increaseVolume();
    systemTv.increaseVolume();
    systemTv.increaseVolume();
    systemTv.decreaseVolume();


    systemTv.increaseChannel();
    systemTv.increaseChannel();
    systemTv.decreaseChannel();


    


    System.out.println(" TV is On ? " + systemTv.isOn);
    System.out.println(" Actual channel : " + systemTv.currentChannel);
    System.out.println(" Actual volume : " + systemTv.currentVolume);


    systemTv.turnOn();
    System.out.println(" TV is On ? " + systemTv.isOn);
    systemTv.turnOff();
    System.out.println(" TV is On ? " + systemTv.isOn);


    systemTv.changeChannel(90);
    System.out.println(" Actual channel : " + systemTv.currentChannel);
    
    
  }

  
}
