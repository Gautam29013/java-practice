public class ClassOuter {
    static int outer_x = 10;

    int outer_y = 20;

    private static int outer_private = 30;

    static class staticnestedclass {
        void display()

        {
            System.out.println("outer_x = " + outer_x);

            System.out.println("");
        }
    }
}
