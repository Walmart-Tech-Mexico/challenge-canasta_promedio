public class Main {
    public static void main(String[] args) {
        // Reto para el desarrollador:
        // 1. Implementar la función calcularTicketPromedio.
        // 2. La función debe recibir dos arrays: clientes (String[]) y montosCompra (double[]).
        // 3. La función debe calcular el ticket promedio de compra por cada cliente.
        // 4. La función debe imprimir en consola el nombre del cliente y su ticket promedio.
        // 5. Considerar que los arrays clientes y montosCompra pueden tener diferente longitud,
        //    y en ese caso, la función debe manejar el error e imprimir un mensaje adecuado.
        // 6. Utilizar la estructura de datos que considere más adecuada para resolver el problema.

        // Datos de prueba:
        String[] clientes = {"ClienteA", "ClienteB", "ClienteA", "ClienteC", "ClienteB"};
        double[] montosCompra = {100.0, 50.0, 120.0, 80.0, 60.0};

        // Llamar a la función a implementar
        calcularTicketPromedio(clientes, montosCompra);
    }

    /**
     * Calcula el ticket promedio de compra por cliente.
     *
     * @param clientes      Array de nombres de clientes.
     * @param montosCompra  Array de montos de compra correspondientes a cada cliente.
     */
    public static void calcularTicketPromedio(String[] clientes, double[] montosCompra) {
        // Implementar la lógica aquí
        System.out.println("Implementar la lógica para calcular el ticket promedio por cliente.");
    }
}