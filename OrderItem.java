public class OrderItem {
    private MenuItem item;
    private int jumlah;

    public OrderItem(MenuItem item, int jumlah) {
        this.item = item;
        this.jumlah = jumlah;
    }

    public MenuItem getItem() {
        return item;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        return item.getHarga() * jumlah;
    }
}

