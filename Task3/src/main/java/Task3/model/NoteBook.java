package Task3.model;


import java.util.ArrayList;

/**
 * Created by dvsta on 12.11.2017.
 */
public class NoteBook {
    ArrayList<Record> recordArrayList;

    public NoteBook() {
        this.recordArrayList = new ArrayList<Record>();
    }

    public void addRecord(Record record) {
        for (Record currentRecord : recordArrayList){
            if (currentRecord.getNickName().equals(record.getNickName()))
                throw new NotUniqueLoginException(record, "Invalid login");
        }
        recordArrayList.add(record);
    }

    public ArrayList<Record> getRecordArrayList() {
        return recordArrayList;
    }
}
