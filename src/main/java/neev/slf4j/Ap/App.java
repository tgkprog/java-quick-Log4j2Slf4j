package neev.slf4j.Ap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sample
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
    	logger.debug("start");
    	String a = null;
    	try {
    		int i = Integer.parseInt("v");//throws
    		a = "b " + i;
    	}catch(Throwable e) {
    		logger.warn("main " + a + " " + e, e);
    	}
    	int i = 0;
        for(;;) {
        	i++;
        	logger.debug("Ping " + i + ", " + ((i) % 104) + ", " + (((i) % 104) == 0));
        	
        	if((i % 104) == 0) {
        		i = 0;
        		logger.warn("ping pong");
        	}
        	try {
				Thread.sleep(3500);
			} catch (Exception e) {
				//ignore
				logger.warn("slp " + e);
			}
        }
    }
}
