package string.class_problems;

public class Main {
    public static void main(String[] args) {

        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
        System.out.println("PiggyBank savings: " + pb.getSavings());

        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("Score: " + sc.getScore());

        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("Nickname: " + tag.getNickname());

        Locker locker = new Locker(101, "1234");
        locker.changeCode("1234", "5678");
        locker.changeCode("0000", "9999");
        System.out.println("Locker code changed successfully");

        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));

        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("Health: " + c.getHealth());
        c.heal(50);
        System.out.println("Health after healing: " + c.getHealth());
        c.takeDamage(150);
        System.out.println("Health after extra damage: " + c.getHealth());

        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println("First song: " + p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());

        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println("Password strength: " + pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println("Password strength: " + pc2.getStrength());

        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("Color: " + t.getColor());
        t.next();
        System.out.println("Color: " + t.getColor());
        t.next();
        System.out.println("Color: " + t.getColor());
        t.next();
        System.out.println("Color: " + t.getColor());

        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println("Cart total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}