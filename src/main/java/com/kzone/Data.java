package com.kzone;

import java.util.Objects;

public class Data implements Comparable<Data>{

    private String string;
    private int integer;

    public Data(String string, int integer) {
        this.string = string;
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public int getInteger() {
        return integer;
    }

    @Override
    public int compareTo(Data o) {
        return string.compareTo(o.string);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return integer == data.integer &&
                string.equals(data.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, integer);
    }
}
