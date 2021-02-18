#include <stdio.h> 
#include <stdlib.h> 

int main() {
    // Primer crearem el punter i les variables que usarem
    // Per al programa.
    int* ptr; 
    int i, n;

    // Ara indicarem quants elements tindra el nostre punter
    n = 11; 

    // Li donarem un volum de forma dinamica a la memoria que necesitarem usant el calloc.
    ptr = (int*)calloc(n , sizeof(int));

    // Antes de seguir amb el programa ens asegurarem que tenim la memoria disponible.
    if (ptr == NULL) { 
        printf("Memòria no assignada.\n"); 
        exit(0); 
    }
    else {
        // En cas de que la memoria ha sigut assignada correctament obtindrem aquest missatge i
        // Podrem seguir amb el nostre programma.
        printf("La memòria ha sigut assignada correctament usant el calloc.\n");

        // Ara assignarem valors al ptr.
        for (i = 0; i < n; ++i) { 
            ptr[i] = i * 1; 
        } 

        // Ara reasignarem el tamany de ptr amb el realloc donant-li menys espai
        // A veure que passa.
        ptr = realloc(ptr, 4);

        // Com podem veure fa coses rares al executar el codi.

        // Ara imprimirem els valors del nostre ptr.
        printf("Taula de multiplicar del 1: \n"); 
        for (i = 0; i < n; ++i) { 
            printf("%d x 1 = %d \n", i,ptr[i]); 
        } 

        free(ptr);
    }

    return 0;
}