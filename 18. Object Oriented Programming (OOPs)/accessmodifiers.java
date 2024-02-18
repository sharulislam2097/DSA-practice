public class accessmodifiers {

    public static void main(String[] args){


        BankAccount myacc = new BankAccount();

        myacc.username = "Persons name";
        myacc.setPassword("mypasswordisnull");

        System.out.println(myacc.username);
    }
    
}


class BankAccount{
    public String username;
    private String password ;

    

    public void setPassword(String pwd){
        password = pwd;
    }

    
}
