package com.fierlion.datastructs;

public interface Iterator {
    public void first();
    public boolean isDone();
    public void next();
    public Integer current() throws Exception;
}
