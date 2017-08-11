package com.pojodo.tree.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojodo.tree.service.TreeService;

@RestController
public class TreeController {
	
	private final TreeService treeService;
	
	public TreeController(TreeService treeService) {
		this.treeService = treeService;
	}
	
	@RequestMapping("/tree/{hight}")
	public void printTree(@PathVariable int hight) {
		treeService.printTree(hight);
	}
}
