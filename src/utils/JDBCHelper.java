/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class JDBCHelper 
{
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=DA1_RapPhim;";
    private static String user ="sa";
    private static String pass = "123456";
    
    // nap driver
    static 
    {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    };
    
    /**
     *
     * @param sql
     * @param args
     * @return
     * @throws java.sql.SQLException
     */
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException
    {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{"))
        pstmt  = conn.prepareCall(sql);
        else pstmt = conn.prepareStatement(sql);
        
        for(int i = 0; i < args.length; i++)
            pstmt.setObject(i+1, args[i]);
        
        
        return pstmt;
    }
    
    public static int Update(String sql, Object... args)
    {
        try 
        {
            PreparedStatement stmt = getStmt(sql, args);
            try 
            {
                return stmt.executeUpdate();
            } 
            finally 
            {
                stmt.getConnection().close();
            }
        } 
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }  
    }
    
    
    public static ResultSet Query(String sql, Object... args)
    {
        try 
        {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } 
        catch (SQLException e) 
        {
            throw new RuntimeException(e);
        }
    }
    
    public static Object Value(String sql, Object... args) 
    {
        try 
        {
            ResultSet rs = Query(sql, args);
            if(rs.next())
            {
                return rs.getObject(0);
            }
            rs.getStatement().close();
        } 
        catch (Exception e) 
        {
            throw new RuntimeException(e);
        }
        
        return null;
    }
}
