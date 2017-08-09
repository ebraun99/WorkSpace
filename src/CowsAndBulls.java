import java.util.Random;

public class CowsAndBulls
{
    private String s="";
    private int cows;
    private int bulls;
    private int length;

    public CowsAndBulls(){}

    public CowsAndBulls(int length)
    {
        Random rn = new Random();

        this.length = length;
        for(int i=0;i<length;i++)
        {
            s+= rn.nextInt(10);
        }
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getBulls() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String hint(String guess)
    {
        setCows(0);
        setBulls(0);
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)==guess.charAt(i))
            {
                bulls++;
            }
            else if(s.indexOf(guess.charAt(i))>=0){
                cows++;
            }
        }
        return "Cows: " + getCows() + " - Bulls: " + getBulls();
    }

    public boolean win()
    {
        return getBulls() == getLength();
    }
}
