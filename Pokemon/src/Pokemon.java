public class Pokemon {
    private int numeroNational;
    private String nom;
    private String type;
    private int niveau;
    private int pointsDeVie;
    private int attaque;
    private int defense;
    private int attaqueSpeciale;
    private int defenseSpeciale;
    private int vitesse;

    public Pokemon(int numeroNational, String nom, String type, int niveau, int pointsDeVie,
                   int attaque, int defense, int attaqueSpeciale, int defenseSpeciale, int vitesse) {
        this.numeroNational = numeroNational;
        this.nom = nom;
        this.type = type;
        this.niveau = niveau;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.defense = defense;
        this.attaqueSpeciale = attaqueSpeciale;
        this.defenseSpeciale = defenseSpeciale;
        this.vitesse = vitesse;
    }

    public int getNumeroNational() {
        return numeroNational;
    }
    public void setNumeroNational(int numeroNational) {
        this.numeroNational = numeroNational;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getAttaque() {
        return attaque;
    }
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttaqueSpeciale() {
        return attaqueSpeciale;
    }
    public void setAttaqueSpeciale(int attaqueSpeciale) {
        this.attaqueSpeciale = attaqueSpeciale;
    }

    public int getDefenseSpeciale() {
        return defenseSpeciale;
    }
    public void setDefenseSpeciale(int defenseSpeciale) {
        this.defenseSpeciale = defenseSpeciale;
    }

    public int getVitesse() {
        return vitesse;
    }
    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "Numéro National=" + numeroNational +
                ", Nom='" + nom + '\'' +
                ", Type='" + type + '\'' +
                ", Niveau=" + niveau +
                ", Points de Vie=" + pointsDeVie +
                ", Attaque=" + attaque +
                ", Défense=" + defense +
                ", Attaque Spéciale=" + attaqueSpeciale +
                ", Défense Spéciale=" + defenseSpeciale +
                ", Vitesse=" + vitesse +
                '}';
    }

    public int calculerDommage(Pokemon adversaire, int puissance) {
        return (int) (((2 * this.niveau + 10) / 250.0) * ((double) this.attaque * puissance / adversaire.getDefense()) + 2);
    }

}
