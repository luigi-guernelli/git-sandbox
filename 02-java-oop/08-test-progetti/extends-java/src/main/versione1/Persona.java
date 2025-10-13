package main.versione1;

public class Persona {
    protected String nome;
    protected String cognome;
    protected String codiceFiscale;
    protected int eta;
    protected String sesso; // "Maschio" o "Femmina"

    // Costruttore
    public Persona(String nome, String cognome, String codiceFiscale,
                   int eta, String sesso) {
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
        this.eta=eta;
        this.sesso=sesso;
    }

    public void calcolaEta(){
        //eta = annoNascita - annoCorrente;
        // .Year
    }

    //Metodo per stampare le info base
    public void stampaInformazioni(){
        System.out.println("Nome: "+ nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Codice Fiscale: " + codiceFiscale);
        System.out.println("Età: " + eta);
        System.out.println("Sesso: " + eta);
    }
}
