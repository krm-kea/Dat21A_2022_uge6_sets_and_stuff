package com.company;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CompareCountryBNP implements Comparator<Country>
{
    @Override
    public int compare(Country c1, Country c2)
    {
        if (c1.BNP < c2.BNP)
        {
            return -1;
        }
        else if (c1.BNP > c2.BNP)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public Comparator<Country> reversed()
    {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Country> thenComparing(Comparator<? super Country> other)
    {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Country> thenComparing(Function<? super Country, ? extends U> keyExtractor, Comparator<? super U> keyComparator)
    {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Country> thenComparing(Function<? super Country, ? extends U> keyExtractor)
    {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Country> thenComparingInt(ToIntFunction<? super Country> keyExtractor)
    {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Country> thenComparingLong(ToLongFunction<? super Country> keyExtractor)
    {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Country> thenComparingDouble(ToDoubleFunction<? super Country> keyExtractor)
    {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
