public Interface Adjustable {
    void setLevel(int level);
    int getLevel();

    default void increase(int delta) {
        setLevel(Math.min(100, getLevel() + delta));
    }

    default void decrease(int delta) {
        setLevel(Math.max(0, getLevel() - delta));
    }   
}


class Fan implements Adjustable {
    private int speedLevel;

    @Override
    public void setLevel(int level) {
        this.speedLevel = level;
        System.out.println("Fan speed set to: " + speedLevel);
    }

    @Override
    public int getLevel() {
        return speedLevel;
    }
}             vo