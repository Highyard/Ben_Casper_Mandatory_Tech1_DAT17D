package com.example.demo.domains;

import com.example.demo.utilities.WriterReader;

import java.util.ArrayList;

public class UserRepository {

    public ArrayList<Child> children = new ArrayList<>();


    public ArrayList<Child> fetchChildren(){
        return children;
    }






        WriterReader writerReader = new WriterReader();
    public boolean saveTofile(){

        return writerReader.writeObjectTooFile(children);
    }

    public boolean readFromfile(){


        children = writerReader.readObjectFromFile(WriterReader.filepath);

        return true;
    }


}
