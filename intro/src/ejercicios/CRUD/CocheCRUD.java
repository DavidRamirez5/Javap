package ejercicios.CRUD;

import java.util.ArrayList;

public interface CocheCRUD {
    
    public void save(String coche);
    public void delete(String coche);
    public ArrayList<String> findAll();
}
