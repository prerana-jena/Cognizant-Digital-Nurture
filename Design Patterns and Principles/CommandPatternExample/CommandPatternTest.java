package CommandPatternExample;

public class CommandPatternTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        
        RemoteController remoteController = new RemoteController();
        
        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();
        
        remoteController.setCommand(lightOffCommand);
        remoteController.pressButton();
    }
    
}
