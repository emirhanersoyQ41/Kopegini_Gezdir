package code.with.cal.kopeginigezdir4111

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import code.with.cal.kopeginigezdir4111.databinding.ActivityMainBinding
import code.with.cal.kopeginigezdir4111.databinding.CardCellBinding

class MainActivity : AppCompatActivity(),BookClickListener
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        populateBooks()
        val mainActivity=this
        binding.recyclerView.apply {
            layoutManager=GridLayoutManager(applicationContext,3)
            adapter=CardAdapter(bookList,mainActivity)
        }




        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun populateBooks()  {
        val book1 = Book(
            R.drawable.antalya,
            "likya yolu antalya",
            "Trans Kaçkar",
            "Karadeniz’in yemyeşil yaylalarında doğa yürüyüşü yapmak isteyenler için en iyi rotalardan biri Trans Kaçkar yani Kaçkar Dağları trekking parkuru. Dünyanın bitki örtüsü açısından en zengin yerlerinden biri olmasının yanı sıra kayalıkların içine gizlenmiş manastır ve kaleleri, buz gölleri her mevsim yeşil ormanlarıyla bölgeyi yürüyerek gezen herkesi büyülüyor. Yaklaşık 4 bin metre yüksekliğe uzanan parkur Hopa’dan başlayıp; Artvin, Yusufeli, Barhal, Amanesket Yaylası, Karagöl, Satibe Sırtı, Olgunlar Yaylası, Nastaf Yaylası ve Dilberdüzü Ana Kamp alanından Kaçkar Dağları’nın zirvesine uzanıyor."
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.efesantikkenti,
            "doğa yürüyüş alanı ",
            "Efes Antik Kenti",
            "Ege’nin tarihi, doğal ve kültürel güzelliklerini gözler önüne seren 709 km uzunluğundaki Efes-Mimas Yolu her adımında etkileyici deneyimlerle dolu. Efes Antik Kenti, Selçuk‘tan başlayan ve tarihteki adı Mimas olan Karaburun‘da sona eren rota Karaburun, Çeşme, Urla, Seferihisar, Güzelbahçe, Menderes ve Selçuk ilçelerini kapsıyor. Güzergâh üzerinde İyonya Uygarlığı’na ait 6 antik kent yer alıyor. Ephesus (Efes-Selçuk), Kolophon (Değirmendere-Menderes), Lebedos (Ürkmez-Seferihisar), Teos (Sığacık-Seferihisar), Klazomenai (İskele-Urla), Erythrai (Ildırı-Çeşme) ve Phokaia (Foça).\n" +
                    "\n" +
                    "Hemen ekleyelim Phokaia’yı görmek istiyorsanız bu uzun parkurdaki Mavi Rota’yı izlemeniz gerekiyor. 49 parkurdan oluşan Yarımada Gezi Rotaları yürüyüş, bisiklet, zeytin, bağ ve mavi rota olarak bölümlere ayrılmış. Her rota Ege’nin farklı bir zenginliğine açılıyor. Rotalar üzerinde belirlenen kamp alanları olduğu gibi rotanızı otellerde konaklayacak şekilde de ayarlayabilirsiniz."
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.frigrotasi,
            "FRİGRO TAŞLARI ",
            "Frigro Tasi",
            "Antik dönemde Friglerin yaşadığı; bugün Ankara, Afyonkarahisar, Eskişehir ve Kütahya arasındaki bölgeyi içine alan Frig Yolu, dönemin antik kalıntılarını kapsayan rotaları kapsıyor. Diğer yürüyüş rotalarından farklı olarak tek bir hat üzerinde ilerlemeyen Frig Yolu’nun 3 farklı parkuru bulunuyor. Bu rotaların kesişme noktası ise Friglerin dini merkezi olarak kabul edilen Midas şehri.  Toplam uzunluğu 506 km olan rotalar ise şöyle sıralanıyor:\n" +
                    "\n" +
                    "Seydiler-Yazılıkaya (Afyonkarahisar) Rotası 140 km uzunluğunda bir parkura sahip.\n" +
                    "Yenice – Yazılıkaya (Kütahya) Rotası 147 km uzunluğunda bir parkura sahip.\n" +
                    "Yazılıkaya-Gordion (Eskişehir-Ankara) Rotası 219 km uzunluğunda bir parkura sahip."
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.hitityolu,
            "super güç olarak anılan yer",
            "Hitit Yolu",
            "Süper güç” olarak anılan dönemin en güçlü devletlerinden biri olan Hititler’in antik kentleri Hattuşa, Alacahöyük, Şapinuva‘nın dâhil olduğu Hitit Yolu eski kervan ve göç yollarından geçiyor. Alternatif güzergâhlarıyla birlikte 385 kilometreyi bulan yürüyüş yolu ve 406 kilometre olan bisiklet rotası doğa tutkunları için heyecan verici. Hitit Yolu’nda günübirlik ve uzun süreli parkur alternatifleri mevcut. 7-15 km uzunluğunda değişen günlük parkurlar arasında Alacahöyük-Kalehisar-Mahmudiye; Çatak-Sultanköy-Kızılhamza Göleti; İbikçam-Boğazkale-Hattuşa; İncesu-Kanyon-Kale; Karakaya-Alacahöyük ve Şapinuva-İncesu Kanyonu rotaları var. Uzun parkurlardan ise 32 km uzunluğundaki Alacahöyük-Boğazkale ve 23 km uzunluğundaki Yazılıkaya-Boğazkale Göleti-Hattuşa popüler!\n" +
                    "\n",
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.kazdaglarimilliparki,
            "kaz dağları",
            "Kazdaglari Milli Parki",
            "Oksijeni, yemyeşil ormanları, ormanlar arasına birer sığınak gibi kurulan ve özgünlüğünü koruyan köyler ile Kaz Dağları rotası doğaseverleri, şehirden uzaklaşmak isteyenleri mıknatıs gibi kendine çekiyor. Edremit’ten Sarıkız’a kadar uzanan 21 bin hektarlık alana yayılan Kaz Dağları Milli Parkı doğayı yeniden keşfedeceğiniz yürüyüş rotalarıyla dolu. Sizi zorlamayacak yürüyüş rotaları için Yayla – Ayı Deresi Parkuru, iki aşamadan oluşan Şahindere Parkurları ve orta zorluk derecesi olan Tozlu-Çeyizdere Parkuru tercih edilebilir. Zorlu parkurlara alışkınsanız Tahtakuşlar-Kapaklı-Dumanlı-Tavşanoynağı-Sarıkız Tepe rotasını mutlaka yapmalısınız."
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.likyayolu,
            "Ovacık (Hisarönü) Mevkii’nden başlayan Antalya, Gelikbayırı Köyü’nde sonra erer",
            "Likya Yolu",
            "Türkiye’nin en güzel ve en uzun yürüyüş parkurlarından biri Likya Yolu. Muhteşem bir doğa ve antik kentlerle çevrili bu rota aslında 555 km uzunluğunda. Fethiye’ye bağlı Ovacık (Hisarönü) Mevkii’nden başlayan Antalya, Gelikbayırı Köyü’nde sonra eren rota adını da Likyalılardan alıyor. Likya Birliği’nin en önemli merkezlerini kapsayan Likya Yolu üç ana kola ayrılıyor. Batı, Orta, Doğu Likya yolları toplamda 30’a yakın parkuru kapsıyor. Antik Likya’nın zenginliğini yaşatan her parkur farklı yollara çıkarıyor sizi. Fethiye, Ölüdeniz, Kelebekler Vadisi, Kabak Koyu, Kalkan, Kaş, Kekova, Demre, Patara, Olimpos Dağı, Çıralı, Göynük Kanyonu gibi harika noktalardan geçen Likya Yolu kimi zaman sahilden kimi zaman sarp yamaçlardan devam ediyor.\n" + "\n" + "But when a brutal killing takes place on their very doorstep, the Thursday Murder Club find themselves in the middle of their first live case.\n" + "\n" + "Elizabeth, Joyce, Ibrahim and Ron might be pushing eighty but they still have a few tricks up their sleeves.",
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.transyayla,
            "Trans Yayla",
            "Çamlıhemşin Yayla Rotası",
            "Karadeniz’in coğrafyasını anlatmaya kelimeler yetmez biliyoruz. Karadeniz yaylalarında kendinizi onlarca farklı rota çıkarabilirsiniz. Çamlıhemşin yaylalarını kapsayan bir yürüyüş rotasıyla ise yaklaşık 1 haftada doğallığını koruyan yemyeşil tepeleri ve köyleri keşfetmek mümkün. Günlük 3-4 saatlik yürüyüşleri kapsayan rota kimi zaman zorlayıcı olabiliyor bu yüzden daha önce yürüyüş tecrübesi olanlar ve kondisyonuna güvenenler için uygun olabileceğini belirtelim. Bu rotada manzaraları ile ünlü olan Sal Yaylası, Pokut Yaylası; az bilinen Samistal ve Hazindak Yaylaları; Trovit, Karunç, Elevit gibi keşfedilmeyi bekleyen muhteşem yaylaları görebilirsiniz. Bölgeyi iyi tanıyan rehberle gezmenizi tavsiye ederiz."
        )
        bookList.add(book7)


        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
    }

    override fun onClick(book: Book) {
        val intent=Intent(applicationContext,DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA,book.id)
        startActivity(intent)
    }


}