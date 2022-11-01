package jm.task.core.jdbc.dao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import static jm.task.core.jdbc.util.Util.getConnection;


public class UserDaoJDBCImpl implements UserDao {
    //private Connection connection = getConnection();

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() throws SQLException {
//        String sql = "insert into users (name, lastName, age) values('Maxim', 'Astashov', 26)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.executeUpdate();
//            connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("connection error");
//            connection.rollback();
//        }
//        cleanUsersTable();
    }

    public void dropUsersTable() throws SQLException {
//        List<User> userListDelete = getAllUsers();
//        userListDelete.clear();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
//        String sql = "insert into users (name, lastName, age) values(?, ?, ?)";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2, lastName);
//        preparedStatement.setByte(3, age);
//        preparedStatement.executeUpdate();
//        connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("connection error");
//            connection.rollback();
//        }
//        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) throws SQLException {
//        String sql = "delete from users where id = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//            connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("connection error");
//            connection.rollback();
//        }
    }

    public List<User> getAllUsers() throws SQLException {
//        List<User> userList = new ArrayList<>();
//        String sql = "select id, name, lastName, age from users";
//
//        try (Statement statement = connection.createStatement();) {
//            ResultSet resultSet = statement.executeQuery(sql);
//            connection.commit();
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//
//                userList.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("connection error");
//            connection.rollback();
//        }
//        return userList;
        return null;
    }

    public void cleanUsersTable() throws SQLException {
//        String sql = "delete from users";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//            preparedStatement.executeUpdate();
//            connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("connection error");
//            connection.rollback();
//        }
    }
}



