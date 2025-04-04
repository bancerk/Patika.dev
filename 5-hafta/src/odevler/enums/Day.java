package odevler.enums;

public enum Day {

    // Enum constants representing each day of the week,
    // each with its own workday start and end time (hour and minute)
    SUNDAY(9, 00, 17, 00),
    MONDAY(9, 00, 17, 00),
    TUESDAY(9, 00, 17, 00),
    WEDNESDAY(9, 00, 17, 00),
    THURSDAY(9, 00, 17, 00),
    FRIDAY(9, 00, 17, 00),
    SATURDAY(9, 00, 17, 00);

    // Fields for storing start and end times of workday
    private final int workDayStartHour;
    private final int workDayStartMinute;
    private final int workDayFinishHour;
    private final int workDayFinishMinute;

    // Constructor to assign time values to each enum constant
    Day(int workDayStartHour, int workDayStartMinute, int workDayFinishHour, int workDayFinishMinute){
        this.workDayStartHour = workDayStartHour;
        this.workDayStartMinute = workDayStartMinute;
        this.workDayFinishHour = workDayFinishHour;
        this.workDayFinishMinute = workDayFinishMinute;
    }

    // Getter for workday start hour
    public int getWorkDayStartHour() {
        return workDayStartHour;
    }

    // Getter for workday start minute
    public int getWorkDayStartMinute() {
        return workDayStartMinute;
    }

    // Getter for workday end hour
    public int getWorkDayFinishHour() {
        return workDayFinishHour;
    }

    // Getter for workday end minute
    public int getWorkDayFinishMinute() {
        return workDayFinishMinute;
    }
}
