package main.versione2;
public class Persona {
    protected String nome;
    protected String cognome;
    protected String codiceFiscale;
    protected int annoNascita;
    protected String sesso;

    public Persona(String nome, String cognome, String codiceFiscale, int annoNascita, String sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public int calcolaEta() {
        int annoCorrente = java.time.Year.now().getValue();
        return annoCorrente - annoNascita;
    }

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Codice Fiscale: " + codiceFiscale);
        System.out.println("Sesso: " + sesso);
        System.out.println("Età: " + calcolaEta());
    }

    public String getNome() {
        return nome;
    }

    public String getSesso() {
        return sesso;
    }
}
