import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class house {
	private static final Logger LOGGER=LogManager.getLogger(house.class);
	public static long cost(String st,int area,String auto)
	{
		LOGGER.info("entered into The method");
		if(st=="standard")
			return (area*1200);
		if(st=="above_standard")
			return (area*1500);
		if(st=="high_standard" && auto=="no")
			return (area*1800);
		if(st=="high_standard" && auto=="yes")
			return (area*2500);
		return 0;
	}
}
