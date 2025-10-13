package com.guernelli.restapidemo.exception;
/** Documentazione: RisorsaNonTrovataException
 * Questa è un eccezione personalizzata che invia
 * un messaggio di Risorsa non trovata.
 * UtenteDTO ci sono le funzioni di Jakarta Bean
 * che chiedono valori not null attraverso l'annotation @NotBlank
 */
public class RisorsaNonTrovataException extends RuntimeException {
    public RisorsaNonTrovataException(String message) {
        super(message);
    }
}
