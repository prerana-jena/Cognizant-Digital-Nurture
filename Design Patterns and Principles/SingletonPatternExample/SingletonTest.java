public class SingletonTest {
    public static void main(String[] args)
    {
        Logger logger1= Logger.getInstance();
        Logger logger2= Logger.getInstance();
        logger1.Log("Application started");
        logger2.Log("Application running");
        if(logger1==logger2)
        {
            System.out.println("Only one logger instances exists");
        }
        else
        {
            System.out.println("Multiple logger instances exist");
        }
    }
}
