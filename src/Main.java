public class Main {

    public static void main(String[] args) {

        // Code for creating our objects
        idAndPasswords idandPasswords = new idAndPasswords();
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}