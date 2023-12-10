
 // Hazirlayan: Emre Çalışkan Öğr.No: 5210505064
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonKontr extends JButton {
    // Değişkenler tanımlandı
    private String apiUcNoktası;
    private Color aktifRenk;
    private Color pasifRenk;
    private boolean aktifDurum;

    public ButonKontr(String metin) {
        // Değişkenlere atamalar bu bölümde yapıldı.
        super(metin);
        this.apiUcNoktası = "";
        this.aktifRenk = Color.black;
        this.pasifRenk = Color.white;
        this.aktifDurum = false;

        setPasifDurum();
        addActionListener(new ButonTikla());
    }

    public void setApiUcNoktası(String ucNoktası) {
        this.apiUcNoktası = ucNoktası;
    }

    // Butonların aktif olduğundaki rengi burada seçildi
    public void setAktifRenk(Color renk) {
        this.aktifRenk = renk;
    }

    // Butonların Pasif olduğundaki rengi burada seçildi
    public void setPasifRenk(Color renk) {
        this.pasifRenk = renk;
    }

    // Butonlar pasif olduğunda rengi ve yazısı değişiyor
    private void setPasifDurum() {
        setBackground(pasifRenk);
        setText("Pasif");
        aktifDurum = false;
    }

    // Butonların aktif olduğunda rengi ve yazısı değişiyor
    private void setAktifDurum() {
        setBackground(aktifRenk);
        setText("Aktif");
        aktifDurum = true;
    }

    private class ButonTikla implements ActionListener {
        // Butonlara tıklandığında;
        // eğer buton aaktif değil ise butonu pasif hale,
        // Eğer Buton aktif ise butonu aktif hale getirecek ve...
        // Ekrana  "Calisiyor " yazdırılacak
        @Override
        public void actionPerformed(ActionEvent e) {
            if (aktifDurum) {
                setPasifDurumTumButonlarHaric();
                aktifDurum = false;
            } else {
                setAktifDurum();
                aktifDurum = true;
                // Tıklandığında (aktif olduğunda) Calisiyor yazacak.
                System.out.println("Calisiyor: " + apiUcNoktası);
            }
        }
    }

    private void setPasifDurumTumButonlarHaric() {
        for (Component bileşen : getParent().getComponents()) {
            if (bileşen instanceof ButonKontr) {
                ButonKontr Buton = (ButonKontr) bileşen;
                if (Buton != this) {
                    Buton.setPasifDurum();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Kutular oluşturuldu
        SwingUtilities.invokeLater(() -> {
            JFrame pencere = new JFrame("Buton Kontrol Paneli Uygulaması.");
            pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pencere.setLayout(new GridLayout(4, 4, 10, 10));

            ButonKontr[] Buton = new ButonKontr[16];
            // For döngüsü ile tıklanan Butona link ataması yapıldı
            for (int i = 0; i < 16; i++) {
                Buton[i] = new ButonKontr(" Buton" + (i + 1));
                pencere.add(Buton[i]);
                Buton[i].setApiUcNoktası("https://api.example.com/graphql");
            }

            pencere.setSize(400, 400);
            pencere.setVisible(true);
        });
    }
}