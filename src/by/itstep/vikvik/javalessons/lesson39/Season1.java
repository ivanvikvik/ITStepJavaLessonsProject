package by.itstep.vikvik.javalessons.lesson39;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,
}

enum Killer {
    KILLER;

    public void kill(){

    }

    public void clear(){

    }
}

class A {
    public static void main(String[] args) {
        Killer k1 = Killer.KILLER;
        Killer k2 = Killer.KILLER;
        Killer k3 = Killer.KILLER;
        Killer k4 = Killer.KILLER;
    }
}

enum Season {
    WINTER("Winter", 1),

    public final String name;
    public final int order;

//    Season(){
//        name = "Autumn";
//        order = 4;
//    }

    Season(String name, int order) {
        this.name = name;
        this.order = order;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getOrder() {
//        return order;
//    }

    @Override
    public String toString() {
        return name + " (" + order + ")";
    }
}
