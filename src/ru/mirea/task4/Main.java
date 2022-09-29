package ru.mirea.task4;

public class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.autumn;
        loveSeason(season);
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons + " - " + seasons.getDescription() + " , average temp: " + seasons.getTemperature());
        }
    }

    public enum Seasons {
        autumn(12.5),
        winter(-12.5),
        spring(13.0),
        summer(20.0) {
            public String getDescription() {
                return "Warm season";
            }
        };

        private final double temperature;

        private Seasons(double temperature) {
            this.temperature = temperature;
        }

        public String getDescription() {
            return "Cold season";
        }

        public double getTemperature() {
            return temperature;
        }

    }

    public static void loveSeason(Seasons input) {
        switch (input) {
            case autumn -> System.out.println("I love autumn");
            case spring -> System.out.println("I love spring");
            case summer -> System.out.println("I love summer");
            case winter -> System.out.println("I love winter");
        }
    }
}