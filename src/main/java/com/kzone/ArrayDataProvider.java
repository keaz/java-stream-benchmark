package com.kzone;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static com.kzone.App.BOUND;
import static com.kzone.App.DATA_COUNT;

@State(Scope.Benchmark)
public class ArrayDataProvider {

    public List<Data> dataList;

    @Setup
    public void setup() {
        Random random = new Random();
        dataList = new ArrayList<>();
        for (int i = 0; i < DATA_COUNT; i++) {
            dataList.add(new Data(UUID.randomUUID().toString(),random.nextInt(BOUND)));
        }
    }

}