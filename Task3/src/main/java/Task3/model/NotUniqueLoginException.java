package Task3.model;


/**
 * Created by dvsta on 13.11.2017.
 */
public class NotUniqueLoginException extends RuntimeException {
    private Record record;

    public NotUniqueLoginException(Record record, String message) {
        super(message);
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }
}
