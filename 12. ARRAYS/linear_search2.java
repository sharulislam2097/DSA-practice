public class linear_search2 {

    // function to find the key from the array and return index
    public static int checkMenu(String menu[], String find) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == find) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String args[]) {
        String menu[] = { "Dosa", "Chola", "Nodles", "Burger", "pizza", "nachos" };
        String find = "pizza";

        int index = checkMenu(menu, find);
        if (index == -1) {
            System.out.println("Not found in menu");
        }

        System.out.println("Found at index: " + index);
    } 

}
