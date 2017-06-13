import java.util.logging.Logger
def logger = Logger.getLogger("")
logger.info("Disabling CLI over remoting")
jenkins.CLI.get().setEnabled(false);
