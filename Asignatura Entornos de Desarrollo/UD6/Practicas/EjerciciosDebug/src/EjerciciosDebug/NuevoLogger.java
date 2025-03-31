package EjerciciosDebug;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class NuevoLogger {

    private final static Logger LOGGER = Logger.getLogger(NuevoLogger.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        NuevoLogger ejemplo = new NuevoLogger();
        ejemplo.configurarLog();
        ejemplo.escribirEnLog();
    }

    private void borrarConsolaPorDefecto() {
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }
    }

    public void configurarLog() throws SecurityException, IOException {
        this.borrarConsolaPorDefecto();

        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);

        Handler fileTxt = new FileHandler("log.txt", true);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileTxt.setFormatter(simpleFormatter);
        fileTxt.setLevel(Level.INFO);
        LOGGER.addHandler(fileTxt);

    }

    public void escribirEnLog() {
        LOGGER.config("Mensaje de configuración");
        LOGGER.fine("Depurando el programa");
        LOGGER.warning("Se ha lanzado una excepción");
        LOGGER.severe("No se ha podido conectar con la Base de Datos");
        LOGGER.log(Level.FINEST, "Depuración más fina");        
        LOGGER.log(Level.INFO, "El log se ha probado correctamente");
    }
}
