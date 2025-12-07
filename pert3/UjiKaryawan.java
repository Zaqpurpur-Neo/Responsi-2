class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");

        // Buat objek Karyawan biasa (Budi)
		Karyawan karyawan = new Karyawan("Budi Santoso", 4500000);
		karyawan.tampilInfo();
        
        System.out.println(); // Baris baru/jarak

        // Buat objek Manajer (Siti)
        Manajer manajer = new Manajer("Siti Aminah", 6000000, 2500000); 
		manajer.tampilInfo();
    }
}
