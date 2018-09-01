package pl.sda.design.pattern.singleton;

/**
 * Created by adam.
 *
 * This class must be a singleton.
 *
 * Synchronization is out of the box by the enum type (described in effective java).
 */
public enum FileSystemReader {
    INSTANCE;

    public void showDiskContent(String diskName) {
        System.out.println("Disk content is empty");
    }

}
