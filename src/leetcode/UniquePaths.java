package leetcode;

/**
 * 62. 不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

问总共有多少条不同的路径？
 * @author huangzhebin
 *
 */
public class UniquePaths {
	
	public int uniquePaths(int m, int n) {
		
		int[][] path = new int[m][n];
		for (int i = 0; i < m; i++)
			path[i][0] = 1;
		for (int j = 0; j < n; j++) 
			path[0][j] = 1;
		for (int i = 1; i < m; i++) {
			for (int j= 1; j < n; j++) 
				path[i][j] = path[i-1][j] + path[i][j-1];
		}
        return path[m-1][n-1];
	}

}
