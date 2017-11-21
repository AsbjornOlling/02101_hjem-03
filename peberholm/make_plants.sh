#!/bin/bash

cp plant_template.java Tree.java
cp plant_template.java Flower.java
cp plant_template.java Moss.java
cp plant_template.java Bush.java

sed -i 's/<Type>/<Tree>/g' Tree.java
sed -i 's/<TYPE>/<TREE>/g' Tree.java

sed -i 's/<Type>/<Flower>/g' Flower.java
sed -i 's/<TYPE>/<FLOWER>/g' Flower.java

sed -i 's/<Type>/<Moss>/g' Moss.java
sed -i 's/<TYPE>/<MOSS>/g' Moss.java

sed -i 's/<Type>/<Bush>/g' Bush.java
sed -i 's/<TYPE>/<BUSH>/g' Bush.java
