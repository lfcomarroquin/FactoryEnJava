public class NotificacionFactory {
    public Notificacion crearNotificacion(String tipoNotificacion) {
        if (tipoNotificacion.equals("Email")) {
            return new EmailNotificacion();
        } else if (tipoNotificacion.equals("SMS")) {
            return new SMSNotificacion();
        } else if (tipoNotificacion.equals("App")) {
            return new AppNotificacion();
        }
        throw new IllegalArgumentException("Opcion incorrecta");
    }
}