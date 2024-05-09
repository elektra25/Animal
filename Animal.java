class Animal {
    private String nombrePerro, alimentoPerro, nombreGato, alimentoGato;
    private int edadPerro, edadGato;

    public Animal(String nombrePerro, String alimentoPerro, int edadPerro, String nombreGato, String alimentoGato, int edadGato) {
        this.nombrePerro = nombrePerro;
        this.alimentoPerro = alimentoPerro;
        this.edadPerro = edadPerro;
        this.nombreGato = nombreGato;
        this.alimentoGato = alimentoGato;
        this.edadGato = edadGato;
    }


public String getNombrePerro() {
        return nombrePerro;
    }


    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }


    public String getAlimentoPerro() {
        return alimentoPerro;
    }


    public void setAlimentoPerro(String alimentoPerro) {
        this.alimentoPerro = alimentoPerro;
    }


    public String getNombreGato() {
        return nombreGato;
    }


    public void setNombreGato(String nombreGato) {
        this.nombreGato = nombreGato;
    }


    public String getAlimentoGato() {
        return alimentoGato;
    }


    public void setAlimentoGato(String alimentoGato) {
        this.alimentoGato = alimentoGato;
    }


    public int getEdadPerro() {
        return edadPerro;
    }


    public void setEdadPerro(int edadPerro) {
        this.edadPerro = edadPerro;
    }


    public int getEdadGato() {
        return edadGato;
    }


    public void setEdadGato(int edadGato) {
        this.edadGato = edadGato;
    }


@Override
public String toString() {
    return "Animal [nombre=" + nombrePerro + ", alimento=" + alimentoPerro + ", edad=" + edadPerro + "nombre=" + nombreGato + ", alimento=" + alimentoGato + ", edad=" + edadGato + "]";
}


}