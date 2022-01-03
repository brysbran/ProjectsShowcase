//JC confuses the hell out of everyone

public class GameSave
{
  private ReadSaveFile readSaveFile;
  private WriteSaveFile writeSaveFile;
  private Events events;
  private final String path = "";
  private boolean saveGame;


  public GameSave(Events events) {
    this.events = events;
    readSaveFile = new ReadSaveFile(events);
    writeSaveFile = new WriteSaveFile(events);
  }
  
  public boolean checkForSave(boolean saveGame) {
    if(saveGame) {
      readSaveFile.readFile(path);
      return true;
    }
    else {
      writeSaveFile.createFile();
      return false;
    }
  }


  public void saveTheGame(){
    if(writeSaveFile.writeSaveFile(path)) {

    }
  }

  public void loadSave() {

  }

}
