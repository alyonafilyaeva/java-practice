package laba7;

import java.util.Objects;

public class Shoes extends Product implements Comparable<Shoes>, Cloneable {
    private int size;

    public Shoes(String title, String type, Cost cost, int size) {
        super(title, type, cost);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Купи нас! " + "Мы очень удобные " + super.title + " " + size + " pазмера";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoes shoes = (Shoes) o;
        return size == shoes.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public Shoes clone() throws CloneNotSupportedException {
        Shoes clone = (Shoes) super.clone();
        return clone;
    }

    @Override
    public int compareTo(Shoes o) {
        return Integer.compare(size, o.size);
    }
}
