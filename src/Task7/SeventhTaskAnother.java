package Task7;

public class SeventhTaskAnother {

    public static String extractFirstAndLastName(String email) {
        int index = email.indexOf('@');
        String[] user = email.substring(0, index).split("_");
        String name = user[0].substring(0, 1).toUpperCase() + user[0].substring(1);
        String surname = user[1].substring(0, 1).toUpperCase() + user[1].substring(1);
        return name + " " + surname;
    }

    public static void main(String[] args) {
        System.out.println(extractFirstAndLastName("dmytro_latyshev@ctdev.io"));
    }
}
