
import java.util.Scanner;

import gestionefilm.CollezioneStagioni;
import gestionefilm.CollezioneTelefilm;
import gestionefilm.Genere;
import gestionefilm.Stagione;
import gestionefilm.Stato;
import gestionefilm.Telefilm;

/**
 * Punto di ingresso dell'applicazione per la gestione dei telefilm.
 */
public class MainTelefilm {
    /** Impedisce l'istanziazione della classe principale. */
    /**
     * Acquisisce i dati, crea un telefilm e mostra le operazioni richieste.
     *
     * @param args argomenti della riga di comando, non utilizzati
     */
    public static void main(String[] args) {
        Stagione s1 = new Stagione(10, "Sceneggiatore 1", "Trama della stagione 1", 1);
        Stagione s2 = new Stagione(12, "Sceneggiatore 2", "Trama della stagione 2", 2);


        CollezioneStagioni collezioneStagioni = new CollezioneStagioni();
        collezioneStagioni.addStagione(s1);
        collezioneStagioni.addStagione(s2);
    }

    }
      

        