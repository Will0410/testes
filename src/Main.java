
import java.sql.*;


public class Main {
    public static void main(String[] args) {


        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/java",
                    "root",
                    "Ju04102005"
            );
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM iniciativa");

            if (resultSet.next()){
                System.out.println(resultSet.getString("user"));
                System.out.println(resultSet.getString("idade"));

            }


            int codMedico = 33234;
            Boolean medicosnosistema = true;
            int [] Bonus = {45717,788,4000,1200,3456,200,700,1500,4578,3699,4788,7888};

            switch (codMedico) {
                case 33220:
                    System.out.println("Bem-Vindo "+ "Alan");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[0]);
                    break;
                case 33234:
                    System.out.println("Bem-Vindo "+  resultSet.getString("user"  ));
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[1]);
                    break;
                case 33247:
                    System.out.println("Bem-Vindo "+ "Marcela");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[2]);
                    break;
                case 36921:
                    System.out.println("Bem-Vindo "+ "Cleiton");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[3]);
                    break;
                case 32021:
                    System.out.println("Bem-Vindo "+ "Bia");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[4]);
                    break;
                case 34721:
                    System.out.println("Bem-Vindo "+ "Ana Clara");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[5]);
                    break;
                case 39021:
                    System.out.println("Bem-Vindo "+ "Gabriel");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[6]);
                    break;
                case 33621:
                    System.out.println("Bem-Vindo "+ "Evandro");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[7]);
                    break;
                case 36521:
                    System.out.println("Bem-Vindo "+ "Mathias");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[8]);
                    break;
                case 37121:
                    System.out.println("Bem-Vindo "+ "Richard");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[9]);
                    break;
                case 37621:
                    System.out.println("Bem-Vindo "+ "Cleide");
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[10]);
                    break;
                case 33221:
                    System.out.println(("Bem-Vindo ")+ resultSet.getString("user" ));
                    System.out.println("Sua Bonificação será de R$ "+ Bonus[11]);
                    break;
                default:
                    System.out.println("Medico Inexistente");
                    break;


            }
        }catch (SQLException e) {
            e.printStackTrace();
        }







                }
            }







