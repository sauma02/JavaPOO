/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3Suite.java to edit this template
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author Admin
 */
public class NewTestSuite extends TestCase {
    
    public NewTestSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("NewTestSuite");
        suite.addTest(new TestSuite(GlobantTest2.class));
        suite.addTest(new TestSuite(GlobantTestJunit.class));
        suite.addTest(new TestSuite(GlobantTest.class));
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
}
