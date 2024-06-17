public class Main {
    public static void main(String[] args) {
        NotificacionFactory notificacion = new NotificacionFactory();
        Notificacion noti = notificacion.crearNotificacion("App");
        noti.enviarMensaje();
    }
}