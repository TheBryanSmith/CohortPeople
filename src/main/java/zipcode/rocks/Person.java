package zipcode.rocks;
//import com.sun.org.apache.xpath.internal.operations.Bool;

public class Person {
    private String firstname;
    private String lastname,favoriteColor, birthMonth, gitHub, beverage;
    private boolean havePets;

    public Person(String fname,String lname) {
        this.firstname = fname;
        this.lastname = lname;
    }

    public Person(String fname, String lname, String favoriteColor, String birthMonth, String gitHub, String beverage, Boolean havePets) {
        this.firstname = fname;
        this.lastname = lname;
        this.favoriteColor = favoriteColor;
        this.birthMonth = birthMonth;
        this.gitHub = gitHub;
        this.beverage = beverage;
        this.havePets = havePets;;
    }

    public Person(String fname, String lname, String birthMonth, String favoriteColor) {
        this.firstname = fname;
        this.lastname = lname;
        this.birthMonth = birthMonth;
        this.favoriteColor = favoriteColor;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public Boolean getHavePets() {
        return havePets;
    }

    public void setHavePets(Boolean havePets) {
        this.havePets = havePets;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.birthMonth + ", " + this.favoriteColor;
    }
}
