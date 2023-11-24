package modele;
    public class Quartier {
        // Attributs
        private String nom;
        private String type;
        private int coutConstruction;
        private String caracteristiques;

        // Constante publique statique finale
        public static final String[] TYPE_QUARTIERS = {"RELIGIEUX", "MILITAIRE", "NOBLE", "COMMERCANT", "MERVEILLE"};


        // Constructeur
        public Quartier() {
            this.nom = "";
            this.type = "";
            this.coutConstruction = 0;
            this.caracteristiques = "";
        }
        public Quartier(String nom, String type, int coutConstruction ) {
            this.nom = nom;
            this.type = type;
            this.coutConstruction = coutConstruction;
            this.caracteristiques = "caracteristiques";
        }
        public Quartier(String nom, String type, int coutConstruction, String caracteristiques) {
            this.nom = nom;
            this.type = type;
            this.coutConstruction = coutConstruction;
            this.caracteristiques = caracteristiques;
        }

        public String getNom(){
            return this.nom;
        }
        public void setNom(String nom){
            this.nom = nom;
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            if (type == this.TYPE_QUARTIERS[0] ||type == this.TYPE_QUARTIERS[1] ||type == this.TYPE_QUARTIERS[2] ||type == this.TYPE_QUARTIERS[3] ||type == this.TYPE_QUARTIERS[4] ) {
                this.type = type;
            }
        }
        public int getCout() {
            return this.coutConstruction;
        }
        public void setCout(int coutConstruction) {

            if (coutConstruction >= 1 && coutConstruction <= 6) {
                this.coutConstruction = coutConstruction;
            } else {

                this.coutConstruction = 0;
            }
        }
        public String getCaracteristiques() {
            return this.caracteristiques;
        }
        public void setCaracteristiques(String caracteristiques) {

            this.caracteristiques = caracteristiques;
        }

    }


