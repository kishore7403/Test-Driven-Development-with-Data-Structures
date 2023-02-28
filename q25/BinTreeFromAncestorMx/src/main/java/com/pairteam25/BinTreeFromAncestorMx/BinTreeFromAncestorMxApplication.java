package com.pairteam25.BinTreeFromAncestorMx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BinTreeFromAncestorMxApplication {

	public static void main(String[] args) {
		

		boolean[][] ancestorMatrix = {                
				{ false, false, false, false, false, false }, 
				{ true, false, false, false, true, false },              
				{ false, false, false, true, false, false }, 
				{ false, false, false, false, false, false },           
				{ false, false, false, false, false, false }, 
				{ true, true, true, true, true, false }        
				};       
		Node root = TreeUtilities.constructTree(ancestorMatrix);       
		TreeUtilities.inorderTraverse(root);       
		System.out.println(TreeUtilities.displayTree());
		
		
		SpringApplication.run(BinTreeFromAncestorMxApplication.class, args);
	}

}
