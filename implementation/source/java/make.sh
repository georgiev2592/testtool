#!/bin/sh
find . -name "*.java" | xargs javac -cp "libraries/*"

jar cfm Main.jar jar.manifest *.class testtool
