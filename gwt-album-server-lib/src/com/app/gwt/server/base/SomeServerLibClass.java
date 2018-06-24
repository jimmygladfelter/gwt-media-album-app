package com.app.gwt.server.base;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeServerLibClass implements Serializable {

	private static final long serialVersionUID = -9002388957992114652L;

	public SomeServerLibClass() {
		// no-op
	}

	public int findNumberOfPetsTest() {
		int result = -1;
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection conn = null;
			try {
				Properties connectionProps = new Properties();
				connectionProps.put("user", "root");
				connectionProps.put("password", "Dev-password1");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwt_app_template_db", connectionProps);

				// Do something with the Connection
				Statement stmt = null;
				ResultSet rs = null;

				try {
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT * FROM pet");

					// Now do something with the ResultSet ....
					Map<String, Set<String>> ownerToNameSetMap = new HashMap<String, Set<String>>();
					while (rs.next()) {
						String name = rs.getString("name");
						String owner = rs.getString("owner");
						// String species = rs.getString("species");
						// String sex = rs.getString("sex");
						Set<String> nameSet = ownerToNameSetMap.get(owner);
						if (nameSet == null) {
							nameSet = new HashSet<String>();
							ownerToNameSetMap.put(owner, nameSet);
						}
						nameSet.add(name);
					}

					// count the number of pets.
					result = 0;
					for (Map.Entry<String, Set<String>> entry : ownerToNameSetMap.entrySet()) {
						Set<String> numAnimalsForOwner = entry.getValue();
						result += numAnimalsForOwner != null ? numAnimalsForOwner.size() : 0;
					}
				} catch (SQLException ex) {
					// handle any errors
					System.out.println("SQLException: " + ex.getMessage());
					System.out.println("SQLState: " + ex.getSQLState());
					System.out.println("VendorError: " + ex.getErrorCode());
				} finally {
					// it is a good idea to release
					// resources in a finally{} block
					// in reverse-order of their creation
					// if they are no-longer needed

					if (rs != null) {
						try {
							rs.close();
						} catch (SQLException sqlEx) {
						} // ignore

						rs = null;
					}

					if (stmt != null) {
						try {
							stmt.close();
						} catch (SQLException sqlEx) {
						} // ignore

						stmt = null;
					}
				}

			} catch (SQLException ex) {
				// handle any errors
				System.out.println("SQLException: " + ex.getMessage());
				System.out.println("SQLState: " + ex.getSQLState());
				System.out.println("VendorError: " + ex.getErrorCode());
			}
		} catch (Exception ex) {
			// handle the error
			System.out.println("Exception: " + ex.getMessage());
		}
		return result;
	}
}
