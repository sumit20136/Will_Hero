package com.example.ap_final_project_72;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceManager {

    public static void save(Serializable data, String fileName) throws Exception {
        ObjectOutputStream game = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
        game.writeObject(data);
    }

    public static Object load(String fileName) throws Exception {
        ObjectInputStream game = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)));
        return game.readObject();
    }
}