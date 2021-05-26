package Oops.DataHiding;

public class encap {
    
    private String Username;
    private String Password;

    public encap(String username,String password) {

        this.Username = username;
        this.Password = password;
    }


    public void login(String usname,String pass)
    {
        if (this.Username.toLowerCase().equals(usname.toLowerCase()) && this.Password.toLowerCase().equals(pass.toLowerCase())) 
        {

            System.out.println("Successfully Logged In And Your Credentials are");
            System.out.println("Your user name is "+Username+" and password is "+Password);



        }
        else
        {

            System.out.println("Invalid Credentials");

        }

    }



    

    public static void main (String args[])
    {

        encap e=new encap("Divisht","Admin123");//Creates a new user and stores the password and username
       // e.login("Divisht","Admin123");//Grants access because credentials are valid
        //e.login("Divisht","Admin");       //Does not grant access because the credentials are invalid
        e.Password="Hello";         //Store  and change  the password without auth
        e.login("Divisht","Hello");// GRANTS ACCESS BUT THIS SHOULD NOT HAVE HAPPENED!



    }
}
