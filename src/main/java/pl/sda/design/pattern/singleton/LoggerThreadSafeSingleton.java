package pl.sda.design.pattern.singleton;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by adam.
 *
 * Singleton implementation double checked locking
 */
public class LoggerThreadSafeSingleton {

    private static volatile LoggerThreadSafeSingleton INSTANCE;

    private String filePath = "system.log";

    private LoggerThreadSafeSingleton() {
        File logFile = new File(filePath);
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static LoggerThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LoggerThreadSafeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LoggerThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public void writeMessage(String message) throws IOException {
        Files.write(
          Paths.get(filePath),
          (message + System.lineSeparator()).getBytes(),
          StandardOpenOption.APPEND);
    }

}
