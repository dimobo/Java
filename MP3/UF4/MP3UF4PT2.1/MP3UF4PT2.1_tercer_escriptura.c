#include <stdio.h> 
#include <stdlib.h> 

int main() {
    // Primer crearem el punter i les variables que usarem
    // Per al programa.
    int* ptr;
    int* ptr2;
    int i, n, s;

    // Ara indicarem quants elements tindra el nostre punter
    n = 11;
    s = 50;

    // Li donarem un volum de forma dinamica a la memoria que necesitarem usant el malloc.
    ptr = (int*)malloc(n * sizeof(int));
    ptr2 = (int*)malloc(s * sizeof(int));

    // Antes de seguir amb el programa ens asegurarem que tenim la memoria disponible.
    if (ptr == NULL) { 
        printf("Memòria no assignada.\n"); 
        exit(0); 
    }
    else {
        // En cas de que la memoria ha sigut assignada correctament obtindrem aquest missatge i
        // Podrem seguir amb el nostre programma.
        printf("La memòria ha sigut assignada correctament usant el malloc.\n");

        // Ara assignarem valors al ptr però anant fora del mateix.
        for (i = 0; i < n; ++i) { 
            ptr[i+5] = i + 1; 
        } 

        // Ara imprimirem els valors del nostre ptr1.
        printf("Valors del ptr1: \n"); 
        for (i = 0; i < n; ++i) { 
            printf("%d ,", ptr[i]); 
        }

        // Ara imprimirem els valors del nostre ptr2.
        // Per veure si l'hem escrit des del ptr primer.
        printf("\nValors del ptr2: \n"); 
        for (i = 0; i < s; ++i) { 
            printf("%d ,", ptr2[i]); 
        } 

        // Com podem veure no s'ha sobre escrit el ptr2

        free(ptr);
    }

    return 0;
}