package modele;

import java.util.ArrayList;
import java.util.Random;

public class Joueur
{
    private String Nom ;
    private int tresor ;
    private int nbQuartiers;
    private boolean possedeCouronne;
    private Quartier[] cite;
    private ArrayList<Quartier> main;

    public Joueur(String nom)
    {
        this.Nom = nom;
        this.tresor = 0;
        this.nbQuartiers = 0;
        this.possedeCouronne = false;
        this.cite = new Quartier[8]; // Tableau de taille maximale 8
        this.main = new ArrayList<Quartier>();
    }
    public String getNom()
    {
        return this.Nom;
    }

    public int nbPieces()
    {
        return this.tresor;
    }

    public int nbQuartiersDansCite()
    {
        return this.nbQuartiers;
    }

    public Quartier[] getCite()
    {
        return this.cite;
    }

    public ArrayList<Quartier> getMain()
    {
        return this.main;
    }

    public int nbQuartiersDansMain()
    {
        return this.main.size();
    }

    public boolean getPossedeCouronne()
    {
        return this.possedeCouronne;
    }
    public void setPossedeCouronne(boolean b)
    {
        this.possedeCouronne = b;
    }

    public void ajouterPieces(int nombrePieces)
    {
        if (nombrePieces > 0) {
            this.tresor += nombrePieces;
        } else {
            System.out.println("Le nombre de pièces ajouté doit être positif.");
        }
    }
    public void retirerPieces(int nombrePieces)
    {
        if (nombrePieces > 0) {
            if (nombrePieces <= this.tresor) {
                this.tresor -= nombrePieces;
            } else {
                System.out.println("Le nombre de pièces à retirer dépasse le trésor actuel.");
            }
        } else {
            System.out.println("Le nombre de pièces retiré doit être positif.");
        }
    }
    public void ajouterQuartierDansCite(Quartier quartier)
    {
        if (nbQuartiers < cite.length) {
            cite[nbQuartiers] = quartier;
            nbQuartiers++;
        } else {
            System.out.println("La cité est déjà pleine, impossible d'ajouter un nouveau quartier.");
        }
    }
    public boolean quartierPresentDansCite(String nomQuartier)
    {
        for (Quartier quartier : cite) {
            if (quartier != null && quartier.getNom().equals(nomQuartier)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour retirer un quartier de la cité
    public Quartier retirerQuartierDansCite(String nomQuartier)
    {
        for (int i = 0; i < cite.length; i++) {
            if (cite[i] != null && cite[i].getNom().equals(nomQuartier)) {
                Quartier quartierRetire = cite[i];
                cite[i] = null;
                nbQuartiers--;
                return quartierRetire;
            }
        }
        return null;
    }
    // Méthode pour ajouter un quartier à la main
    public void ajouterQuartierDansMain(Quartier quartier)
    {
        main.add(quartier);
    }

    // Méthode pour retirer un quartier de la maiin (alearoire)
    public Quartier retirerQuartierDansMain()
    {
        if (!main.isEmpty()) {
            Random generateur = new Random();
            int numeroHasard = generateur.nextInt(this.nbQuartiersDansMain());
            return main.remove(numeroHasard);
        } else {
            return null;
        }
    }

    public void reinitialiser()
    {
        tresor = 0;
        main.clear();
        for (int i = 0; i < cite.length; i++) {
            cite[i] = null;
        }
        nbQuartiers = 0;
    }
}
