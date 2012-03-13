package trip.planner

import grails.test.*;
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
//@TestFor(DateTagLib)
class DateTagLibTests extends GroovyPagesTestCase{
	 def dateTagLib
    
    void setUp(){
      dateTagLib = new DateTagLib()
	  
    }

    void testThisYear() {
      String expected = Calendar.getInstance().get(Calendar.YEAR)
      assertEquals(expected, dateTagLib.thisyear().toString()) 
    }
}
