package core.log.concrete;

import core.log.abstracts.ILog;

public class FileLogger implements ILog {
    @Override
    public void log() {
        System.out.println("Logged to file.");
    }
}
