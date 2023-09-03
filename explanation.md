In this framework, I have 5 test cases. I implemented Behavior Driven Development/Cucumber approach. I used Page Object Model to store my WebElements, I used Maven as a build automation tool where it comes with its default pom.xml file, It allowed me to store & manage dependencies. I used Gherkin Language in my feature files.

I created specific utilities such as Driver, ConfigurationReader.  I used getDriver method. In that method, driver name is declared from configuration.properties file with the help of getProperty method which comes from ConfigurationReader utility class.

I created a BasePage class where I store my pagefactory method. I used inheritance to initialize my locators in my pages.

### RUNNER CLASSES

I used CukesRunner class as my main RunnerClass where I'm able to run my scenarios by putting a tag above them. I used CucumberReports plugin to see my results for my test scenarios online. I provided the path of my feature directory so that my runner can find my feature files. I provided a path for my step definitions where I store my Java codes. At the end it automatically combines my Java code and my feature file to run my tests. I also provide tags to declare which scenarios will be running.

I also have FailedTestRunner class where it allows me to run only the tests that have failed. I provided a path for my step definitions again. I also provided a path for my rerun.txt file where it only displays when there is a scenario failed. This allows me to run only the tests that have failed. Which is time saving for tests such as Smoke and Regression. If any of my scenario fails, I have a screenshot method stored in my After method (Hooks class)

### METHODS AND LIBRARIES USED

In these tests I have used Selenium WebDriver and Java. I implemented many methods from different libraries & classes:

#### Selenium WebDriver:


isDisplayed();

click();

getText();

sendKeys();

Select class selectByVisibleText()

WebDriverWait

#### Java:

String

if else

List<WebElements>

Inheritance


#### Java Faker:

I used senario outline Data Driven Testing so i didn't use java faker

// Faker faker=new Faker();
// faker.bothify("################################");

// Faker faker=new Faker();
// faker.number();

//  Faker faker=new Faker();
//  faker.date();
//Faker faker=new Faker();

        // formPage.firstName.sendKeys(faker.name().firstName());

// Faker faker=new Faker();
// formPage.lastName.sendKeys(faker.name().lastName());

//Faker faker=new Faker();
//  formPage.phone.sendKeys(faker.phoneNumber().phoneNumber());

//Faker faker=new Faker();
//formPage.street1.sendKeys(faker.address().streetAddress());

// Faker faker=new Faker();
// formPage.street2.sendKeys(faker.address().streetAddress());

//Faker faker=new Faker();
//formPage.city.sendKeys(faker.address().city());


#### Annotations:

@Findby

@Before

@After


#### Assertions:

JUnit

assertTrue();

assertEquals();


