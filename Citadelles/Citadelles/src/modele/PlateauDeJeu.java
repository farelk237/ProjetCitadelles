package modele;

public class PlateauDeJeu {
    private int nombreJoueurs ;
    private int nombrePersonnages;
    private Joueur[] listeJoueurs;
    private Personnage[] listePersonnages;
    private Pioche pioche;

    public PlateauDeJeu() {
        this.nombreJoueurs = 0;
        this.nombrePersonnages = 0;
        this.listeJoueurs = new Joueur[9];
        this.listePersonnages = new Personnage[9];
        this.pioche = new Pioche();
    }

    public int getNombrePersonnages() {
        return nombrePersonnages;
    }

    // Accesseur pour getNombreJoueurs()
    public int getNombreJoueurs() {
        return nombreJoueurs;
    }

    // Accesseur pour getPioche()
    public Pioche getPioche() {
        return pioche;
    }

    // Accesseur pour getPersonnage(int i)
    public Personnage getPersonnage(int i) {
        // Vérifier que i est dans la plage valide
        if (i >= 0 && i < listePersonnages.length) {
            return listePersonnages[i];
        } else {
            // Gérer l'erreur, par exemple, renvoyer null ou lever une exception
            return null;
        }
    }

    // Accesseur pour getJoueur(int i)
    public Joueur getJoueur(int i) {
        // Vérifier que i est dans la plage valide
        if (i >= 0 && i < listeJoueurs.length) {
            return listeJoueurs[i];
        } else {
            // Gérer l'erreur, par exemple, renvoyer null ou lever une exception
            return null;
        }
    }
    public void ajouterPersonnage(Personnage nouveauPersonnage) {
        // Vérifier si le personnage passé en paramètre n'est pas null
        if (nouveauPersonnage != null) {
            // Vérifier si le tableau n'est pas déjà plein
            if (nombrePersonnages < 10) {
                // Ajouter le personnage au tableau
                listePersonnages[nombrePersonnages] = nouveauPersonnage;
                nombrePersonnages++;
            } else {
                // Gérer l'erreur : le tableau est plein
                System.out.println("Le tableau de personnages est déjà plein.");
            }
        } else {
            // Gérer l'erreur : le personnage passé en paramètre est null
            System.out.println("Le personnage à ajouter ne peut pas être null.");
        }
    }

    // Méthode pour ajouter un nouveau joueur
    public void ajouterJoueur(Joueur nouveauJoueur) {
        // Vérifier si le joueur passé en paramètre n'est pas null
        if (nouveauJoueur != null) {
            // Vérifier si le tableau n'est pas déjà plein
            if (nombreJoueurs <= 10) {
                // Ajouter le joueur au tableau
                listeJoueurs[nombreJoueurs] = nouveauJoueur;
                nombreJoueurs++;
            } else {
                // Gérer l'erreur : le tableau est plein
                System.out.println("Le tableau de joueurs est déjà plein.");
            }
        } else {
            // Gérer l'erreur : le joueur passé en paramètre est null
            System.out.println("Le joueur à ajouter ne peut pas être null.");
        }
    }
}
