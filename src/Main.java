public class Main {
    public static void main(String[] args) {
        double val = Double.parseDouble(args[0]);
        for (int i = 1; i < args.length; i+=2) {
            switch (args[i]){
                case "+" :
                    val = val + Double.parseDouble(args[i+1]);
                    break;
                case "-" :
                    val = val - Double.parseDouble(args[i+1]);
                    break;
                case "*" :
                    val = val * Double.parseDouble(args[i+1]);
                    break;
                case "/" :
                    val = val / Double.parseDouble(args[i+1]);
                    break;
            }
        }
        System.out.println(val);
    }
}