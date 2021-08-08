public class Main {
    static boolean win = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000);
        System.out.println(random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }

        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!win) {
                        int guessNumeber = (int) (Math.random() * 1000000);
                        if (guessNumeber == random) {
                            win = true;
                            System.out.println(guessNumeber);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        timer.start();
        player.start();


    }
}
