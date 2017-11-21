#!/bin/bash

cp Bush.java Tree.java
cp Bush.java Flower.java
cp Bush.java Moss.java

sed -i 's/Bush/Tree/g' Tree.java
sed -i 's/BUSH/TREE/g' Tree.java

sed -i 's/Bush/Flower/g' Flower.java
sed -i 's/BUSH/FLOWER/g' Flower.java

sed -i 's/Bush/Moss/g' Moss.java
sed -i 's/BUSH/MOSS/g' Moss.java

