package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pioche {
    private ArrayList<Quartier> liste;
    public Pioche() {
        this.liste = new ArrayList<>(); // Ou tout autre initialisation nécessaire
    }

    public Quartier piocher() {
        Quartier a;
        if (liste.size() >= 1){
            a = liste.get(0);
            liste.remove(0);
            return a;
        } else {
            return null;
        }
    }
        public void ajouter(Quartier nouveau) {
            liste.add(nouveau);
        }
    public int nombreElements() {
        return liste.size();
    }

    // Méthode pour mélanger la pioche
    public void melanger() {
        Random generateur = new Random();

        for (int i = 0; i < liste.size(); i++) {
            int j = generateur.nextInt(liste.size());

            // Échange les quartiers aux indices i et j
            Quartier temp = liste.get(i);
            liste.set(i, liste.get(j));
            liste.set(j, temp);
        }
    }


}
