# ArrayList
- Una lista dinamica che può crescere o ridursi a runtime.
- Non ha una dimensione fissa, si espande automaticamente.
-------------------------------------------------------------------------
# Sintassi (java)
import java.util.ArrayList; // Import necessario

ArrayList<String> nomi = new ArrayList<>(); // Lista vuota
nomi.add("Alice"); // Aggiunge un elemento
nomi.remove(0); // Rimuove l'elemento all'indice 0
--------------------------------------------------------------------------------------
# Vantaggi
- Si puo aggiungere / rimuovere elementi facilmente.
- Ha metodi utili come .get(), size(), .contains().
--------------------------------------------------------------------------------------
# Esempio pratico
// Array
int[] voti = {18, 25, 30};
System.out.println(voti[1]); // 25

// ArrayList
ArrayList<Integer> votiList = new ArrayList<>();
votiList.add(18);
votiList.add(25);
System.out.println(votiList.get(1)); // 25
---------------------------------------------------------------------------------------
- Usa un array se sai già quanti elementi ti servono (più veloce).
- Usa ArrayList se hai bisogno di flessibilità (aggiungere/rimuovere elementi spesso).