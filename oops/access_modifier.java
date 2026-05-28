public class access_modifier {
    public static void main(String[] args) {
        BankAccount myacc=new BankAccount();
        myacc.name="Govind Kumar";
        myacc.password="ghkkf";
    }

}
class BankAccount{
    public String name;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }
}