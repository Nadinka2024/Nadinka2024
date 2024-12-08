package com.test.studies.controller;

public enum DayOfWeek {
    MONDAY("Monday", "Понедельник"),
    TUESDAY("Tuesday", "Вторник"),
    WEDNESDAY("Wednesday", "Среда"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "Пятница"),
    SATURDAY("Saturday", "Суббота"),
    SUNDAY("Sunday", "Воскресенье");

    private final String englishName;
    private final String russianName;

    DayOfWeek(String englishName, String russianName) {
        this.englishName = englishName;
        this.russianName = russianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRussianByEnglish(String englishName) {
        for (DayOfWeek day : values()) {
            if (day.getEnglishName().equalsIgnoreCase(englishName)) {
                return day.getRussianName();
            }
        }
        throw new IllegalArgumentException("Invalid day of the week: " + englishName);
    }
}

