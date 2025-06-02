# FindMax (variabili inserite nel programma visibili da console)
Utilizzando gli array [] inizializzati vengono inseriti nel programma dei numeri casuali
ad es. {5, 12, 8, 3, 20, 7} con il ciclo for-each assengamo ad un elemento il valore
max che l'array trova attraverso l'iterazione i numeri vengono ciclati e messi a comparazione.
-----------------------------------------------------------------------------------------------------------
# Esempio: 
1. Inizialmente: max = 5 (primo elemento)
2. Prima iterazione: 5 > 5? No → max resta 5
3. Seconda iterazione: 12 > 5? Sì → max = 12 
4. Terza iterazione: 8 > 12? No → max resta 12 
5. Quarta iterazione: 3 > 12? No → max resta 12 
6. Quinta iterazione: 20 > 12? Sì → max = 20 
7. Sesta iterazione: 7 > 20? No → max resta 20

- Output finale: Il numero più grande è 20 
- Questa è una soluzione elegante ed efficiente (O(n)) per trovare il massimo in un array.
-----------------------------------------------------------------------------------------------------------
# FindMaxCount (variabili richiesta all'utente)
-----------------------------------------------------------------------------------------------------------
1. Impostazione Scanner: Aggiungiamo import java.util.Scanner per leggere l'input.
-----------------------------------------------------------------------------------------------------------
2. Input della dimensione:
- Chiediamo all'utente quanti numeri vuole inserire
- Leggiamo questo valore con scanner.nextInt()
-----------------------------------------------------------------------------------------------------------
3. Creazione array:
- Creiamo un array numbers della dimensione specificata
-----------------------------------------------------------------------------------------------------------
4. Riempimento array:
- Con un ciclo for, chiediamo all'utente di inserire ogni numero
- Ogni numero viene memorizzato nell'array
-----------------------------------------------------------------------------------------------------------
5. Ricerca del massimo:
- La logica per trovare il massimo rimane identica alla versione orginale
- Confronto di ogni elemento con il massimo corrente
-----------------------------------------------------------------------------------------------------------
6. Stampa il numero più grande trovato
-----------------------------------------------------------------------------------------------------------
7. Chiusura Scanner:
- Chiudiamo lo scanner per liberare risorse
