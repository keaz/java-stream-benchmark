## Benchmark Result of Java Stream API

Benchmark was setup using the *JMH (Java Microbenchmark Harness)* and executed multiple times on docker container using *4 cores and different size of data sets*. 
Each execution had 40 iterations two warmups. 
Benchmark was divided into four categories.

1. ToString object on ArrayList (arrayListParallelStream/arrayListSequentialStream)
2. ToString object on LinkedList (linkedListParallelStream/linkedListSequentialStream)
3. Sort objects on ArrayList (arrayListSortedParallelStream/arrayListSortedSequentialStream) 
4. Sort objects on LinkedList (linkedListSortedParallelStream/linkedListSortedSequentialStream)

ToString is an independent operation.\
Sort is an operation that depends on other elements.

### How to Run

Execute run.sh by giving the cpu count.

```
./run.sh 4
```

#### 4 CPUs & 1000 data & bound 100

|Benchmark|Mode|Cnt|Score|Error|Units|
|:---|----:|---:|---|---:|---:|
|ObjectBenchmark.arrayListParallelStream           |thrpt   |40    |9302.546 |±   505.696|  ops/s|
|ObjectBenchmark.arrayListSequentialStream         |thrpt   |40  |101613.373 |± 11504.124|  ops/s|
|ObjectBenchmark.arrayListSortedParallelStream     |thrpt   |40    |2916.844 |±    65.372|  ops/s|
|ObjectBenchmark.arrayListSortedSequentialStream   |thrpt   |40    |6886.306 |±   208.938|  ops/s|
|ObjectBenchmark.linkedListParallelStream          |thrpt   |40    |8766.780 |±   788.235|  ops/s|
|ObjectBenchmark.linkedListSequentialStream        |thrpt   |40  |109014.932 |±  1433.699|  ops/s|
|ObjectBenchmark.linkedListSortedParallelStream    |thrpt   |40    |3249.623 |±   216.470|  ops/s|
|ObjectBenchmark.linkedListSortedSequentialStream  |thrpt   |40    |7157.674 |±   212.031|  ops/s|

#### 4 CPUs & 10000 data & bound 1000

|Benchmark|Mode|Cnt|Score|Error|Units|
|:---|----:|---:|---|---:|---:|
|ObjectBenchmark.arrayListParallelStream           |thrpt   |40   |5426.069 |±  42.573|  ops/s|
|ObjectBenchmark.arrayListSequentialStream         |thrpt   |40   |8040.506 |± 140.324|  ops/s|
|ObjectBenchmark.arrayListSortedParallelStream     |thrpt   |40    |818.813 |±  18.134|  ops/s|
|ObjectBenchmark.arrayListSortedSequentialStream   |thrpt   |40    |491.794 |±  14.803|  ops/s|
|ObjectBenchmark.linkedListParallelStream          |thrpt   |40   |3869.621 |±  30.037|  ops/s|
|ObjectBenchmark.linkedListSequentialStream        |thrpt   |40  |11010.577 |± 266.289|  ops/s|
|ObjectBenchmark.linkedListSortedParallelStream    |thrpt   |40    |808.992 |±  28.201|  ops/s|
|ObjectBenchmark.linkedListSortedSequentialStream  |thrpt   |40    |486.503 |±   5.628|  ops/s|

#### 4 CPUs & 100000 data & bound 10000

|Benchmark|Mode|Cnt|Score|Error|Units|
|:---|----:|---:|---|---:|---:|
|ObjectBenchmark.arrayListParallelStream           |thrpt   |40  |1131.690 |± 19.712  |ops/s|
|ObjectBenchmark.arrayListSequentialStream         |thrpt   |40   |509.530 |± 10.693  |ops/s|
|ObjectBenchmark.arrayListSortedParallelStream     |thrpt   |40    |70.505 |±  1.074  |ops/s|
|ObjectBenchmark.arrayListSortedSequentialStream   |thrpt   |40    |29.227 |±  0.792  |ops/s|
|ObjectBenchmark.linkedListParallelStream          |thrpt   |40   |206.709 |± 27.246  |ops/s|
|ObjectBenchmark.linkedListSequentialStream        |thrpt   |40   |415.450 |± 10.062  |ops/s|
|ObjectBenchmark.linkedListSortedParallelStream    |thrpt   |40    |62.660 |±  1.207  |ops/s|
|ObjectBenchmark.linkedListSortedSequentialStream  |thrpt   |40    |24.645 |±  0.344  |ops/s|


#### 4 CPUs & 1000000 data & bound 100000

|Benchmark|Mode|Cnt|Score|Error|Units|
|:---|----:|---:|---|---:|---:|
|ObjectBenchmark.arrayListParallelStream           |thrpt   |40  |60.695 |± 2.000  |ops/s|
|ObjectBenchmark.arrayListSequentialStream         |thrpt   |40  |44.306 |± 0.603  |ops/s|
|ObjectBenchmark.arrayListSortedParallelStream     |thrpt   |40   |2.905 |± 0.334  |ops/s|
|ObjectBenchmark.arrayListSortedSequentialStream   |thrpt   |40   |1.263 |± 0.109  |ops/s|
|ObjectBenchmark.linkedListParallelStream          |thrpt   |40   |5.160 |± 0.335  |ops/s|
|ObjectBenchmark.linkedListSequentialStream        |thrpt   |40  |22.356 |± 0.213  |ops/s|
|ObjectBenchmark.linkedListSortedParallelStream    |thrpt   |40   |2.768 |± 0.058  |ops/s|
|ObjectBenchmark.linkedListSortedSequentialStream  |thrpt   |40   |1.166 |± 0.085  |ops/s|

#### 1 CPUs & 1000000 data & bound 100000

|Benchmark|Mode|Cnt|Score|Error|Units|
|:---|----:|---:|---|---:|---:|
|ObjectBenchmark.arrayListParallelStream           |thrpt   |40   |57.899 |± 0.822  |ops/s|
|ObjectBenchmark.arrayListSequentialStream         |thrpt   |40  |116.311 |± 4.289  |ops/s|
|ObjectBenchmark.arrayListSortedParallelStream     |thrpt   |40    |2.042 |± 0.199  |ops/s|
|ObjectBenchmark.arrayListSortedSequentialStream   |thrpt   |40    |2.661 |± 0.044  |ops/s|
|ObjectBenchmark.linkedListParallelStream          |thrpt   |40   |18.645 |± 0.362  |ops/s|
|ObjectBenchmark.linkedListSequentialStream        |thrpt   |40   |31.582 |± 4.858  |ops/s|
|ObjectBenchmark.linkedListSortedParallelStream    |thrpt   |40    |2.484 |± 0.257  |ops/s|
|ObjectBenchmark.linkedListSortedSequentialStream  |thrpt   |40    |1.482 |± 0.032  |ops/s|

------------
When the data set is small sequential operations perform better than parallel. 
The difference is significant in independent on operations. 
There is an extra **overhead when forking (splitting) and joining** the task. 
This overhead is visible in when we use a small data set. \  
When the data set gets increased, this overhead is less visible compared to the time it takes to do the operations.

