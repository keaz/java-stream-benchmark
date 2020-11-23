#!/bin/zsh
echo "Number of CPUs $1"
mvn clean install -DskipTests
docker build -t demo-stream .
docker run -it --cpus="$1"  demo-stream
