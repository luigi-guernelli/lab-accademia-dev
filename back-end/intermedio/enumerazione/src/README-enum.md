# Enum (enumerazione) in java
Le enum (abbreviazione di enumerazione) in java sono un tipo speciale di classe
che rappresenta un gruppo di costanti valori fissi e immutabili.
Sono state introdotte in java e forniscono un modo sicuro,
leggile ed efficiente per definire un insieme di costanti.
---------------------------------------------------------------------------------------------------------------------------------
# Caratteristiche principali delle enum:
<b>1. Rappresentano un insieme fisso di costanti:</b> 
Es. giorni delle settimana, mesi, stati di un processo ecc. <br>
<b>2. Sono type-safe:</b> Il compilatore controlla che vengano usati solo valori validi. <br>
<b>3. Sono oggetti:</b> A differenza delle semplici costanti, le enum sono istanze di una classe e possono avere metodi e campi
---------------------------------------------------------------------------------------------------------------------------------
# Esempio base 
public enum GiornoSettimana {
LUNEDI,
MARTEDI,
MERCOLEDI,
GIOVEDI,
VENERDI,
SABATO,
DOMENICA
}
---------------------------------------------------------------------------------------------------------------------------------
# Vantaggi rispetto alle costanti tradizionali:
<b>1. Migliore leggibilità:</b><em>GiornoSettimana.LUNEDI</em> è più espressivo di 1 (se usassimo numeri interi).<br>
<b>2. Controllo del compilatore:</b> Previene errori come l'uso di valori non validi. <br>
<b>3. Possibilità di aggiungere comportamenti:</b> Le enum possono avere metodi e campi.
---------------------------------------------------------------------------------------------------------------------------------
# Quando usare le enum:
- Quando hai un insieme fisso e noto a priori di valori
- Quando questi valori non cambieranno durante l'esecuzione del programma
- Quando vuoi associare comportamenti specifici a ciascun valore
- Le enum sono particolarmente utili con gli statement switch, come mostrato nel tuo esempio originale, perché rendono il codice più chiaro e meno soggetto a errori.
