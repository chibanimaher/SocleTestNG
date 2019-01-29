//package Runner;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;
//import testNG.TestngSocle;
//
//@CucumberOptions(features = { "src/test/java/Features/RechercheBonCoin.feature" }, glue = {
//		"Page" }, plugin = { "html:target/cucumber-html-report", "json:targer/cucumber.json",
//				"pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
//				"junit:target/cucumber-results.xml" }, monochrome = true)
//public class TestRunner extends TestngSocle{
//	
//	
//	private TestNGCucumberRunner testNGCucumberRunner;
//	 
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
// 
//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
// 
//    @DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }
//    
//   
// 
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//
//}
