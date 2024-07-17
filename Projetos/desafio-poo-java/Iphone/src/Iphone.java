
public class Iphone implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {

  
  

  @Override
  public void pause() {
    System.out.println("Pausing the music");
    
  }

  @Override
  public void play() {
    System.out.println("Playing the music");
    
  } 

  @Override
  public void selectMusic(String music) {
    System.out.println("Selecting music: " + music);
    
  }

  @Override
  public void addPage() {
    System.out.println("Adding a new page");
    
  }

  @Override
  public void refreshPage() {
    System.out.println("Refreshing the page");
    
  }

  @Override
  public void showPage(String url) {
    System.out.println("Showing the page: " + url);
    
  }

  @Override
  public void accecptCall() {
    System.out.println("Accepting the call");
    
  }

  @Override
  public void call(String number) {
    System.out.println("Calling: " + number);
    
  }

  @Override
  public void voiceMail() {
    System.out.println("Showing the voice mail");
    
  }

}
