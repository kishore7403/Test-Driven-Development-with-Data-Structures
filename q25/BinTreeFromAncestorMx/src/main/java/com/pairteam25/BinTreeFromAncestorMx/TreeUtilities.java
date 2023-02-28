package com.pairteam25.BinTreeFromAncestorMx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class TreeUtilities {
	
	static String treeOutput="";    
	
	public static void inorderTraverse(Node node)    {        
		if (node != null)        {            
			inorderTraverse(node.leftChild);            
			treeOutput=treeOutput.concat(String.valueOf(node.key)+"-");            
			inorderTraverse(node.rightChild);        
			}    
		}
	
	public static String displayTree(){        
		return treeOutput;    
		}  
	
	public static void insertIntoMultiMap(Map<Integer, List<Integer>> map, Integer key, Integer value) {      
		map.putIfAbsent(key, new ArrayList<>());        
		map.get(key).add(value);   
		}    
	
	public static Node constructTree(boolean[][] ancestorBooleanMatrix)    {  
		
		int[][] ancestorMatrix = new int[ancestorBooleanMatrix.length][ancestorBooleanMatrix.length];
		
		for(int i =0; i< ancestorBooleanMatrix.length; i++) {
			for(int j=0; j<ancestorBooleanMatrix.length;j++) {
				
				if(ancestorBooleanMatrix[i][j]==true)
					ancestorMatrix[i][j] = 1;
				else
					ancestorMatrix[i][j]=0;
				
			}
		}

		
		Map<Integer, List<Integer>> multimap = new TreeMap<>();     
		for (int i = 0; i < ancestorMatrix.length; i++)        {        
			int sum = Arrays.stream(ancestorMatrix[i]).sum();          
			insertIntoMultiMap(multimap, sum, i);        
			}        
		
		Node[] node = new Node[ancestorMatrix.length];      
		int last = 0;        
		boolean[] parent = new boolean[ancestorMatrix.length];     
		for (Map.Entry<Integer, List<Integer>> entry: multimap.entrySet())        {   
			for (int row: entry.getValue()){                
				last = row;                
				node[row] = new Node(row);                
				if (entry.getKey() == 0) {                
					continue;               
					}                
				
				for (int i = 0; i < ancestorMatrix.length; i++){                    
					if (!parent[i] && ancestorMatrix[row][i] == 1) {                       
						if (node[row].leftChild == null) {                           
							node[row].leftChild = node[i];                       
							}                        
						else {                           
							node[row].rightChild = node[i];                        
							}                        
						parent[i] = true;                   
						}                
					}            
				}       
			}       
		return node[last];   
		}

}