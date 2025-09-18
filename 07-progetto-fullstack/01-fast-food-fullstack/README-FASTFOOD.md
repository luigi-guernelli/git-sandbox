# Progetto FastFood 
 1️⃣ **Backend Java + Spring Boot**
 - E' stata creata una tabella prodotti che contiene i dati principali:
   - id        -> identificatore univoco (Chiave primaria), 
   - nome      -> nome del prodotto,
   - categoria -> tipologia (Panini, Bevende, Contorni),
   - prezzo    -> il costo di ogni prodotto min max averege,
   - immagine  -> riferimento all'immagine nel frontend.
<hr>
 - Struttura architetturale: MVC + Repository + Service + Metodi HTTP
 - Il backend espone API REST tramite Spring Boot:<br>
   - GET /api/prodotti → restituisce tutti i prodotti<br>
   - GET /api/prodotti/{id} → restituisce un singolo prodotto<br>
   - POST /api/prodotti → inserisce un nuovo prodotto<br>
   - PUT /api/prodotti/{id} → aggiorna un prodotto <br>
   - DELETE /api/prodotti/{id} → elimina un prodotto <br>
➡️ Le API interagiscono con il database MySQL tramite JPA Repository. <br>
<hr>
 2️⃣ **Database – MySQL**
 - Utilizzato per la persistenza dei dati dei prodotti. <br>
 - Configurato in Spring Boot tramite file application.properties o application.yml, specificando: <br>
   - URL di connessione (jdbc:mysql://localhost:3306/fastfood_db) <br>
   - Credenziali di accesso (username e password) <br>
   - Dialect di Hibernate per MySQL <br>
<hr>
 ➡️ **MySQL permette di:** <br>
- Archiviare i dati dei prodotti in modo strutturato <br>
- Eseguire query SQL (SELECT, INSERT, UPDATE, DELETE) <br>
- Effettuare statistiche (prezzo medio, massimo, minimo) <br>
<hr>
 3️⃣ **Frontend Angular + BootStrap** <br>
 - Collegamento con il Frontend <br>
 - Realizzato con HTML, CSS, TypeScript, Angular e Bootstrap per lo stile responsive. <br>
 - Le immagini dei prodotti sono gestite nella cartella src/assets/images. <br>
 - Le categorie sono caricate dinamicamente tramite chiamate al backend. <br>
 - E' presente un burger menu mobile per filtrare i prodotti in base a: <br>
  - Prezzo medio <br>
  - Prodotto più costoso <br>
  - Prodotto meno costoso <br>
<hr>
📌** Questa sintesi ti permette di mostrare chiaramente:** <br>
- La struttura del backend (API + database + architettura) <br>
- Le funzionalità del frontend (interfaccia + immagini + filtri dinamici) <br>
