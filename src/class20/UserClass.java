package class20;
/*Write program: userClass  that has a constructor that initializes instance
        variable name and mobile number. Create a subclass  userInfo
        that will have user address variable and it also being initialized
        through constructor call. Print users name, mobile number and address
        in userDetails method. Test your code.*/


public class UserClass {
    String name;
    int phoneNum;
    UserClass(String name,int phoneNum){
        this.name=name;
        this.phoneNum=phoneNum;
    }
}
class UserInfo extends UserClass{
    String address;
    UserInfo(String name, int phoneNum,String address) {
        super(name, phoneNum);
        this.address=address;
    }

    void userDetails(){
        System.out.println("Name :"+name+" mobile number:"+phoneNum+" address:"+address);
    }
}

