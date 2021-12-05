package Day8.Main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import Day8.Model.Employees;
import Day8.dbUtil.OracleConnector;

public class TestEmployeeOracleDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        List<Employees> listOfEmployees = new ArrayList<Employees>();
        OracleConnector oC = new OracleConnector();
        Connection con = oC.getOracleConnection();
        Statement stm = con.createStatement();
        String query = "select e.first_name, e.last_name, e.SALARY, NVL(e.COMMISSION_PCT, 0) as Commission, j.job_title, d.department_name, c.country_name " +
                "from employees e " +
                "JOIN JOBS j on E.JOB_ID=J.JOB_ID " +
                "LEFT JOIN DEPARTMENTS d ON E.DEPARTMENT_ID = D.DEPARTMENT_ID " +
                "LEFT JOIN LOCATIONS l ON D.LOCATION_ID = L.LOCATION_ID " +
                "LEFT JOIN COUNTRIES c ON L.COUNTRY_ID = c.country_id "+
                "LEFT JOIN REGIONS r ON C.REGION_ID = R.REGION_ID " +
                "WHERE e.salary>10000";
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()) {
            String name = rs.getString("first_name");
            String surname = rs.getString("last_name");
            int salary = rs.getInt("SALARY");
            double commission = rs.getDouble("Commission");
            String position = rs.getString("job_title");
            String depName = rs.getString("department_name");
            String country = rs.getString("country_name");

            Employees emp = new Employees(name, surname, salary, commission, position, depName, country);
            listOfEmployees.add(emp);
        }
        if (stm != null) stm.close();
        if (con != null) con.close();

        for (Employees e : listOfEmployees) {
            System.out.println(e.toString());
        }
    }
}
