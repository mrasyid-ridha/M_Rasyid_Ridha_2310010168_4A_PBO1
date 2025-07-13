import java.util.ArrayList;

public class Cafe {
    private ArrayList<OrderItem> pesanan = new ArrayList<>();

    public void tambahPesanan(MenuItem item, int jumlah) {
        pesanan.add(new OrderItem(item, jumlah));
    }

    public void cetakNota() {
        double total = 0;
        System.out.println("\n========== NOTA PEMESANAN ==========");
        for (OrderItem order : pesanan) {
            System.out.println(order.getItem().getNama() + " x " + order.getJumlah() + 
                " = Rp" + order.getSubtotal());
            total += order.getSubtotal();
        }
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR: Rp" + total);
        System.out.println("====================================");
    }
}
