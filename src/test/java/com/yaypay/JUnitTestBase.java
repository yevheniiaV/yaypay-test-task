package com.yaypay;
import com.yaypay.model.UserModel;
import com.yaypay.utils.PropertiesLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JUnitTestBase {
    private static final String APPLICATION_PROPERTIES = "/application.properties";
    private static final String TEST_DATA_PROPERTIES = "/test-data.properties";

    static String baseUrl;
    public UserModel userModel;
    WebDriver driver;

    @Before
    public void initTestData () throws IOException {
        PropertiesLoader dataConfig = new PropertiesLoader(TEST_DATA_PROPERTIES);
        userModel = new UserModel(dataConfig.getProperty("username"), dataConfig.getProperty("password"));
    }

    @ClassRule
    public static ExternalResource webDriverProperties = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            PropertiesLoader appConfig = new PropertiesLoader(APPLICATION_PROPERTIES);
            baseUrl = appConfig.getProperty("site.url");
        }
    };

    @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @Override
        protected void finished(Description description) {
            driver.quit();
        }
    };
}
