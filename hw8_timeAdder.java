import java.util.Arrays;

public class hw8_timeAdder {

    static String[] labels = { "seconds", "minutes", "hours", "days", "second", "minute", "hour, day" };

    public static String[] addTime(int value1, String label1, int value2, String label2) {
        int value = 0;
        String label = "";

        // seconds * seconds (1)
        if (label1 == "seconds" && value1 != 1 && label2 == "seconds" && value2 != 1) {
            value = value1 + value2;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "minute";
                else
                    label = "minutes";
            }
        }

        // second * second (2)
        else if (label1 == "seconds" && value1 == 1 && label2 == "second" && value2 == 1) {
            value = value1 + value2;
            label = "seconds";
        }

        // second * seconds (3)
        else if (label1 == "seconds" && value1 == 1 && label2 == "seconds" && value2 != 1) {
            value = value1 + value2;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "minute";
                else
                    label = "minutes";
            }
        }

        // seconds * second (4)
        else if (label1 == "seconds" && value1 != 1 && label2 == "second" && value2 == 1) {
            value = value1 + value2;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "minute";
                else
                    label = "minutes";
            }
        }

        // Minutes * Minutes (5)
        else if (label1 == "minutes" && value1 != 1 && label2 == "minutes" && value2 != 1) {
            value = value1 + value2;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "hour";
                else
                    label = "hours";
            }
        }

        // Minute * Minute (6)
        else if (label1 == "minute" && value1 == 1 && label2 == "minute" && value2 == 1) {
            value = value1 + value2;
            label = "minutes";
        }

        // minutes * minute (7)
        else if (label1 == "minutes" && value1 != 1 && label2 == "minute" && value2 == 1) {
            value = value1 + value2;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "hour";
                else
                    label = "hours";
            }
        }

        // minute * minutes (8)
        else if (label1 == "minute" && value1 == 1 && label2 == "minutes" && value2 != 1) {
            value = value1 + value2;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                if (value == 1)
                    label = "hour";
                else
                    label = "hours";
            }
        }

        // hours * hours (9)
        else if (label1 == "hours" && value1 != 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                if (value == 1)
                    label = "day";
                else
                    label = "days";
            }
        }

        // hour * hour (10)
        else if (label1 == "hour" && value1 == 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2;
            label = "hours";
        }

        // hour * hours (11)
        else if (label1 == "hour" && value1 == 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                if (value == 1)
                    label = "day";
                else
                    label = "days";
            }
        }

        // hours * hour (12)
        else if (label1 == "hours" && value1 != 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                if (value == 1)
                    label = "day";
                else
                    label = "days";
            }
        }

        // days * days (13)
        else if (label1 == "days" && value1 != 1 && label2 == "days" && value1 != 1) {
            value = value1 + value2;
            label = "days";
            if (value % 365 == 0) {
                value = value / 365;
                if (value == 1)
                    label = "year";
                else
                    label = "years";
            }
        }

        // day * day (14)
        else if (label1 == "day" && value1 == 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2;
            label = "days";
        }

        // days * day (15)
        else if (label1 == "days" && value1 != 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2;
            label = "days";
            if (value % 365 == 0) {
                value = value / 365;
                if (value == 1)
                    label = "year";
                else
                    label = "years";
            }
        }

        // day * days (16)
        else if (label1 == "day" && value1 == 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2;
            label = "days";
            if (value % 365 == 0) {
                value = value / 365;
                if (value == 1)
                    label = "year";
                else
                    label = "years";
            }
        }

        // second * minute (17)
        else if (label1 == "second" && value1 == 1 && label2 == "minute" && value2 == 1) {
            value = value1 + value2 * 60;
            label = "seconds";
        }

        // minute * second (18)
        else if (label1 == "minute" && value1 == 1 && label2 == "second" && value2 == 1) {
            value = value1 * 60 + value2;
            label = "seconds";
        }

        // seconds * minute (19)
        else if (label1 == "seconds" && value1 != 1 && label2 == "minute" && value2 == 1) {
            value = value1 + value2 * 60;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                label = "minutes";
            }
        }

        // minute * seconds (20)
        else if (label1 == "minute" && value1 == 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 60 + value2;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                label = "minutes";
            }
        }

        // minutes * second (21)
        else if (label1 == "minutes" && value1 != 1 && label2 == "second" && value2 == 1) {
            value = value1 * 60 + value2;
            label = "seconds";
        }

        // second * minutes (22)
        else if (label1 == "second" && value1 == 1 && label2 == "minutes" && value2 != 1) {
            value = value1 + value2 * 60;
            label = "seconds";
        }

        // seconds * minutes (23)
        else if (label1 == "seconds" && value1 != 1 && label2 == "minutes" && value2 != 1) {
            value = value1 + value2 * 60;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                label = "minutes";
            }
        }

        // minutes * seconds (24)
        else if (label1 == "minutes" && value1 != 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 60 + value2;
            label = "seconds";
            if (value % 60 == 0) {
                value = value / 60;
                label = "minutes";
            }
        }

        // minute * hour (25)
        else if (label1 == "minute" && value1 == 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2 * 60;
            label = "minutes";
        }

        // hour * minute (26)
        else if (label1 == "hour" && value1 == 1 && label2 == "minute" && value2 == 1) {
            value = value1 * 60 + value2;
            label = "seconds";
        }

        // minutes * hour (27)
        else if (label1 == "minutes" && value1 != 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2 * 60;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                label = "hours";
            }
        }

        // hour * minutes (28)
        else if (label1 == "hour" && value1 == 1 && label2 == "minutes" && value2 != 1) {
            value = value1 * 60 + value2;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                label = "hours";
            }
        }

        // minute * hours (29)
        else if (label1 == "minute" && value1 == 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2 * 60;
            label = "minutes";
        }

        // hours * minute (30)
        else if (label1 == "hours" && value1 != 1 && label2 == "minute" && value2 == 1) {
            value = value1 * 60 + value2;
            label = "minutes";
        }

        // minutes * hours (31)
        else if (label1 == "minutes" && value1 != 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2 * 60;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                label = "hours";
            }
        }

        // hours * minutes (32)
        else if (label1 == "hours" && value1 != 1 && label2 == "minutes" && value1 != 1) {
            value = value1 * 60 + value2;
            label = "minutes";
            if (value % 60 == 0) {
                value = value / 60;
                label = "hours";
            }
        }

        // hour * day (33)
        else if (label1 == "hour" && value1 == 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2 * 24;
            label = "hours";
        }

        // day * hour (34)
        else if (label1 == "day" && value1 == 1 && label2 == "hour" && value2 == 1) {
            value = value1 * 24 + value2;
            label = "hours";
        }

        // hours * day (35)
        else if (label1 == "hours" && value1 != 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2 * 24;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                label = "days";
            }
        }

        // day * hours (36)
        else if (label1 == "day" && value1 == 1 && label2 == "hours" && value2 != 1) {
            value = value1 * 24 + value2;
            label = "minutes";
            if (value % 24 == 0) {
                value = value / 24;
                label = "days";
            }
        }

        // hour * days (37)
        else if (label1 == "hour" && value1 == 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 24;
            label = "hours";
        }

        // days * hour (38)
        else if (label1 == "days" && value1 != 1 && label2 == "hour" && value2 == 1) {
            value = value1 * 24 + value2;
            label = "hours";
        }

        // hours * days (39)
        else if (label1 == "hours" && value1 != 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 24;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                label = "days";
            }
        }

        // days * hours (40)
        else if (label1 == "days" && value1 != 1 && label2 == "hours" && value2 != 1) {
            value = value1 * 24 + value2;
            label = "hours";
            if (value % 24 == 0) {
                value = value / 24;
                label = "days";
            }
        }

        // hour * second (41)
        else if (label1 == "hour" && value1 == 1 && label2 == "sceond" && value2 == 1) {
            value = value1 * 3600 + value2;
            label = "seconds";
        }

        // second * hour (42)
        else if (label1 == "second" && value1 == 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2 * 3600;
            label = "seconds";
        }

        // seconds * hours (43)
        else if (label1 == "seconds" && value1 != 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2 * 3600;
            label = "seconds";
        }

        // hours * seconds (44)
        else if (label1 == "hours" && value1 != 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 3600 + value2;
            label = "seconds";
        }

        // seconds * hour (45)
        else if (label1 == "seconds" && value1 != 1 && label2 == "hour" && value2 == 1) {
            value = value1 + value2 * 3600;
            label = "seconds";
            if (value % 3600 == 0) {
                value = value / 3600;
                label = "hours";
            }
        }

        // hour * seconds (46)
        else if (label1 == "hour" && value1 == 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 3600 + value2;
            label = "seconds";
            if (value % 3600 == 0) {
                value = value / 3600;
                label = "hours";
            }
        }

        // hours * second (47)
        else if (label1 == "hours" && value1 != 1 && label2 == "second" && value2 == 1) {
            value = value1 * 3600 + value2;
            label = "seconds";
        }

        // second * hours (48)
        else if (label1 == "second" && value1 == 1 && label2 == "hours" && value2 != 1) {
            value = value1 + value2 * 3600;
            label = "seconds";
        }

        // second * day (49)
        else if (label1 == "second" && value1 == 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2 * 3600 * 24;
            label = "seconds";
        }

        // day * second (50)
        else if (label1 == "day" && value1 == 1 && label2 == "second" && value2 == 1) {
            value = value1 * 3600 * 24 + value2;
            label = "seconds";
        }

        // day * seconds (51)
        else if (label1 == "day" && value1 == 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 3600 * 24 + value2;
            label = "seconds";
            if (value % 86400 == 0) {
                value = value / 86400;
                label = "days";
            }
        }

        // seconds * day (52)
        else if (label1 == "seconds" && value1 != 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2 * 3600 * 24;
            label = "seconds";
            if (value % 86400 == 0) {
                value = value / 86400;
                label = "days";
            }
        }

        // days * second (53)
        else if (label1 == "days" && value1 != 1 && label2 == "second" && value2 == 1) {
            value = value1 * 3600 * 24 + value2;
            label = "seconds";
        }

        // second * days (54)
        else if (label1 == "second" && value1 == 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 3600 * 24;
            label = "seconds";
        }

        // days * seconds (55)
        else if (label1 == "days" && value1 != 1 && label2 == "seconds" && value2 != 1) {
            value = value1 * 3600 * 24 + value2;
            label = "seconds";
            if (value % 86400 == 0) {
                value = value / 86400;
                label = "days";
            }
        }

        // seconds * days (56)
        else if (label1 == "seconds" && value1 != 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 3600 * 24;
            label = "seconds";
            if (value % 86400 == 0) {
                value = value / 86400;
                label = "days";
            }
        }

        // day * minute (57)
        else if (label1 == "day" && value1 == 1 && label2 == "minute" && value2 == 1) {
            value = value1 * 60 * 24 + value2;
            label = "minutes";
        }

        // minute * day (58)
        else if (label1 == "day" && value1 == 1 && label2 == "minute" && value2 == 1) {
            value = value1 + value2 * 60 * 24;
            label = "minutes";
        }

        // days * minute (59)
        else if (label1 == "days" && value1 != 1 && label2 == "minute" && value2 == 1) {
            value = value1 * 60 * 24 + value2;
            label = "minutes";
        }

        // minute * days (60)
        else if (label1 == "minute" && value1 == 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 24 * 60;
            label = "minutes";
        }

        // day * minutes (61)
        else if (label1 == "day" && value1 == 1 && label2 == "minutes" && value2 != 1) {
            value = value1 * 60 * 24 + value2;
            label = "minutes";
            if (value % 1440 == 0) {
                value = value / 1440;
                label = "days";
            }
        }

        // minutes * day (62)
        else if (label1 == "minutes" && value1 != 1 && label2 == "day" && value2 == 1) {
            value = value1 + value2 * 60 * 24;
            label = "minutes";
            if (value % 1440 == 0) {
                value = value / 1440;
                label = "days";
            }
        }

        // minutes * days (63)
        else if (label1 == "minutes" && value1 != 1 && label2 == "days" && value2 != 1) {
            value = value1 + value2 * 24 * 60;
            label = "minutes";
            if (value % 1440 == 0) {
                value = value / 1440;
                label = "days";
            }
        }

        // days * minutes (64)
        else if (label1 == "days" && value1 != 1 && label2 == "minutes" && value2 != 1) {
            value = value1 * 60 * 24 + value2;
            label = "minutes";
            if (value % 1440 == 0) {
                value = value / 1440;
                label = "days";
            }
        }

        // any other case
        else {
            value = 0;
            label = "0";
        }

        // end of cases

        String finalValue = Integer.toString(value);
        String finalResult[] = { finalValue, label };
        return (finalResult);
    }

    private static boolean contains(String[] labels, String label2) {
        for (int i = 0; i < labels.length; i++) {
            if (labels[i] == label2)
                return true;
        }
        return false;
    }

    public static void affichage(String[] res) {
        if (res[0] != "0" && res[1] != "0") {
            System.out.println(Arrays.toString(res));
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        affichage(addTime(7, "hours", 20, "minutes"));
        affichage(addTime(1, "hours", 20, "minutes"));
        affichage(addTime(50, "hours", 22, "hours"));
        affichage(addTime(2, "days", 22, "hours"));
        affichage(addTime(0, "hours", 22, "hours"));
        affichage(addTime(1, "day", 25, "minutes"));
    }
}
