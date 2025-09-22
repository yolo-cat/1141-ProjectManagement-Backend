package edu.fcu.cs1133.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class DatabaseService {

  @Value("${spring.datasource.url}")
  private String datasourceUrl;

  // Provide empty default so placeholder resolution won't fail when properties are absent
  @Value("${spring.datasource.username:}")
  private String username;

  @Value("${spring.datasource.password:}")
  private String password;

  public Connection connect() throws SQLException {
    // If username not provided (e.g. SQLite), use the URL-only getConnection overload
    if (username == null || username.isEmpty()) {
      return DriverManager.getConnection(datasourceUrl);
    }
    return DriverManager.getConnection(datasourceUrl, username, password);
  }
}