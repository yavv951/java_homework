package src.main;

public class EnumMonth {

    public enum Month {

        January ("0"),
        February ("1"),
        March ("2"),
        April ("3"),
        May ("4"),
        June ("5"),
        July ("6"),
        August("7"),
        September("8"),
        October("9"),
        November("10"),
        December ("11");

        private String title;

        Month(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

}
