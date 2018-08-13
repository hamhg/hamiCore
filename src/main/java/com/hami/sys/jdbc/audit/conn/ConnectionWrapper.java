package com.hami.sys.jdbc.audit.conn;

import com.hami.sys.jdbc.audit.statement.CallableStatementWrapper;
import com.hami.sys.jdbc.audit.statement.PreparedStatementWrapper;
import com.hami.sys.jdbc.audit.statement.StatementWrapper;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * <pre>
 * <li>Program Name : ConnectionWrapper
 * <li>Description  :
 * <li>History      : 2018. 2. 19.
 * </pre>
 *
 * @author HHG
 */
public class ConnectionWrapper implements Connection {
    protected Connection conn;

    public ConnectionWrapper(Connection conn) throws SQLException {
        this.conn = conn;
    }

    public final Connection getOriginalConn() {
        return conn;
    }

    public Statement createStatement() throws SQLException {
        return new StatementWrapper(conn.createStatement());
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new StatementWrapper(conn.createStatement(resultSetType, resultSetConcurrency));
    }

    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
            throws SQLException {
        return new StatementWrapper(conn.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return new PreparedStatementWrapper(conn.prepareStatement(sql), sql);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
                                              int resultSetHoldability) throws SQLException {
        return new PreparedStatementWrapper(
                conn.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability), sql);
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new PreparedStatementWrapper(conn.prepareStatement(sql, autoGeneratedKeys), sql);
    }

    public PreparedStatement prepareStatement(String sql, int columnIndexes[]) throws SQLException {
        return new PreparedStatementWrapper(conn.prepareStatement(sql, columnIndexes), sql);
    }

    public PreparedStatement prepareStatement(String sql, String columnNames[]) throws SQLException {
        return new PreparedStatementWrapper(conn.prepareStatement(sql, columnNames), sql);
    }

    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
            throws SQLException {
        return new PreparedStatementWrapper(conn.prepareStatement(sql, resultSetType, resultSetConcurrency), sql);
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
                                         int resultSetHoldability) throws SQLException {
        return new CallableStatementWrapper(
                conn.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability), sql);
    }

    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new CallableStatementWrapper(conn.prepareCall(sql, resultSetType, resultSetConcurrency), sql);
    }

    public CallableStatement prepareCall(String sql) throws SQLException {
        return new CallableStatementWrapper(conn.prepareCall(sql), sql);
    }

    public String nativeSQL(String sql) throws SQLException {
        return conn.nativeSQL(sql);
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        conn.setAutoCommit(autoCommit);
    }

    public boolean getAutoCommit() throws SQLException {
        return conn.getAutoCommit();
    }

    public void commit() throws SQLException {
        conn.commit();
    }

    public void rollback() throws SQLException {
        conn.rollback();
    }

    public void close() throws SQLException {
        conn.close();
    }

    public boolean isClosed() throws SQLException {
        return conn.isClosed();
    }

    public DatabaseMetaData getMetaData() throws SQLException {
        return conn.getMetaData();
    }

    public void setReadOnly(boolean readOnly) throws SQLException {
        conn.setReadOnly(readOnly);
    }

    public boolean isReadOnly() throws SQLException {
        return conn.isReadOnly();
    }

    public void setCatalog(String catalog) throws SQLException {
        conn.setCatalog(catalog);
    }

    public String getCatalog() throws SQLException {
        return conn.getCatalog();
    }

    public void setTransactionIsolation(int level) throws SQLException {
        conn.setTransactionIsolation(level);
    }

    public int getTransactionIsolation() throws SQLException {
        return conn.getTransactionIsolation();
    }

    public SQLWarning getWarnings() throws SQLException {
        return conn.getWarnings();
    }

    public void clearWarnings() throws SQLException {
        conn.clearWarnings();
    }

    public Map getTypeMap() throws SQLException {
        return conn.getTypeMap();
    }

    public void setTypeMap(Map map) throws SQLException {
        conn.setTypeMap(map);
    }

    public void setHoldability(int holdability) throws SQLException {
        conn.setHoldability(holdability);
    }

    public int getHoldability() throws SQLException {
        return conn.getHoldability();
    }

    public Savepoint setSavepoint() throws SQLException {
        return conn.setSavepoint();
    }

    public Savepoint setSavepoint(String name) throws SQLException {
        return conn.setSavepoint(name);
    }

    public void rollback(Savepoint savepoint) throws SQLException {
        conn.rollback(savepoint);
    }

    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        conn.releaseSavepoint(savepoint);
    }

    public Clob createClob() throws SQLException {
        return conn.createClob();
    }

    public Blob createBlob() throws SQLException {
        return conn.createBlob();
    }

    public NClob createNClob() throws SQLException {
        return conn.createNClob();
    }

    public SQLXML createSQLXML() throws SQLException {
        return conn.createSQLXML();
    }

    public boolean isValid(int timeout) throws SQLException {
        return conn.isValid(timeout);
    }

    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        conn.setClientInfo(name, value);
    }

    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        conn.setClientInfo(properties);
    }

    public String getClientInfo(String name) throws SQLException {
        return conn.getClientInfo(name);
    }

    public Properties getClientInfo() throws SQLException {
        return conn.getClientInfo();
    }

    public Array createArrayOf(String typeName, Object elements[]) throws SQLException {
        return conn.createArrayOf(typeName, elements);
    }

    public Struct createStruct(String typeName, Object attributes[]) throws SQLException {
        return conn.createStruct(typeName, attributes);
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        conn.setSchema(schema);
    }

    @Override
    public String getSchema() throws SQLException {
        return conn.getSchema();
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        conn.abort(executor);
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        conn.setNetworkTimeout(executor, milliseconds);
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return conn.getNetworkTimeout();
    }

    public Object unwrap(Class iface) throws SQLException {
        return conn.unwrap(iface);
    }

    public boolean isWrapperFor(Class iface) throws SQLException {
        return conn.isWrapperFor(iface);
    }
}