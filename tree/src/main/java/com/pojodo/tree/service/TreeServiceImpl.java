package com.pojodo.tree.service;

import org.springframework.stereotype.Component;

@Component
public class TreeServiceImpl implements TreeService {

	@Override
	public String[] printTree(int hight) {
		String[] tree = new String[hight];
		String space = " ";
		String leaf = "*";
		int fill = hight;
		int hightInt = hight;
		StringBuffer treeBuffer = new StringBuffer();
		for (int i=0; i<hightInt; i++) {
			for (int z = 0; z <= fill; z++)
				treeBuffer.append(space);
			for (int z = 0; z <= i; z++)
				treeBuffer.append(leaf);
			if (i > 0)
				for (int z = 1; z <= i; z++)
					treeBuffer.append(leaf);
			fill--;
			System.out.println(treeBuffer.toString());
			tree[i] = treeBuffer.toString();
			treeBuffer = new StringBuffer();
		}
		return tree;
	}
}
