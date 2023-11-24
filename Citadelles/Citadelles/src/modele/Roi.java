package modele;

    public class Roi extends Personnage {

        public Roi() {
            super("Roi", 4, Caracteristiques.ROI);
        }

        @Override
        public void utiliserPouvoir() {
            System.out.println("Je prends la couronne");
            if (getJoueur() != null) {
                getJoueur().setPossedeCouronne(true);
            }
        }
        @Override
        public void percevoirRessourcesSpecifiques() {
            int compteur = 0;
            if (getJoueur() != null && getAssassine() != true) {
                for (Quartier unQuartier : getJoueur().getCite()) {
                    if (unQuartier != null && unQuartier.getType() == "NOBLE") {
                        compteur ++;
                    }
                }
                getJoueur().ajouterPieces(compteur);
            }
        }
    }


