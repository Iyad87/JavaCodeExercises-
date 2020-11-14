package com.iyad.nodeRecursive;

public class Answer {

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> Node<T> findRecursive(Node<T> root, T findValue)
	{

        if(root.value == findValue)
			return root;

		Node left = findRecursive(root.left, findValue);
		Node right = findRecursive(root.right, findValue);

		if (left != null) {
			return left;
		}else {
			return right;
		}
	}
	}


