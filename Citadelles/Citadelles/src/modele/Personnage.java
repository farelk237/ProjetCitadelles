package modele;

public abstract class Personnage {
  private String nom;
  private int rang;
  private String caracteristiques;
  private Joueur joueur ;
  private boolean assassine;
  private boolean vole;

  private PlateauDeJeu plateau ;

  public Personnage(String nom, int rang, String caracteristiques) {
    this.nom = nom;
    this.rang = rang;
    this.caracteristiques = caracteristiques;
    this.joueur = null;
    this.vole = false;
    this.assassine = false;

  }

  public String getNom() {
    return nom;
  }

  public int getRang() {
    return rang;
  }

  public String getCaracteristiques() {
    return caracteristiques;
  }

  public Joueur getJoueur() {
    return joueur;
  }
  public boolean getAssassine() {
    return assassine;
  }
  public boolean getVole() {
    return vole;
  }
  public void setJoueur(Joueur joueur) {
    this.joueur = joueur;
  }

  public void setVole() {
    this.vole = true;
  }
  public void setAssassine() {
    this.assassine = true;
  }

  public void ajouterPieces() {
    if (joueur != null && !assassine) {
      joueur.ajouterPieces(2);
    }
  }
  public void ajouterQuartier(Quartier nouveau) {
    if (joueur != null && !assassine) {
      joueur.ajouterQuartierDansMain(nouveau);
    }
  }

  public void construire(Quartier nouveau) {
    if (joueur != null && !assassine) {
      joueur.ajouterQuartierDansCite(nouveau);
    }
  }
  public void percevoirRessourcesSpecifiques() {
    if (joueur != null && !assassine) {
    System.out.println("Aucune ressource spécifique"); }
  }

  public abstract void utiliserPouvoir();

  public void reinitialiser() {
    this.joueur = null;
    this.assassine = false;
    this.vole = false;
  }

  public PlateauDeJeu getPlateau() {
    return plateau;
  }

  public void setPlateau(PlateauDeJeu nouveauPlateau) {
    this.plateau = nouveauPlateau;
  }

}




