package sixesWildBoundary;

import sixesWildEntity.Level;
import junit.framework.TestCase;

public class TestSixesWildApplication extends TestCase {
	SixesWildApplication s;
	Level l;
	
	@Override
	protected void setUp()
	{
		l=new Level(1);
		s=new SixesWildApplication(l);
	}
	
	public void testSixesWildApplication()
	{
		System.out.println("Sample Sixes Wild");
	}
}
