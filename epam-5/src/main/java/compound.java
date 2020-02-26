import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class compound {
	private static final Logger LOGGER=LogManager.getLogger(compound.class);
public static double compound(double pr,double t,double rate)
{
	LOGGER.info("entered to caluclate the compound interest");
	return pr * Math.pow(1.0+rate/100.0,t) - pr;
}
}