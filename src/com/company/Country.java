package com.company;

public class Country implements Comparable<Country>
{
    String name;
    int size;
    int BNP;
    float latitude;  //latitude of the Capital City

    public Country(String n, int s, int bnp, float lat)
    {
        name = n;
        size = s;
        BNP = bnp;
        latitude = lat;
    }



    public String toString()
    {
        return ("{" + name + ";" + size + ";" + BNP + ";" + latitude + "}");
    }

    @Override
    public int compareTo(Country o)
    {
        if (size < o.size)
        {
            return -1;
        }
        else if (size > o.size)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
