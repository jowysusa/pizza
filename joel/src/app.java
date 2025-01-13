public class app {
    public static void main(String[] args) {
        // joel
        pizza pizza1 = new pizza("margarita", "mediana");
        pizza pizza2 = new pizza("cuatro quesos", "familiar");
        pizza pizza3 = new pizza("funghi", "mediana");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        pizza1.servirPizza();
        pizza1.servirPizza();
        pizza2.modificarTamanyo();
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

    }
}
