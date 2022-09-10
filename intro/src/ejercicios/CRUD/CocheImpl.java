package ejercicios.CRUD;

import java.util.ArrayList;

public class CocheImpl implements CocheCRUD {

    
    ArrayList<String> coches = new ArrayList<>();

    @Override
    public void save(String coche) {
        coches.add(coche);
    }

    @Override
    public void delete(String coche) {
        coches.remove(coche);
    }

    @Override
    public ArrayList<String> findAll() {
        return coches;
    }


    
}
