package com.employeeapp;
import java.sql.*;
import java.util.*;

public class EmployeeDAO {  
       public void addEmployee(Employee emp) { 
           String query = "INSERT INTO employees(name,city, salary) VALUES(?,?,?)";
           try(Connection conn = DBConnection.getConnection();
               PreparedStatement pst = conn.prepareStatement(query)) {
                  pst.setString(1, emp.getName());
                  pst.setString(2, emp.getCity());
                  pst.setDouble(3, emp.getSalary());
                  pst.executeUpdate();
                  System.out.println("Employee added succesfully!");
           } catch(Exception e) {
                e.printStackTrace();
           }
        }

        public void getAllEmployees() {
             String query = "SELECT * FROM employees";
             try(Connection conn = DBConnection.getConnection();
                  Statement st = conn.createStatement();
                  ResultSet rs= st.executeQuery(query)) {
                     System.out.println("\n Employee List:");
                     while(rs.next()) {
                           System.out.println(rs.getInt("id") + " | " +
                                              rs.getString("name") + " | " +
                                              rs.getString("city") + " | " + 
                                              rs.getDouble("salary"));
                     }
             } catch (Exception e) {
                e.printStackTrace();
             }
        }

    public void updateEmployee(int id, double  newSalary) {
            String query = "UPDATE employees SET salary=? WHERE id=?";
             try(Connection conn = DBConnection.getConnection();
                PreparedStatement pst= conn.prepareStatement(query)) {
                pst.SetDouble(1, newSalary);
                pst.setInt(2,id);
                pst.executeUpdate();
                System.out.println("Employee updated successfully!");
             }catch (Exception e){ 
               e.printStacktrace();
             }
    }


  public void deleteEmployee(int id){
       String query= "DELETE FROM emnployees WHERE id=?";
        try(Connection conn = DBConnection.getConnection();
            PreparedStatement pst= conn.prepareStatement(query) {
            pst.setInt(1,id);
            pst.executeUpdate();
            System.out.println("  Employee deleted successfully!");
        } catch(Exception e) { 
           e.printStackTrace();
        }
  }
}
  
     
  
                                                
