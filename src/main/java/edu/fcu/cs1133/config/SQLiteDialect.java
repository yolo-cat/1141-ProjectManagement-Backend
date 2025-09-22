package edu.fcu.cs1133.config;

// 使用社群版的 SQLiteDialect，避免自行維護不完整的實作
public class SQLiteDialect extends org.hibernate.community.dialect.SQLiteDialect {
    public SQLiteDialect() {
        super();
    }
}
