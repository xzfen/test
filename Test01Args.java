public class Test01Args {
    public static void main(String[] args) {
        if(args.length < 3) {
            System.out.println("Usage: \"n1\" \"op\" \"n2\"");
            System.exit(-1);
        }

        double d1 = 0.0,d2 = 0.0;
        try {
            d1 = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        try {
            d2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //double d1 = Double.parseDouble(args[0]);
        //double d2 = Double.parseDouble(args[2]);
        double d = 0;

        if(args[1].equals("+")) d = d1 + d2;
        else if(args[1].equals("-")) d = d1 - d2;
        else if(args[1].equals("X")) d = d1 * d2;
        else if(args[1].equals("/")) d = d1 / d2;
        else {
            System.out.println("Error operator!");
            System.exit(-1);
        }

        System.out.println(d);
    }
}