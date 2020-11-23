package com.kzone;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

import java.util.function.IntUnaryOperator;

@Fork(value = 2, warmups = 2, jvmArgs = {"-Xms4G", "-Xmx4G"})
@BenchmarkMode(Mode.Throughput)
public class PrimitiveBenchmark {

    private static final IntUnaryOperator SQUARE = integer -> integer * integer;

    @Benchmark
    public void linkedListSequentialStream(LinkedIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.map(SQUARE).count());
    }

    @Benchmark
    public void linkedListParallelStream(LinkedIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.parallel().map(SQUARE).count());
    }

    @Benchmark
    public void linkedListSumSequentialStream(LinkedIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.sum());
    }

    @Benchmark
    public void linkedListSumParallelStream(LinkedIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.parallel().sum());
    }

    // Array List starts
    @Benchmark
    public void arrayListSequentialStream(ArrayListIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.map(SQUARE).count());
    }

    @Benchmark
    public void arrayListParallelStream(ArrayListIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.parallel().map(SQUARE).count());
    }

    @Benchmark
    public void arrayListSumSequentialStream(ArrayListIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.sum());
    }

    @Benchmark
    public void arrayListSumParallelStream(ArrayListIntegerProvider dataProvider, Blackhole blackhole) {
        blackhole.consume(dataProvider.intStream.parallel().sum());
    }

}
