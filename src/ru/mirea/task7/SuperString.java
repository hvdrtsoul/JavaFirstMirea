package ru.mirea.task7;

public class SuperString implements StringWorker{

    public String value;

    @Override
    public int countSymbols() {
        return value.length();
    }

    @Override
    public String getUnevenSymbols() {
        String result = "";

        for(int i = 0;i < value.length();++i)
        {
            if(i % 2 == 1)
                result += value.charAt(i);
        }

        return result;
    }

    @Override
    public String reverseString() {
        String result = "";

        for(int i = 0;i < value.length();++i){
            result = value.charAt(i) + result;
        }

        return result;
    }
}
