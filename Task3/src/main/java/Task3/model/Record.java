package Task3.model;

/**
 * Created by dvsta on 12.11.2017.
 */
public class Record {
    String name, surname, nickName, phoneNumber, skype, email;

    public Record(/*String name, String surname,*/ String nickName/*, String phoneNumber, String skype, String email*/) {
       /* this.name = name;
        this.surname = surname;*/
        this.nickName = nickName;
       /* this.phoneNumber = phoneNumber;
        this.skype = skype;
        this.email = email;*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickName='" + nickName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", skype='" + skype + '\'' +
                ", email='" + email + '\''
                ;
    }
}
