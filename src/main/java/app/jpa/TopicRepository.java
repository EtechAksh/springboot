package app.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer> {

    Topic findById(int id);

}




/*   try {

            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            connect = DriverManager
                    .getConnection("jdbc:derby://localhost/c:/temp/db/FAQ/db");
            PreparedStatement statement = connect
                    .prepareStatement("SELECT * from USERS");

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String user = resultSet.getString("name");
                String number = resultSet.getString("number");
                System.out.println("User: " + user);
                System.out.println("ID: " + number);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }
    */
