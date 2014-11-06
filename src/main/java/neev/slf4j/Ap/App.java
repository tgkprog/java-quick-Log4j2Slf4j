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
    	logger.debug("hi");
    	String a = null;
    	try {
    		int i = Integer.parseInt("v");//throws
    		a = "b " + i;
    	}catch(Throwable e) {
    		logger.warn("main " + a + " " + e, e);
    	}
        System.out.println( "Hello World!" );
    }
}
