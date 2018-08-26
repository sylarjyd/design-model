package cn.jyd.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，
就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * ClassName: PrototypeS
 * Comment:
 * Time: 2018年8月26日 下午3:04:25
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class PrototypeS implements Cloneable, Serializable {

	/**
	 * serialVersionUID:TODO
	 * 
	 * @Sylar JDK 1.8
	 */
	private static final long serialVersionUID = 1L;

	private String string;
	private SerializableObject obj;

	/* 浅复制 */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/* 深复制 */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* 写入当前对象的二进制流 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* 读出二进制流产生的新对象 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

}

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 1L;
}