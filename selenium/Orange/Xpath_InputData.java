package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Xpath_InputData extends ElementVisible {
    WebDriver driver = new WebDriver() {
        @Override
        public void get(String s) {
        }

        @Override
        public String getCurrentUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public List<WebElement> findElements(By by) {
            return null;
        }

        @Override
        public WebElement findElement(By by) {
            return null;
        }

        @Override
        public String getPageSource() {
            return null;
        }

        @Override
        public void close() {

        }

        @Override
        public void quit() {

        }

        @Override
        public Set<String> getWindowHandles() {
            return null;
        }

        @Override
        public String getWindowHandle() {
            return null;
        }

        @Override
        public TargetLocator switchTo() {
            return null;
        }

        @Override
        public Navigation navigate() {
            return null;
        }

        @Override
        public Options manage() {
            return null;
        }
    };
    WebDriverWait wait = new WebDriverWait(driver, 10);
    @FindBy(xpath = "//div[contains(@class,'oxd-toast-content--success')]")
    WebElement notification;

    //xpath for login
    @FindBy(xpath = "//input[@name='username']")
    WebElement input_user;
    @FindBy(xpath = "//input[@name='password']")
    WebElement input_password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit_button;
    //xpath for PIM
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement PIM_list;
    @FindBy(xpath = "//div[@class='orangehrm-header-container']//button[@type='button']")
    WebElement add_PIM_button;
    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName_textbox;
    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName_textbox;
    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName_textbox;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveAddEmployee_button;
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']")
    WebElement id_employee;

    //xpath for admin
    @FindBy(xpath = "//span[text()='Admin']")
    WebElement admin_list;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addAdmin_button;
    @FindBy(xpath = "//label[text()='User Role']//..//..//div[@class='oxd-select-text-input']")
    WebElement user_role;
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employee_name;
    @FindBy(xpath = "//label[text()='Status']//..//..//div[@class='oxd-select-text-input']")
    WebElement status;
    @FindBy(xpath = "//label[text()='Username']//..//..//input[@class='oxd-input oxd-input--active']")
    WebElement user_name;
    @FindBy(xpath = "//label[text()='Password']//..//..//input[@class='oxd-input oxd-input--active']")
    WebElement password;
    @FindBy(xpath = "//label[text()='Confirm Password']//..//..//input[@class='oxd-input oxd-input--active']")
    WebElement confirm_password;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement save_button;
    @FindBy(xpath = "//label[text()='Username']//..//..//input[contains(@class,'oxd-input--active')]")
    WebElement username_textbox;
    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchAdmin_button;

    //log out
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement name_dropdown;
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logout;

    //xpath for BUZZ
    @FindBy(xpath = "//span[text()='Buzz']")
    WebElement buzz_list;
    @FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']")
    WebElement input_post;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement post_button;
    @FindBy(xpath = "//div[@data-v-e149abea='']")
    WebElement like_post;
    @FindBy(xpath = "//p[text()='new post 2']//..//..//..//i[@class='oxd-icon bi-chat-text-fill']")
    WebElement comment_post;
    @FindBy(xpath = "//input[@placeholder='Write your comment...']")
    WebElement comment_post_textBox;

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement PIM;

    //xpath for change password
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']")
    WebElement userName_textbox;
    @FindBy(xpath = "//div[@class='oxd-table-filter']//button[text()=' Search ']")
    WebElement search_button;
    /*@FindBy(xpath = "")
    WebElement editUser;
    @FindBy(xpath = "//label[text()='Change Password ?']")
    WebElement changePass_dislay;*/
    @FindBy(xpath = "//i[contains(@class,'oxd-checkbox-input')]")
    WebElement yes_checkbox;
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input[@type='password']")
    WebElement pass_textbox;
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@type='password']")
    WebElement passConfirm_textbox;
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement saveChangePass_button;

    //xpath tc2
    @FindBy(xpath = "//label[text()='Employee Name']//..//..//input[@placeholder='Type for hints...']")
    WebElement employeeName_textbox;


    String userName = "test20";
    String pass_first = "t123456";
    String pass_change = "minhthien123";
    String name = "vo minh thien";
    Random random = new Random();

    int id = random.nextInt(5000, 10000);


    String userName_DF = "Admin";
    String pass_DF = "admin123";

    public void login(String username, String password) {
        input_user.sendKeys(username);
        input_password.sendKeys(password);
        System.out.println("check if the login button is visible");
        isElementVisible2(submit_button);
        submit_button.click();
        System.out.println("click button login success");
    }

    public void logout() throws InterruptedException {
        name_dropdown.click();
        logout.click();
        Thread.sleep(1000);
    }

    public void checkNotification() {
        System.out.println("check notification when add success");
        isElementVisible(notification);
        System.out.println("notification is displayed");
    }

    public void input_add_employee() throws InterruptedException {
        Thread.sleep(5000);
        firstName_textbox.sendKeys(name.substring(0, 2));
        middleName_textbox.sendKeys(name.substring(3, 7));
        lastName_textbox.sendKeys(name.substring(8));
    }

    public void input_add_admin() {
        user_name.sendKeys(userName);
        password.sendKeys(pass_first);
        confirm_password.sendKeys(pass_first);
    }

    public void input_changePass() {
        pass_textbox.sendKeys(pass_change);
        passConfirm_textbox.sendKeys(pass_change);
    }

    public void addEmployee() throws InterruptedException {
        isElementVisible(PIM);
        PIM.click();

        isElementVisible2(add_PIM_button);
        add_PIM_button.click();

        input_add_employee();
        id_employee.clear();
        id_employee.sendKeys(String.valueOf(id));
        Thread.sleep(3000);

        isElementVisible2(saveAddEmployee_button);
        saveAddEmployee_button.click();

        checkNotification();
    }

    public void create_newAdmin() {

        isElementVisible(admin_list);
        admin_list.click();

        isElementVisible2(addAdmin_button);
        addAdmin_button.click();

        isElementVisible(user_role);
        user_role.click();
        driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']//span[text()='Admin']")).click();

        employee_name.sendKeys(name);
        driver.findElement(By.xpath("//span[text()='vo minh thien']")).click();


        isElementVisible(status);
        status.click();
        driver.findElement(By.xpath("//span[text()='Enabled']")).click();

        input_add_admin();


        isElementVisible2(save_button);
        save_button.click();

        checkNotification();

    }

    public void inputEmployee() {
        PIM.click();
        employeeName_textbox.click();
        employeeName_textbox.sendKeys(name);
    }
}

   /* public void checkEmployee() throws InterruptedException {


}*/


