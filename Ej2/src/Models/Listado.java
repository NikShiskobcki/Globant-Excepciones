package Models;

import java.util.ArrayList;

public class Listado {
    private ArrayList<Integer> lista;
    private int size;

    public Listado() {
    }

    public Listado(ArrayList<Integer> lista, int size) {
        this.lista = lista;
        this.size = size;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Listado{" +
                "lista=" + lista +
                ", size=" + size +
                '}';
    }
}
