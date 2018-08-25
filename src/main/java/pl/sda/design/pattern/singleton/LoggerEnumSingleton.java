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
public enum  LoggerEnumSingleton {
    INSTANCE;

    private String filePath = "system.log";

    LoggerEnumSingleton() {
        File logFile = new File(filePath);
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeMessage(String message) throws IOException {
        Files.write(
          Paths.get(filePath),
          (message + System.lineSeparator()).getBytes(),
          StandardOpenOption.APPEND);
    }

}
