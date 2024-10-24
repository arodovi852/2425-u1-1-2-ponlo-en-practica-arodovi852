#include <stdio.h>

int main() {
    char nombre[30];
    printf("Introduce tu nombre: ");
    fgets(nombre, sizeof(nombre), stdin);
    printf("Hola %s Este programa esta hecho en el lenguaje de programacion: C", nombre);
    return 0;
} 

