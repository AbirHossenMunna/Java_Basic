package StringManupulation;

public class purchasePrice {
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double laptop_price = Double.parseDouble(arr[1]);
        double discount = Double.parseDouble(arr[2]);
        double per =(laptop_price*discount)/100;
        double total=laptop_price - per;
        System.out.println("Total price " + total);
    }
}
