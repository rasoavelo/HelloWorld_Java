import java.util.logging.Logger;

public class LoggerMineurOuMajeur {

    private static final Logger logger = Logger.getLogger(LoggerMineurOuMajeur.class.getName());

    public static void main(String[] args) {
        int age = 70;
        if (age < 18) {
            logger.info("Elle est mineur");
        } else if (age >= 18 && age <= 60) {
            logger.info("Elle est majeur");
        } else {
            logger.info("Elle est vieux");
        }
    }
}
