package core.log.concrete;

import core.log.abstracts.ILog;

public class DatabaseLogger implements ILog {
    @Override
    public void log() {
        System.out.println("Veri tabanına loglandı.");
    }
}
