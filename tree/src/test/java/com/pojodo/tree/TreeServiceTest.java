package com.pojodo.tree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pojodo.tree.service.TreeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TreeServiceTest {
	
	@Autowired
	public TreeService treeService;
	
	@Test
	public void printTree_1() {
		String[] tree = treeService.printTree(1);
		assertTrue(tree.length == 1);
		System.out.println(tree[0].length());
		assertTrue(tree[0].length() == 3);
		assertTrue(tree[0].contains(" *"));
	}
	
	@Test
	public void printTree_2() {
		String[] tree = treeService.printTree(2);
		assertTrue(tree.length == 2);
		System.out.println(tree[0].length());
		assertTrue(tree[1].length() == 5);
		assertTrue(tree[1].contains("  ***"));
	}
	
	@Test
	public void printTree_7() {
		String[] tree = treeService.printTree(5);
		assertTrue(tree.length == 5);
		System.out.println(tree[0].length());
		assertTrue(tree[4].length() == 11);
		assertTrue(tree[4].contains("  *********"));
	}
}
