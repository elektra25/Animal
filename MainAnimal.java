import java.util.Scanner;

class MainAnimal {
    public static void main(String[] args) {
        String nombrePerro, alimentoPerro, razaPerro, nombreGato, alimentoGato, razaGato;
        int edadPerro, edadGato;
        Scanner dato = new Scanner(System.in);

        // Obtener información del perro
        System.out.println("Cual es el nombre del perro");
        nombrePerro = dato.nextLine();

        System.out.println("Cual es el alimento del perro");
        alimentoPerro = dato.nextLine();

        System.out.println("Cual es la edad del perro");
        edadPerro = dato.nextInt();
        dato.nextLine(); // Consumir la línea pendiente después de nextInt()

        System.out.println("Cual es la raza del perro");
        razaPerro = dato.nextLine();

        // Obtener información del gato
        System.out.println("Cual es el nombre del gato");
        nombreGato = dato.nextLine();

        System.out.println("Cual es el alimento del gato");
        alimentoGato = dato.nextLine();

        System.out.println("Cual es la edad del gato");
        edadGato = dato.nextInt();
        dato.nextLine(); 

        System.out.println("Cual es la raza del gato");
        razaGato = dato.nextLine();

        Perro perro = new Perro(nombrePerro, alimentoPerro, edadPerro, razaPerro);
        Gato gato = new Gato(nombreGato, alimentoGato, edadGato, razaGato);

        System.out.println(perro);
        System.out.println(gato);
    }
}
