# n° 3: Negozio di abbigliamento
Si consideri l'entità Abito con i seguenti attributi:
- id (identificativo univoco dell’abito)
- tipo (tipologia, es. 'pd'->pantalone donna, 'pu'->pantalone uomo, ecc...)
- marca (marca del dell’abito)
- taglia
- prezzo
In base alla proprietà OOP ereditarietà, e nell’approccio MVC, scrivere tre classi model (pantalone, camicia, e maglione) che sono figlie della classe padre abito.
Implementare, nell'ordine scelto dal candidato, una o più tra le seguenti funzionalità:
- un web service REST utilizzando Spring Boot, che in json implementa le operazioni tipiche del CRUD applicate in questo contesto specifico.
- la funzionalità di archiviazione nel database delle istanze (record) delle entità precedentemente definite, predisponendo l'interfaccia utente di inserimento dati relativa attraverso una form html.
- Scrivere un progetto utilizzando il framework Angular in grado di rappresentare una pagina web con tutte le schede degli abiti appartenenti ad una certa categoria (es. pantaloni uomo). Una pagina iniziale deve avere la lista delle categorie e, selezionata la categoria, deve apparire una pagina con tutti gli abiti di detta categoria. Utilizzare le components disponibili nella libreria bootstrap.
- Scrivere un documento finale dove si descrivono i progetti sviluppati, gli ambienti di sviluppo usati per svilupparli ed i test che sono stati fatti alla fine della fase dello sviluppo.
Condizioni di sviluppo
Utilizzare il framework: Angular per il client e le components messe a disposizione da Bootstrap. Utilizzare il JDK installato sulla postazione assegnata per gli sviluppi in java. Utilizzare il DBMS MySQL per la parte di SQL. Scegliere l’IDE più opportuno per ognuno dei software richiesti.
