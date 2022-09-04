package State;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Transitions {
    public static void getSleep(int i) throws InterruptedException {
        TimeUnit.SECONDS.sleep(i);
    }
    //Reusable method to clear the console
    public static void ClearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
//
//            if (operatingSystem.contains("Windows")) {
//                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
//                Process startProcess = pb.inheritIO().start();
//                startProcess.waitFor();
//            }
//            else {
//                ProcessBuilder pb = new ProcessBuilder("clear");
//                Process startProcess = pb.inheritIO().start();
//                startProcess.waitFor();
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }
}
