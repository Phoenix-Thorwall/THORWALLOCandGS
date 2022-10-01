public class Point
{
    //Instance Variables

    private int x;
    private int y;

    //Constructor That Accepts Both Instance Variables

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Point Constructor That Accepts 1 Value

    public Point(int coord)
    {
        x = coord;
        y = coord;
    }

    //Point Constructor That Has NO Parameters

    public Point()
    {
        x = 0;
        y = 0;
    }

    //They Always Say "Getter" (Pronounced Get Her) But What About "Get Him" :(

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    //Setters!

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    //Method That Returns X & Y Values

    public String formCoordinate()
    {
        return "(" + x + ", " + y + ")";
    }

    //Method That Identifies Quadrant of Coordinate

    public String identifyQuad()
    {
        if (x > 0 && y > 0)
        {
            return "I";
        }
        else if (x < 0 && y > 0)
        {
            return "II";
        }
        else if (x < 0 && y < 0)
        {
            return "III";
        }
        else if (x > 0 && y < 0)
        {
            return "IV";
        }
        else if (x == 0 && y == 0)
        {
            return "Origin";
        }
        else if (x == 0 && y != 0 || x != 0 && y == 0)
        {
            return "On an axis";
        }
        return null;
    }


}
