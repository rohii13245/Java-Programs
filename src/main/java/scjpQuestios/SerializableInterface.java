package scjpQuestios;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableInterface implements Serializable {
    private int x,y;

    SerializableInterface(int x,int y){
        this.x=x;
        this.y=y;
    }

    private void writeObject(ObjectOutputStream s) throws IOException{
        s.writeObject(x);
        s.writeObject(y);
    }

    private void readObject(ObjectInputStream s)throws IOException{
        try {
            s.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializableInterface obj=new SerializableInterface(1,2);
        obj.writeObject();
    }

    private void writeObject() {
    }
}
