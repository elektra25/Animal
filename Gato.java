class Gato extends Animal {
    private String razaGato; 

    public Gato(String nombrePerro, String alimentoPerro, int edadPerro, String nombreGato, String alimentoGato, int edadGato, String razaGato) {
        super(nombrePerro, alimentoPerro, edadPerro, nombreGato, alimentoGato, edadGato);
        this.razaGato = razaGato;
    }
        public String getRazaGato() {
            return razaGato;
        }
    
        public void setRazaGato(String razaGato) {
            this.razaGato = razaGato;
        }
        @Override
        public String toString() {
            return "Gato [raza=" + razaGato + "]";
        }
    
    }