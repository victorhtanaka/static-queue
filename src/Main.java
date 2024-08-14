public class Main {
    public static void main(String[] args) {
        StaticQueue<String> fila = new StaticQueue<>(5);

        fila.store("Matheus");
        fila.store("Pedro Lelis");
        System.out.println(fila.retrieve());
        System.out.println(fila.retrieve());
        System.out.println(fila.retrieve());
        fila.store("Joao");
        System.out.println(fila.retrieve());
    }
}