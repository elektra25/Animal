class Perro extends Animal {
    private String razaPerro;

    public Perro(String nombrePerro, String alimentoPerro, int edadPerro, String nombreGato, String alimentoGato, int edadGato, String razaPerro) {
        super(nombrePerro, alimentoPerro, edadPerro, nombreGato, alimentoGato, edadGato);
        this.razaPerro = razaPerro;
}
    public String getRaza() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }
    @Override
    public String toString() {
        return "Perro [raza=" + razaPerro + "]";
    }

}