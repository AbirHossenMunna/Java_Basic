package StringManupulation;

public class countPrice {
    public static void main(String[] args) {
        String str = "The price of this shirt is 1200 tk and Sare is 3500 Tk and Discount 400";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double shirt_price = Double.parseDouble(arr[0]);
        double sare=Double.parseDouble(arr[1]);
        double discount = Double.parseDouble(arr[2]);
        double sum = shirt_price*2 + sare;
        double total=sum-discount;
        System.out.println("Total price " + total);
    }

}

