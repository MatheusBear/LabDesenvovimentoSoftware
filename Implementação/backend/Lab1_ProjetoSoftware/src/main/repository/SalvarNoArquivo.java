package main.repository;

import main.model.Disciplina;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class SalvarNoArquivo implements Persistencia{

    @Override
    public boolean serializar(String path, Object obj) {
        try {
            Path filePath = Paths.get(path);
           // if(Files.notExists(filePath)){
           //     return false;
           // }

            FileOutputStream outFile = new FileOutputStream(path);
            ObjectOutputStream s = new ObjectOutputStream(outFile);
            s.writeObject(obj);
            s.close();
            return true;
        }catch (Exception e){e.printStackTrace();return false;}
    }

    @Override
    public Object deserializar(String path) throws Exception {
        Path filePath = Paths.get(path);
        if(Files.notExists(filePath)){
            return new LinkedList<>();
        }else {
            FileInputStream inFile = new FileInputStream(path);
            ObjectInputStream d = new ObjectInputStream(inFile);
            Object o = d.readObject();
            d.close();
            return o;
        }
    }

    @Override
    public Object carregarArquivo(String path) throws Exception {
        Path filePath = Paths.get(path);
        if(Files.notExists(filePath)){
            return new LinkedList<>();
        }else {
            FileInputStream inFile = new FileInputStream(path);
            ObjectInputStream d = new ObjectInputStream(inFile);
            Object o = d.readObject();
            d.close();
            return o;
        }
    }
}
