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
	void testBinaryTreeConstructionPositiveCase1() throws Exception {
		//ARRANGE
		boolean[][] dummyMatrix = {
				{ false, false, false, false, false, false },
                { true, false, false, false, true, false },
                { false, false, false, true, false, false },
                { false, false, false, false, false, false },
                { false, false, false, false, false, false },
                { true, true, true, true, true, false }
        };
		
      Node rootNode = new Node(dummyMatrix.length);
      
      //ACT
      rootNode = treeUtil.constructTree(dummyMatrix);
      treeUtil.inorderTraverse(rootNode);
      //ASSERT
      Assertions.assertEquals("0-1-4-5-3-2-", treeUtil.displayTree());
      
	}
	@Test
	void testBinaryTreeConstructionInvalidTestCaseCase1() throws Exception {
		//ARRANGE
		boolean[][] dummyMatrix = {
				{ false, false, false, false, false, false },
                { false, false, false, false, false, false },
                { false, false, false, false, false, false },
                { false, false, false, false, false, false },
                { false, false, false, false, false, false },
                { false, false, false, false, false, false }
        };
      Node rootNode = new Node(dummyMatrix.length);
      
  
      //ACT AND ASSERT
      Assertions.assertThrows(Exception.class, ()->{ treeUtil.constructTree(dummyMatrix);});
      
	}
  @Test
	void testBinaryTreeConstructionInvalidTestCase2() throws Exception {
		//ARRANGE
		boolean[][] dummyMatrix = {};
		Node rootNode = new Node(dummyMatrix.length);
      
  
      //ACT AND ASSERT
      Assertions.assertThrows(Exception.class, ()->{ treeUtil.constructTree(dummyMatrix);});
      
	}
  @Test
	void testBinaryTreeConstructionInvalidTestCase3() throws Exception {
		//ARRANGE
		boolean[][] dummyMatrix = null;
		Node rootNode = new Node(0);
    

    //ACT AND ASSERT
    Assertions.assertThrows(Exception.class, ()->{ treeUtil.constructTree(dummyMatrix);});
    
	}
  @Test
	void testBinaryTreeConstructionInvalidTestCase4() throws Exception {
		//ARRANGE
	  boolean[][] dummyMatrix = {
			{ true, false, false, false, false, false },
            { false, true, false, false, false, false },
            { false, false, true, false, false, false },
            { false, false, false, true, false, false },
            { false, false, false, false, true, false },
            { false, false, false, false, false, true }
    };
		Node rootNode = new Node(dummyMatrix.length);
   

   //ACT AND ASSERT
   Assertions.assertThrows(Exception.class, ()->{ treeUtil.constructTree(dummyMatrix);});
   
	}
  void testBinaryTreeConstructionInvalidCase5() throws Exception {
		//ARRANGE
		boolean[][] dummyMatrix = {
			  { false, true, false, false, false, false },
              { true, false, false, false, true, false },
              { false, false, false, true, false, false },
              { false, false, false, false, false, false },
              { false, false, false, false, false, false },
              { true, true, true, true, true, false }
      };
		
    Node rootNode = new Node(dummyMatrix.length);
   
    //ASSERT
    Assertions.assertThrows(Exception.class, ()->{ treeUtil.constructTree(dummyMatrix);});
    
    
	}

}
