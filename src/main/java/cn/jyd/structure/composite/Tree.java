/**
 * Project Name:design
 * File Name:package-info.java
 * Package Name:cn.jyd.structure.composite
 * Date:2018年8月26日下午4:10:17
 * Copyright (c) 2018
 */
/**
 * ClassName: package-info
 * Comment:
 * Time: 2018年8月26日 下午4:10:17
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
package cn.jyd.structure.composite;

import java.util.Enumeration;
import java.util.Vector;
/**
 * 组合模式有时又叫 部分- 整体模式在处理类似树形结构的问题时比较方便
 * ClassName: Tree
 * Comment:
 * Time: 2018年8月26日 下午4:16:31
 * Author:localhost
 * @Version 
 * @Sylar JDK 1.8
 */
public class Tree {

	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");
	}
}

class TreeNode {

	private String name;
	private TreeNode parent;
	private Vector<TreeNode> children = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	// 添加孩子节点
	public void add(TreeNode node) {
		children.add(node);

	}

	// 删除孩子节点
	public void remove(TreeNode node) {
		children.remove(node);
	}

	// 取得孩子节点
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}
}
