import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nimbusds.jose.shaded.json.JSONArray;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.genRocket.GenRocketException;
import com.genRocket.engine.EngineAPI;
import com.genRocket.engine.EngineManual;
import com.genRocket.receiver.XMLFileReceiver;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Uploadtest {
    String username = System.getenv("LT_USERNAME");
    String accesskey =System.getenv("LT_ACCESS_KEY");
    RemoteWebDriver driver;
    String gridURL = "@hub.lambdatest.com/wd/hub";
    String status = "";

    float ClickCommandTime;
    long CommandStart;
    long CommandStop;
    float SendKeyCommand;
    long SendKeysStart;
    long SendKeysStop;

    @BeforeMethod
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void setup(String browser, String version, String platform) throws Exception {

//        browser = System.getProperty("browser") != null ? System.getProperty("browser") : browser;
//        version = System.getProperty("version") != null ? System.getProperty("version") : version;
//        platform = System.getProperty("platform") != null ? System.getProperty("platform") : platform;
//
//        String path = System.getenv("default_directory");
//        System.out.println(" system property: " + path);
//        String jobid = System.getenv("JOB_ID");
//        System.out.println(" jobid: " + jobid);
//        HashMap<String, String> custom = new HashMap<>();
//        custom.put("Abcd", "1234");
//        StopWatch buildSTart = new StopWatch();
//        buildSTart.start();
        DesiredCapabilities capabilities = new DesiredCapabilities();
      //  capabilities.ignoreZoomSettings();
       // capabilities.attachToEdgeChrome();
     //   capabilities.withEdgeExecutablePath("C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe");

        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("version", "100");
        capabilities.setCapability("platformName", System.getenv("HYPEREXECUTE_PLATFORM"));
        capabilities.setCapability("build", "TestNG Framework");
        capabilities.setCapability("name", "testName-2");
        capabilities.setCapability("network", false);
        capabilities.setCapability("visual", true);
        capabilities.setCapability("video", true);


        //capabilities.setCapability("customData", custom);
        Random rand = new Random();
        // Generating random integers in range 0 to 9
        int int1 = rand.nextInt(10);
        // Printing random integer
        System.out.println(" generatedString: " + int1);
        File object = new File(".//Files//generatedString-" + int1 + ".txt");
        object.createNewFile();

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(".//Files//generatedString-" + int1 + ".txt")))) {
            writer.write(String.valueOf(capabilities));
            writer.newLine();  // method provided by BufferedWriter
        } catch (IOException e) {
        }

        try {

            System.out.println("++++++++++++++++++++++++" + capabilities + "=====================");
            String url = "http://" + username + ":" + accesskey + gridURL;
            System.out.println(url);
            StopWatch driverStart = new StopWatch();
            driverStart.start();
            driver = new RemoteWebDriver(new URL(url), capabilities);
            driverStart.stop();
            float timeElapsed = driverStart.getTime() / 1000f;
            System.out.println("Driver initiate time" + "   " + timeElapsed);

        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception f) {
            System.out.println(f.getMessage());
        }

    }

    @Test()
    public void test1() {
        try {
             JSONParser parser = new JSONParser();

            try (FileReader reader = new FileReader("Userdata.json")) {
                // Parse the JSON file into a JSON object
                Object obj = parser.parse(reader);
                JSONObject jsonObject = (JSONObject) obj;

                // Get the value of a key from the JSON object
                String username = (String) jsonObject.get("username");
                String password = (String) jsonObject.get("password");


                driver.get("https://www.lambdatest.com/automation-demos");
                Thread.sleep(9000);
                driver.findElement(By.id("username")).sendKeys(username);
                Thread.sleep(9000);
                driver.findElement(By.id("password")).sendKeys(password);
                Thread.sleep(10000);
                driver.findElement(By.cssSelector("#newapply > div.w-360.ml-auto.text-center.smtablet\\:w-full.smtablet\\:ml-0 > button")).click();

            }
            catch (Exception e){
                System.out.println(e);
            }


            String FilePath;
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
            Date date = new Date();
            FilePath = "target/" + dateFormat.format(date) + "/" + ".png ";
            TakesScreenshot scrShot = ((TakesScreenshot) driver);
            File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SrcFile, new File(FilePath));
            driver.get("http://www.bing.com");
            Thread.sleep(10000);

            System.out.println(driver.getTitle());
            status = "passed";
        } catch (Exception t) {
            System.out.println(t);
            status = "failed";
        }
    }
     @Test
  public void testTwo(){
        try {
            String csvFile = "Sample.csv";
            String line = "";
            String csvSplitBy = ",";
            int usernameIndex = 0;
            int passwordIndex = 1;

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    String username = data[usernameIndex];
                    String password = data[passwordIndex];
                    System.out.println("Username: " + username + ", Password: " + password);
                    driver.get("https://www.lambdatest.com/automation-demos");
                    Thread.sleep(9000);
                    driver.findElement(By.id("username")).sendKeys(username);
                    Thread.sleep(9000);
                    driver.findElement(By.id("password")).sendKeys(username);
                    Thread.sleep(10000);
                    driver.findElement(By.cssSelector("#newapply > div.w-360.ml-auto.text-center.smtablet\\:w-full.smtablet\\:ml-0 > button")).click();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

   }



    @AfterMethod
    public void teardown() {
        if (driver != null) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=" + "passed");
            driver.quit();
        }
    }
}
