package main.repository;

public interface Persistencia {
    boolean serializar(String path, Object obj);
    Object deserializar(String path) throws Exception;

    Object carregarArquivo (String path)throws Exception;
}
