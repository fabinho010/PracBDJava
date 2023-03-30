public class Persona {
        //Atributos
        private String nom;
        private int any;

        //Constructor no tienen return ni un void
        public Persona(String nom, int any ){
            this.setNom(nom);
            this.setAny(any);
    }
    //getters y setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}