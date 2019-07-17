#!/usr/bin/env bash

cd golang
export GOOS=linux
go build -o application cmd.go
docker build -t ipv4sec/golang:v1 .
cd ..

cd java
mvn package
docker build -t ipv4sec/java:v1 .
cd ..

cd nodejs
docker build -t ipv4sec/nodejs:v1 .
cd ..

cd php
docker build -t ipv4sec/php:v1 .
cd ..

cd python
docker build -t ipv4sec/python:v1 .
cd ..