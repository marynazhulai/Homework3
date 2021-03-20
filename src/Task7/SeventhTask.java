package Task7;

public class SeventhTask {
    public static void main(String[] args) {

        String email = "john_smith@example.com";

        int a = email.indexOf("@");
        int b = email.indexOf("_");

        String Login = email.substring(0, 1).toUpperCase() + email.substring(1, b) + " " + email.substring(b+1, b+2).toUpperCase() + email.substring(b+2, a);
        System.out.println(Login);


        String domain = email.substring(a+1);
        System.out.println(domain);


//Variant 2

        /*String email = "john_smith@example.com";

        int a = email.indexOf("@");
        int b = email.indexOf("_");

        String c = email.substring(0, a);
        String Login = c.substring(0, 1).toUpperCase() + c.substring(1, b) + " " + c.substring(b+1, b+2).toUpperCase() + c.substring(b+2);
        System.out.println(Login);


        String domain = email.substring(a+1);
        System.out.println(domain);
*/



//Variant 3

       /* String email = "john_smith@example.com";

        int a = email.indexOf("@");

        String preLogin = email.substring(0, a);

        char ch1 = preLogin.charAt(0);
        char ch2 = Character.toUpperCase(ch1);

        char ch3 = preLogin.charAt(5);
        char ch4 = Character.toUpperCase(ch3);
        String login = ch2 + preLogin.substring(1, 4) + " " + ch4 + preLogin.substring(6, 10);
        System.out.println(login);

        String domain = email.substring(a+1);
        System.out.println(domain);*/

    }
}



