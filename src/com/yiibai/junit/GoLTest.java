package com.yiibai.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class GoLTest {
	GoL gol = new GoL();
	
	@Test
	public void testGetNeighbors(){
		int i = 0, j = 0;
		for(i=0;i<10;i++)
			for(j=0;j<10;j++){
				gol.table[i][j]=false;
			}
		gol.table[0][0]=true;
		gol.table[0][1]=true;
		gol.table[1][0]=true;
		gol.table[1][1]=true;
		
		gol.getNeighbors();
		int result1 = 0;
		
		for(i=0;i<10;i++)
			for(j=0;j<10;j++){
				result1 += gol.neighbors[i][j];
			}
		
		int result2 = 21;
		
		assertEquals(result1, result2);
	}
	public void testNextWorld(){
		int i = 0, j = 0;
		for(i=0;i<10;i++)
			for(j=0;j<10;j++){
				gol.table[i][j]=false;
			}
		gol.table[0][0]=true;
		gol.table[0][1]=true;
		gol.table[1][0]=true;
		gol.table[1][1]=true;
		
		gol.getNeighbors();
		gol.nextWorld();
		int result = 0;//用来判断结果和意想是否相同
		
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(i==0&&j==0){
					if(gol.table[i][j]==false)result = 1;
				}					
				else if(i==0&&j==1){
					if(gol.table[i][j]==false)result = 1;
				}					
				else if(i==1&&j==0){
					if(gol.table[i][j]==false)result = 1;
				}
				else if(i==1&&j==1){
					if(gol.table[i][j]==false)result = 1;
				}
				else{
					if(gol.table[i][j]==true)result = 1;
				}
			}
		}
		
		assertEquals(result, 0);
	}
	
}
