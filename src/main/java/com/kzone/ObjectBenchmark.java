//package com.kzone;
//
//import org.openjdk.jmh.annotations.Benchmark;
//import org.openjdk.jmh.annotations.BenchmarkMode;
//import org.openjdk.jmh.annotations.Fork;
//import org.openjdk.jmh.annotations.Mode;
//import org.openjdk.jmh.infra.Blackhole;
//
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//@Fork(value = 2, warmups = 2, jvmArgs = {"-Xms4G", "-Xmx4G"})
//@BenchmarkMode(Mode.Throughput)
//public class ObjectBenchmark {
//
//    private static final Function<Data, String> TO_STRING = data -> data.getString();
//    private static final Comparator<Data> DATA_COMPARATOR = Comparator.comparingInt(Data::getInteger);
//
//    @Benchmark
//    public void linkedListSequentialStream(LinkedDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<String> collect = dataList.stream().map(TO_STRING).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void linkedListParallelStream(LinkedDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<String> collect = dataList.parallelStream().map(TO_STRING).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void linkedListSortedSequentialStream(LinkedDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<Data> collect = dataList.stream().sorted(DATA_COMPARATOR).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void linkedListSortedParallelStream(LinkedDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<Data> collect = dataList.parallelStream().sorted(DATA_COMPARATOR).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    // Array List starts
//    @Benchmark
//    public void arrayListSequentialStream(ArrayDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<String> collect = dataList.stream().map(TO_STRING).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void arrayListParallelStream(ArrayDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<String> collect = dataList.parallelStream().map(TO_STRING).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void arrayListSortedSequentialStream(ArrayDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<Data> collect = dataList.stream().sorted(DATA_COMPARATOR).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//    @Benchmark
//    public void arrayListSortedParallelStream(ArrayDataProvider dataProvider, Blackhole blackhole) {
//        List<Data> dataList = dataProvider.dataList;
//        List<Data> collect = dataList.parallelStream().sorted(DATA_COMPARATOR).collect(Collectors.toList());
//        blackhole.consume(collect);
//    }
//
//}
