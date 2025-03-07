package javacodes;

    class blue {
         void run() {
            System.out.println("running");
        }

    }

    class Honda extends blue {
        void run() {
            System.out.println("Running safety with 100 kmph");
        }

        public class bike {
            public static void main(String[] args) {

                Honda h=new Honda();
                h.run();
            }

        }
    }




