// Interface Logger
interface Logger {
    void logInfo(String message);
    void logWarning(String message);
    void logError(String message);
}


// ConsoleLogger class implementing Logger
class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("INFO: " + message);
    }


    @Override
    public void logWarning(String message) {
        System.out.println("WARNING: " + message);
    }


    @Override
    public void logError(String message) {
        System.out.println("ERROR: " + message);
    }
}


// FileLogger class implementing Logger
class FileLogger implements Logger {
    @Override
    public void logInfo(String message) {
// Code to write the log message to a log file
        System.out.println("Logging INFO to file: " + message);
    }


    @Override
    public void logWarning(String message) {
// Code to write the log message to a log file
        System.out.println("Logging WARNING to file: " + message);
    }


    @Override
    public void logError(String message) {


        System.out.println("Logging ERROR to file: " + message);
    }
}


public class Main {
    public static void main(String[] args) {


        Logger consoleLogger = new ConsoleLogger();
        consoleLogger.logInfo("This is an informational message.");
        consoleLogger.logWarning("This is a warning message.");
        consoleLogger.logError("This is an error message.");


        System.out.println("-----------------------");


        Logger fileLogger = new FileLogger();
        fileLogger.logInfo("This is an informational message.");
        fileLogger.logWarning("This is a warning message.");
        fileLogger.logError("This is an error message.");
    }
}
