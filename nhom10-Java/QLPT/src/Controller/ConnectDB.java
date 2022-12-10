/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Account;
import Model.Vehicle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author hoang
 */

public class ConnectDB {
    static  Connection conn = null;
   public Connection getConnection(){
     
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return conn;
    }
    public boolean addVehicle(Vehicle s){
        
        String sql = "insert into VEHICLE(VehID,VehName,Maker,VehType,Year,Price,Color,SeatNum,EngineType,Watt,Tonn) values(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getVehicleId());
            ps.setString(2,s.getVehicleName());
            ps.setString(3,s.getMaker());
            ps.setString(4,s.getVehType());
            ps.setInt(5,s.getYear());
            ps.setDouble(6,s.getUnitPrice());
            ps.setString(7,s.getColor());
            ps.setInt(8,s.getSeatNum());
            ps.setString(9,s.getEngineType());
            ps.setInt(10,s.getWattage());
            ps.setInt(11,s.getTonnage());
            
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateVehicle(Vehicle s) throws Exception{
        String sql = "update VEHICLE set VehName = ?,Maker = ?,Year = ?,Price = ?,Color = ?,SeatNum = ?,EngineType = ?,Watt = ?,Tonn = ? where VehId=?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
              System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getVehicleId());
            ps.setString(2,s.getVehicleName());
            ps.setString(3,s.getMaker());
            ps.setString(4,s.getVehType());
            ps.setInt(5,s.getYear());
            ps.setDouble(6,s.getUnitPrice());
            ps.setString(7,s.getColor());
            ps.setInt(8,s.getSeatNum());
            ps.setString(9,s.getEngineType());
            ps.setInt(10,s.getWattage());
            ps.setInt(11,s.getTonnage());
            
         
            return ps.executeUpdate() > 0;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteVehicle(String VehID){
        String sql="delete from VEHICLE where VehID=?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, VehID);
            return ps.executeUpdate()>0;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
   public ArrayList<Vehicle>showOTo(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'ô tô'";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getInt("Year")
                        ,rs.getInt("Price")
                        ,rs.getString("Color"),
                        rs.getInt("SeatNum"),
                        rs.getString("EngineType"),
                        rs.getInt("Watt")
                        ,rs.getInt("Tonn"));
                vehicleList.add(st);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return vehicleList;
    }
   public ArrayList<Vehicle>showXeMay(){
        ArrayList<Vehicle> vehicleList2 = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'xe máy'";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getInt("Year")
                        ,rs.getInt("Price")
                        ,rs.getString("Color"),
                        rs.getInt("SeatNum"),
                        rs.getString("EngineType"),
                        rs.getInt("Watt")
                        ,rs.getInt("Tonn"));
                vehicleList2.add(st);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return vehicleList2;
   }
    public ArrayList<Vehicle>showXeTai(){
        ArrayList<Vehicle> vehicleList3 = new ArrayList<>();
        String sql = "select * from VEHICLE where VehType = 'xe tai'";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getInt("Year")
                        ,rs.getInt("Price")
                        ,rs.getString("Color"),
                        rs.getInt("SeatNum"),
                        rs.getString("EngineType"),
                        rs.getInt("Watt")
                        ,rs.getInt("Tonn"));
                vehicleList3.add(st);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return vehicleList3;
    }
    public ArrayList<Account>LoginUser(){
        ArrayList<Account> acc = new ArrayList<>();
        String sql = "select * from ACCOUNT where Rol= '1";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
               Account account = new Account(rs.getString("Username"),
                        rs.getString("Password"),rs.getString("Name"),rs.getString("Email"),
                        rs.getString("Phonenumber")
                        ,rs.getInt("Rol")
                        );
                acc.add(account);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return acc;
    }
      public Vehicle findById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getInt("Year"));
                v.setUnitPrice(rs.getDouble("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getInt("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getInt("Watt"));
                v.setTonnage(rs.getInt("Tonn"));
                return v;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Vehicle findXeMayById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='xe máy'";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                 Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getInt("Year"));
                v.setUnitPrice(rs.getDouble("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getInt("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getInt("Watt"));
                v.setTonnage(rs.getInt("Tonn"));
                return v;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Vehicle findOToById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='ô tô'";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getInt("Year"));
                v.setUnitPrice(rs.getDouble("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getInt("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getInt("Watt"));
                v.setTonnage(rs.getInt("Tonn"));
                return v;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Vehicle findXeTaiById(String vehicleId){
        String sql = "select * from VEHICLE where VehID = ? and VehType='xe tai'";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vehicleId);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Vehicle v = new Vehicle();
                v.setVehicleId(rs.getString("VehID"));
                v.setVehicleName(rs.getString("VehName"));
                v.setMaker(rs.getString("Maker"));
                v.setVehType(rs.getString("VehType"));
                v.setYear(rs.getInt("Year"));
                v.setUnitPrice(rs.getDouble("Price"));
                v.setColor(rs.getString("Color"));
                v.setSeatNum(rs.getInt("SeatNum"));
                v.setEngineType(rs.getString("EngineType"));
                v.setWattage(rs.getInt("Watt"));
                v.setTonnage(rs.getInt("Tonn"));
                return v;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Vehicle>findAll(){
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        String sql = "select * from vehicle";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Vehicle st = new Vehicle(rs.getString("VehID"),
                        rs.getString("VehName"),rs.getString("Maker"),rs.getString("VehType"),
                        rs.getInt("Year"),rs.getInt("Price"),rs.getString("Color"),
                        rs.getInt("SeatNum"),rs.getString("EngineType"),rs.getInt("Watt"),rs.getInt("Tonn"));
                vehicleList.add(st);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return vehicleList;
    }
    
    
    public boolean addAccount(Account ac){
        
        String sql = "insert into ACCOUNT(Username, Password, Name, Email, Phonenumber, Rol) values(?,?,?,?,?,?)";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,ac.getUserName());
            ps.setString(2,ac.getPassword());
            ps.setString(3,ac.getName());
            ps.setString(4,ac.getEmail());
            ps.setString(5,ac.getPhoneNumber());
            ps.setInt(6,'1');
            
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean updateAccount(Account ac) throws Exception{
        String sql = "update ACCOUNT set Password=?, Name=?, Email=?, Phonenumber=? where Username=?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(5,ac.getUserName());
            ps.setString(1,ac.getPassword());
            ps.setString(2,ac.getName());
            ps.setString(3,ac.getEmail());
            ps.setString(4,ac.getPhoneNumber());
            
            return ps.executeUpdate() > 0;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteAccount(String Username){
        String sql="delete from ACCOUNT where Username=?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Username);
            return ps.executeUpdate()>0;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Account findTaiKhoanById(String Username){
        String sql = "select * from ACCOUNT where Username = ?";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://KHONGVANTUYEN\\SQLEXPRESS:1433;databaseName=QLPT";
            String user = "sa";
            String pass = "";
            conn = DriverManager.getConnection(url,user,pass);
            if(conn!=null)
                System.out.println("Ket noi thanh cong!");
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Username);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                Account ac = new Account();
                ac.setUserName(rs.getString("UserName"));
                ac.setPassword(rs.getString("Password"));
                ac.setName(rs.getString("Name"));
                ac.setEmail(rs.getString("Email"));
                ac.setPhoneNumber(rs.getString("Phonenumber"));
                ac.setRol(rs.getInt("Rol"));
                return ac;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Account>showTaiKhoan(){
        ArrayList<Account> accountList = new ArrayList<>();
        String sql = "select * from ACCOUNT where Rol = 1";
        ConnectDB cn = new ConnectDB();
        try{
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Account ac = new Account(rs.getString("Username"),
                        rs.getString("Password"),rs.getString("Name"),rs.getString("Email"),
                        rs.getString("Phonenumber"),rs.getInt("Rol"));
                accountList.add(ac);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return accountList;
    }
    public static void main(String[] args) {
        ConnectDB conn = new ConnectDB();
        conn.getConnection();
       
    }
}
        
