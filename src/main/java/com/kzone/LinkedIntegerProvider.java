package com.kzone;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static com.kzone.App.BOUND;
import static com.kzone.App.DATA_COUNT;

@State(Scope.Benchmark)
public class LinkedIntegerProvider {

    private List<Integer> dataList;

    @Setup
    public void setup() {
        Random random = new Random();
        dataList = new LinkedList<>();
        for (int i = 0; i < DATA_COUNT; i++) {
            dataList.add(random.nextInt(BOUND));
        }

    }

    public IntStream getIntStream(){
        return dataList.stream().mapToInt(Integer::intValue);
    }

}