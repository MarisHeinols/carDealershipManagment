package Storage.utils;

import Storage.Storage;
import Storage.ShowRoom;

public class StorageAdapter extends Storage {
    private ShowRoom storage;

    public StorageAdapter(ShowRoom storage) {
        this.storage = storage;
    }

    @Override
    public double getArea(){
        double side = Math.sqrt(storage.radius*2);
        return side*side;
    }
}
