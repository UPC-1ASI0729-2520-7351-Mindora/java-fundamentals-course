#!/bin/bash
# Script para compilar y ejecutar un archivo Java

echo "Compilando $1.java..."
javac $1.java

if [ $? -eq 0 ]; then
  echo "Compilación exitosa. Ejecutando..."
  java $1
else
  echo "Error en la compilación."
fi
