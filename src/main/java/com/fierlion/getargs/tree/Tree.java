package com.fierlion.getargs;


public class Tree {
    public TreeNode root;

    public Tree(Integer data) {
        this.root = new TreeNode(data);
    }

    public TreeNode add(TreeNode source, Integer data) {
        if (null == source) {
            source = new TreeNode(data);
            return source;
        }
        if (data == source.data) {
            return source;
        } else if (data > source.data) {
            return add(source.rc, data);
        } else {
            return add(source.lc, data);
        }
    }
}
