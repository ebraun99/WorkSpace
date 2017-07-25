
public class Main
{

    public static void main(String[] args)
    {
        int[][] gameboard = new int[][]{
        {0, 1, 9, 1},
        {0, 1, 1, 1},
        {0, 0, 0, 0}
    };

            for(int i=0;i<gameboard.length;i++)
            {
                for(int j = 0;j<gameboard[i].length;j++)
                {
                    if(gameboard[i][j]==9)
                    {
                        if(i>0&&i<gameboard.length&&j>0&&j<gameboard[i].length)
                        {

                        }
                    }
                }
            }
    }
}
