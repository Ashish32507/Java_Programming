public class userExcep extends Exception {
    String[] names = {"Hari", "Siva", "Bhanu", "Rama", "Chandu"};
    int[] balances = {2500, 3500, 1500, 1000, 6000};

    userExcep() {
    }

    userExcep(String s) {
        super(s);
    }

    public static void main(String[] args) {
        try {
            userExcep us = new userExcep();
            System.out.println("Name\t" + "Balance");
            for (int i = 0; i < 5; i++) {
                System.out.println(us.names[i] + "\t" + us.balances[i]);
                if (us.balances[i] < 2000) {
                    userExcep me1 = new userExcep("Insufficient Balance");
                    throw me1;
                }
            }
        } catch (userExcep e) {
            // You should print the exception message using the getMessage() method
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}

