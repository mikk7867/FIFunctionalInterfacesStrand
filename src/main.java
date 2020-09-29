import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<movie> watchlist = new ArrayList<>();
        watchlist.add(new movie("Iron Man", 2008, 126));
        watchlist.add(new movie("Baywatch", 2017, 121));
        watchlist.add(new movie("Spirited Away", 2001, 125));
        watchlist.add(new movie("Kiki's Delivery Service", 1989, 103));

        ZeroArgument t0 = () -> true;{
            System.out.println(t0.test());
        }
        OneArgument<Boolean> t1 = (t) -> true;{
            System.out.println(t1.test(true));
        }
        TwoArguments<Integer, Integer> t2 = Integer::compare;{
            System.out.println((t2.test(3,2)));
        }
    }
}