package com.capg.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class ProductDaoImpl implements ProductDao {

    private DataSource dataSource;

    ProductDaoImpl() {
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(ProductBean bean) {

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = dataSource.getConnection();

            pstmt = connection.prepareStatement("INSERT INTO PRODUCTBEAN VALUES(?,?,?,?)");

            pstmt.setInt(1, bean.getProductId());
            pstmt.setString(2, bean.getProductName());
            pstmt.setString(3, bean.getCategory());
            pstmt.setString(4, bean.getManufacturer());

            pstmt.execute();

            System.out.println("Product Added Successfully!");
        } catch (Exception e) {
            System.out.println("Failed to insert the record!");
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public ProductBean get(int productId) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        ProductBean res = null;

        try {
            con = dataSource.getConnection();

            stmt = con.createStatement();

            String query = "SELECT * FROM PRODUCTBEAN WHERE PRODUCT_ID=" + productId;

            rs = stmt.executeQuery(query);

            if (rs.next()) {
                res = new ProductBean();
                res.setProductId(rs.getInt("PRODUCT_ID"));
                res.setProductName(rs.getString("PRODUCT_NAME"));
                res.setCategory(rs.getString("CATEGORY"));
                res.setManufacturer(rs.getString("MANUFACTURER"));
            }

        } catch (Exception e) {
            System.out.println("Error While fetching the record!");
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return res;
    }

    @Override
    public int removeProduct(int productId) {

        Connection con = null;
        Statement stmt = null;
        int res = 0;

        try {
            con = dataSource.getConnection();

            stmt = con.createStatement();

            String query = "DELETE FROM PRODUCTBEAN WHERE PRODUCT_ID=" + productId;

            res = stmt.executeUpdate(query);

        } catch (Exception e) {
            System.out.println("Error While deleting the record!");
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return res;
    }

    @Override
    public int updateProductName(int productId, String newName) {

        Connection con = null;
        PreparedStatement stmt = null;
        int res = 0;

        try {
            con = dataSource.getConnection();

            stmt = con.prepareStatement("UPDATE PRODUCTBEAN SET PRODUCT_NAME=? WHERE PRODUCT_ID=?");

            stmt.setString(1, newName);
            stmt.setInt(2, productId);

            res = stmt.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error While Updating the record!");
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return res;
    }
}