package Day8.Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import Day8.dbUtil.OracleConnector;
import Day8.Model.SalaryRep;

public class TestOracleDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        List<SalaryRep> finalReport = new ArrayList<SalaryRep>();
        OracleConnector oC = new OracleConnector();
        Connection con = oC.getOracleConnection();
        Statement stm = con.createStatement();
        String query = "select " +
                "min(e.SALARY + E.SALARY * NVL(e.COMMISSION_PCT, 0)) minSAL," +
                "max(e.SALARY + E.SALARY * NVL(e.COMMISSION_PCT, 0)) maxSAL," +
                "sum(e.SALARY + E.SALARY * NVL(e.COMMISSION_PCT, 0)) sumSAL," +
                "avg(e.SALARY + E.SALARY * NVL(e.COMMISSION_PCT, 0)) avgSAL," +
                "stddev(e.SALARY + E.SALARY * NVL(e.COMMISSION_PCT, 0)) stddevSAL," +
                "C.COUNTRY_NAME," +
                "R.REGION_NAME " +
                "from EMPLOYEES e " +
                "LEFT JOIN DEPARTMENTS d ON E.DEPARTMENT_ID = D.DEPARTMENT_ID " +
                "LEFT JOIN LOCATIONS l ON D.LOCATION_ID = L.LOCATION_ID " +
                "LEFT JOIN COUNTRIES c ON L.COUNTRY_ID = c.country_id " +
                "LEFT JOIN REGIONS r ON C.REGION_ID = R.REGION_ID " +
                "where C.COUNTRY_NAME is not null " +
                "GROUP BY C.COUNTRY_NAME, " +
                "R.REGION_NAME";
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()){
            String countryName = rs.getString("COUNTRY_NAME");
            String regionName = rs.getString("REGION_NAME");
            double summa = rs.getDouble("SUMSAL");
            double avgSal = rs.getDouble("AVGSAL");
            double minSal = rs.getDouble("MINSAL");
            double maxSal = rs.getDouble("MAXSAL");
            double stDev = rs.getDouble("STDDEVSAL");

            SalaryRep sr = new SalaryRep(regionName,countryName,minSal,maxSal,summa,avgSal, stDev);
            finalReport.add(sr);

        }

        if (stm != null) stm.close();
        if (con != null) con.close();

        for (SalaryRep repLine : finalReport) {
            System.out.println(repLine.toString());
        }
    }
}






