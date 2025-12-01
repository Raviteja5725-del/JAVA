public class MenuSwitch {
    public static void main(String[] args) {
        int choice = 4;

        switch (choice) {
            case 1: System.out.println("Start Game"); break;
            case 2: System.out.println("Load Game"); break;
            case 3: System.out.println("Settings"); break;
            case 4: System.out.println("Exit"); break;
            default: System.out.println("Invalid Option");
        }
    }
}
