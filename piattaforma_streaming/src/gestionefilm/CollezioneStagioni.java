package gestionefilm;

public class CollezioneStagioni {
    Stagione[] collezione;
    private int count;  //num di elementi inseriti nel vettore
    private int dimMax;// rappresenta la dimensione massima del vettore(può essere sostituita da collezopne.lengh)

    public CollezioneStagioni(int dimensione){
        collezione = new Stagione[dimensione];
        count = 0;
        dimMax = dimensione;
    }


//crea una collezione di dimensione fissa pari a 50 stagioni
    public CollezioneStagioni(){

        this(50);
         

    } 


    //aggiunge una stagione al vettore delle stagioni
    public void addStagione(Stagione s){
       if(this.count < this.dimMax){
            this.collezione[count] = s;
        count++;

        }else{
            System.out.println("Impossibile aggiungere la stagione. La collezione è piena.");
        }
       
        

    }

}
