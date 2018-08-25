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
public class LoggerBillPughSingleton {

    private static class LoggerBillPughSingletonHelper {
        private static LoggerBillPughSingleton INSTANCE = new LoggerBillPughSingleton();
    }

    private String filePath = "system.log";

    private LoggerBillPughSingleton() {
        File logFile = new File(filePath);
        if (!logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static LoggerBillPughSingleton getInstance() {
        return LoggerBillPughSingletonHelper.INSTANCE;
    }

    public void writeMessage(String message) throws IOException {
        Files.write(
          Paths.get(filePath),
          (message + System.lineSeparator()).getBytes(),
          StandardOpenOption.APPEND);
    }

}
