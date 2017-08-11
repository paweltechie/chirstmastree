package com.pojodo.tree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.pojodo.tree.service.TreeService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class TreeServiceTest {
	
	@Autowired
	public TreeService treeService;
	
	
	@Test
	public void printTree_0() {
		String[] tree = treeService.printTree(0);
		assertTrue(tree.length == 0);
	}
	
	@Test
	public void printTree_1() {
		String[] tree = treeService.printTree(1);
		assertTrue(tree.length == 1);
		assertTrue(tree[0].length() == 1);
		assertTrue(tree[0].contains("*"));
	}
	
	@Test
	public void printTree_2() {
		String[] tree = treeService.printTree(2);
		assertTrue(tree.length == 2);
		assertTrue(tree[1].length() == 3);
		assertTrue(tree[1].contains("***"));
	}
	
	@Test
	public void printTree_7() {
		String[] tree = treeService.printTree(5);
		assertTrue(tree.length == 5);
		assertTrue(tree[2].contains("  *****"));
		assertTrue(tree[4].length() == 9);
		assertTrue(tree[4].contains("*********"));
	}
}
