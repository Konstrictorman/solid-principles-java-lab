package com.example.solid.isp;
import com.example.solid.isp.Worker;

public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Sin horario fijo de almuerzo.");
    }
}