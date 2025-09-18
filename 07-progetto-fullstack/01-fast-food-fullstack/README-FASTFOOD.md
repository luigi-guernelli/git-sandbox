# Progetto FastFood 
 1️⃣ **Backend Java + Spring Boot**
 - E' stata creata una tabella prodotti che contiene i dati principali:
   - id        -> identificatore univoco (Chiave primaria), 
   - nome      -> nome del prodotto,
   - categoria -> tipologia (Panini, Bevende, Contorni),
   - prezzo    -> il costo di ogni prodotto min max averege,
   - immagine  -> riferimento all'immagine nel frontend.
------------------------------------------------------------------------------------------------
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
 - Utilizzato per la persistenza dei dati dei prodotti.
 - Configurato in Spring Boot tramite file application.properties o application.yml, specificando:
   - URL di connessione (jdbc:mysql://localhost:3306/fastfood_db)
   - Credenziali di accesso (username e password)
   - Dialect di Hibernate per MySQL

 ➡️ **MySQL permette di:**
- Archiviare i dati dei prodotti in modo strutturato
- Eseguire query SQL (SELECT, INSERT, UPDATE, DELETE)
- Effettuare statistiche (prezzo medio, massimo, minimo)
<hr>
 3️⃣ **Frontend Angular + BootStrap**
 - Collegamento con il Frontend
 - Realizzato con HTML, CSS, TypeScript, Angular e Bootstrap per lo stile responsive.
 - Le immagini dei prodotti sono gestite nella cartella src/assets/images.
 - Le categorie sono caricate dinamicamente tramite chiamate al backend.
 - E' presente un burger menu mobile per filtrare i prodotti in base a:
  - Prezzo medio
  - Prodotto più costoso
  - Prodotto meno costoso
<hr>
📌** Questa sintesi ti permette di mostrare chiaramente:**
- La struttura del backend (API + database + architettura)
- Le funzionalità del frontend (interfaccia + immagini + filtri dinamici)
