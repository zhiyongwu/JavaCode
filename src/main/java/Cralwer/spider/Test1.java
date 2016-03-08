package Cralwer.spider;

import Cralwer.helper.DatabaseHelper;
import Cralwer.util.BeanUtil;
import org.apache.commons.dbutils.QueryRunner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * Created by wuzhiyong on 16/3/1.
 */
public class Test1 {
    private static final QueryRunner queryrunner = new QueryRunner();
    public static void main(String[] args) throws Exception{
        Connection conn = DatabaseHelper.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select link from seedurl");
        while (rs.next()){
            System.out.println(rs.getString(1));

        }
    }

    private void write(List<?> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(""));

    }
}
