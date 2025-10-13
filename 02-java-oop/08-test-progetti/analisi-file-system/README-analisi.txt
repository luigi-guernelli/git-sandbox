> Nome.Cognome: Luigi Guernelli
> Progetto: AnalisiFileSystem.java (console)
> Linguaggio: Java OOP
> IDE: IntelliJ Comunity
> Versione: 1.0
==============================================================================================
> Obiettivi/
|- Un applicazione da console che consente all'utente di:
\\
> Navigare in una directory 
> Contare file, cartelle e sotto-cartelle
> Cercare parole all'interno dei file
> Salvare i risultati su .txt e .csv
> Supportare la serializzazione per salvataggi/stati
==============================================================================================
> Classi Prinicipali
\\
>✅ 1.AnalisiFileSystem.java  (main)
>✅ 2.CercaPath.java          (controllo path esistente)
>✅ 3.CercaFile.java          (ricerca file per nome o estensione)
>✅ 4.CercaParola.java        (cerca parola specifica dentro i file)
>✅ 5.RisultatiContatori.java (classe per incapusalere gli obj (classe bean))
>✅ 6.GestioneFile.java       (Scrive e legge risultati da .txt / .csv)
==============================================================================================
> Persistenza e serializzazione
\\
> Persistenza: -Scrittura dei risultati su file .txt e .csv
> FileWriter writer = new FileWriter("risultati.csv");
> BufferedWriter buffer = new BufferedWriter(writer);
==============================================================================================
> Esempio flusso operativo
1. L'utente avvia AnalisiFileSystem.java
2. Sceglie il percorso
3. Il programma esplora la directory
4. Contra il file/cartelle
5. Cerca parole nei file
6. Visualizza Contatori a video
7. Salva i risultati in .txt .csv
8. Serializza lo stato per caricarlo in una futura sessione
--