import java.util.*;

class ratInAMaze{
    public ArrayList<String> ratInMaze(int[][] maze){
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];

        if(maze[0][0] == 0) return ans;
        solve(0, 0, maze, n, "", visited, ans);
        Collections.sort(ans);
        return ans;
    }

    public void solve(int x, int y, int[][] maze, int n, String path, boolean[][] visited, ArrayList<String> ans){
        if(x == n - 1 && y == n - 1){
            ans.add(path);
            return;
        }

        visited[x][y] = true;

        //Move Down
        if(isSafe(x + 1, y, n, maze, visited)){
            solve(x + 1, y, maze, n, path + "D", visited, ans);
        }

        //Move Up
        if(isSafe(x - 1, y, n, maze, visited)){
            solve(x - 1, y, maze, n, path + "U", visited, ans);
        }
        
        //Move Right
        if(isSafe(x, y + 1, n, maze, visited)){
            solve(x, y + 1, maze, n, path + "R", visited, ans);
        }
        
        //Move Left
        if(isSafe(x, y - 1, n, maze, visited)){
            solve(x, y - 1, maze, n, path + "L", visited, ans);
        }
        
        visited[x][y] = false;

    }

    public boolean isSafe(int x, int y, int n, int[][] maze, boolean[][] visited){
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visited[x][y];
    }
}