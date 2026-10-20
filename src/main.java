public class main {

    static void main(String[] args) {

        // 1. Creo alerta 10, "Error"
        AlertaSistema alerta = new AlertaSistema(10, "Error de conexión");
        System.out.println("Alerta creada: ID " + alerta.getIdentificador() + " - " + alerta.getDescripcion());
        System.out.println("Prioridad inicial: " + alerta.getPriodidad());

        // 2. Aumentar la prioridad
        boolean aumento = alerta.aumentarPrioridad();
        System.out.println("Aumento de prioridad?: " + aumento);
        System.out.println("Prioridad actual: " + alerta.getPriodidad());

        // 3. Aumentar hasta prioridad 4
        alerta.aumentarPrioridad();
        alerta.aumentarPrioridad(); // Se sube a 4
        System.out.println("Es urgente?: " + alerta.esUrgente());

        // 4. Aumentar hasta prioridad 5
        alerta.aumentarPrioridad();
        System.out.println("Prioridad actual: " + alerta.getPriodidad());

        // 5. Intentar aumentar nuevamente
        boolean intE = alerta.aumentarPrioridad();
        System.out.println("Se cambió?: " + intE);
        System.out.println("Prioridad actual: " + alerta.getPriodidad()); // Mantiene 5

        // 6. Cambia a descripción vacía
        alerta.setDescripcion(" ");
        System.out.println("Descripción: " + alerta.getDescripcion()); // Mantiene la original

        // Pruebo contador
        System.out.println("Total de alertas creadas : " + AlertaSistema.getContadorAlertas());

        // Aumento
        AlertaSistema alerta1 = new AlertaSistema(5, "Error de servidor");
        System.out.println("Total de alertas después de aumentar: " + AlertaSistema.getContadorAlertas());
    }

}
