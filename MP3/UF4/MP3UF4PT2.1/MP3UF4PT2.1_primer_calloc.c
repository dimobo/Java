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

        // Ara imprimirem els valors del nostre ptr.
        printf("Taula de multiplicar del 1: \n"); 
        for (i = 0; i < n; ++i) { 
            printf("%d x 1 = %d \n", i,ptr[i]); 
        } 

        free(ptr);
    }

    // Tornarem a executar les comandes del principi però de moment
    // Sense assignar cap valor.
    int* ptr2; 
    n = 11; 
    ptr2 = (int*)calloc(n , sizeof(int));

    // Imprimirem de nou els valors actuals del ptr per veure si es guarden
    // Els de l'anterior ptr.
    printf("\nValors actuals sense editar del ptr: \n");     
    for (i = 0; i < n; ++i) { 
            printf("%d, ", ptr2[i]); 
        } 

    // Antes de seguir amb el programa ens asegurarem que tenim la memoria disponible.
    if (ptr == NULL) { 
        printf("\n\nMemòria no assignada.\n"); 
        exit(0); 
    }
    else {
        // En cas de que la memoria ha sigut assignada correctament obtindrem aquest missatge i
        // Podrem seguir amb el nostre programma.
        printf("\n\nLa memòria ha sigut assignada correctament usant el calloc.\n");

        // Ara assignarem valors al ptr.
        for (i = 0; i < n; ++i) { 
            ptr[i] = i * 1; 
        } 

        // Ara imprimirem els valors del nostre ptr.
        printf("Taula de multiplicar del 1: \n"); 
        for (i = 0; i < n; ++i) { 
            printf("%d x 1 = %d \n", i,ptr[i]); 
        } 

        free(ptr);
    }


    return 0;
}