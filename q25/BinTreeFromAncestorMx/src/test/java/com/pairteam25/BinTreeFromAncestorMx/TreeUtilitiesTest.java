/**
 * 
 */
package com.pairteam25.BinTreeFromAncestorMx;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Kishore
 *
 */
class TreeUtilitiesTest {
	
	TreeUtilities treeUtil;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		treeUtil = new TreeUtilities();
	}

	@Test
	void testBinaryTreeConstructionPositiveCase1() {
		//ARRANGE
      int[][] dummyMatrix =
      {
              { 0, 0, 0, 0, 0 },
              { 1, 0, 0, 0, 0 },
              { 0, 0, 0, 1, 0 },
              { 0, 0, 0, 0, 0 },
              { 1, 1, 1, 1, 0 }
      };
      Node rootNode = new Node(dummyMatrix.length);
      
      //ACT
      rootNode = treeUtil.constructTree(dummyMatrix);
      treeUtil.inorderTraversal(rootNode);
      //ASSERT
      Assertions.assertEquals("0-1-4-5-3-2-", treeUtil.displayTree());
      
	}

}
