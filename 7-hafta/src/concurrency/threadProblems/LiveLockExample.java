package concurrency.threadProblems;

public class LiveLockExample {

    public static void main(String[] args) {

        Diner alice = new Diner("Alice");
        Diner bob = new Diner("Bob");
        Spoon spoon = new Spoon(alice);

        new Thread(() -> alice.eatWith(spoon, bob)).start();

        new Thread(() -> bob.eatWith(spoon, alice)).start();

    }

    static class Spoon {
        private Diner owner;

        public Spoon(Diner owner) {
            this.owner = owner;
        }

        public Diner getOwner() {
            return owner;
        }

        public synchronized void setOwner(Diner diner) {
            this.owner = diner;
        }

        public synchronized void use() {
            System.out.println(owner.name + " is eating...");
        }

    }

    static class Diner {
        private String name;
        private boolean isHungry = true;

        public Diner(String name) {
            this.name = name;
        }

        public void eatWith(Spoon spoon, Diner friend) {
            while (isHungry) {
                if (spoon.getOwner() != this) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    continue;
                }

                if (friend.isHungry) {
                    System.out.println(name + ": You eat first, " + friend.name);
                    spoon.setOwner(friend);
                    continue;
                }

                spoon.use();
                isHungry = false;
                System.out.println(name + " is done eating.");
            }
        }
    }
}
