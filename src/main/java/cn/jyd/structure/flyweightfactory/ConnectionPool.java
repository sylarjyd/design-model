/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.flyweightfactory
 * Date:2018年8月26日下午4:19:29
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午4:19:29
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.flyweightfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
/**
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开
销，通常与工厂模式一起使用。
FlyWeightFactory 负责创建和管理享元单元，当一个客户端请求时，工厂需要检查当前对象池
中是否有符合条件的对象，如果有，就返回已经存在的对象，如果没有，则创建一个新对象，
FlyWeight 是超类。一提到共享池，我们很容易联想到 Java 里面的 JDBC 连接池，想想每个
连接的特点，我们不难总结出：适用于作共享的一些个对象，他们有一些共有的属性，就拿数
据库连接池来说，url、driverClassName、username、password 及 dbname，这些属性对于
每个连接来说都是一样的，所以就适合用享元模式来处理，建一个工厂类，将上述类似属性作
为内部数据，其它的作为外部数据，在方法调用时，当做参数传进来，这样就节省了空间，减
少了实例的数量。
 * ClassName: ConnectionPool
 * Comment:
 * Time: 2018年8月26日 下午4:29:49
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class ConnectionPool {

	private Vector<Connection> pool;

	/* 公有属性 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/* 构造方法，做一些初始化工作 */
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 ,连接释放*/
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接，获取连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}
}