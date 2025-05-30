# Pratik - Kütüphane Yönetim Sistemi

Bir kütüphane yönetim sistemi tasarlamanı istiyoruz. Bu kütüphane sisteminde aşağıdaki entity’ler bulunmaktadır:

- **Kitap**: Kitapların özelliklerini içeren entity/tablo.
- **Yazar**: Yazarların özelliklerini içeren entity/tablo.
- **Kategori**: Kitap kategorilerini içeren entity/tablo.
- **Yayın Evi**: Yayınevlerinin özelliklerini içeren entity/tablo.
- **Kitap Ödünç Alınması**: Kitap ödünç alma işlemlerini izleyen entity/tablo. Bu tablo, ödünç alınan kitabın kim tarafından alındığını, alınma tarihini ve teslim tarihini içerecektir.

## Entity Detayları

### Kitap (Book)
- `id` (Benzersiz kitap kimliği)
- `name` (Kitap adı)
- `publicationYear` (Yayın yılı)
- `stock` (Kütüphanedeki miktarı)

### Yazar (Author)
- `id` (Benzersiz yazar kimliği)
- `name` (Yazarın adı)
- `birthDate` (Yazarın doğum yılı)
- `country` (Yazarın ülkesi)

### Kategoriler (Category)
- `id` (Benzersiz kategori kimliği)
- `name` (Kategori adı)
- `description` (Kategori tanımı)

### Yayınevi (Publisher)
- `id` (Benzersiz kimlik)
- `name` (Yayınevi ismi)
- `establishmentYear` (Kuruluş yılı)
- `address` (Yayınevi adresi)

### Kitap Ödünç Alma (BookBorrowing)
- `id` (Benzersiz kimlik)
- `borrowerName` (Kitap ödünç alan kişi adı soyadı)
- `borrowingDate` (Kitap ödünç alma tarihi)
- `returnDate` (Kitabın teslim edildiği tarih, ilk kayıtta `null` olacak. Kitap teslim edilince tarih güncellenecek.)

## Entity İlişkileri

- **Bir kitabın bir yazarı olabilir, bir yazarın birden fazla kitabı olabilir.**  
  *(One-to-Many ilişkisi)*

- **Bir kategori birden fazla kitaba sahip olabilir, bir kitap birden fazla kategoriye ait olabilir.**
  *(Many-to-Many ilişkisi)*

- **Bir kitabın bir yayınevi olabilir, bir yayınevinin birden fazla kitabı olabilir.**  
  *(One-to-Many ilişkisi)*

- **Bir kitap birden fazla ödünç alma işlemine sahip olabilir, ancak her ödünç alma işlemi yalnızca bir kitaba ait olabilir.**  
  *(One-to-Many ilişkisi)*

## Ödev

1. Maven Java projesi açıp dependency’leri tanımlayın.
2. Yukarıda belirtilen entity (varlık) sınıflarını ve bunların arasındaki ilişkileri kodunuza yazın.
3. Gerekli anotasyonları yazın:
    - `@Entity`, `@Table`, `@Id`, `@OneToMany`, `@ManyToOne`, `@ManyToMany`
4. Gerekli `Fetch` ve `Cascade` anotasyonlarını yazın.
5. Entity'lerde temel değişkenler belirtilmiş olup, entity'ler arası ilişkilere göre sizler değişken eklemelisiniz.
6. Veri tabanı olarak PostgreSQL kullanın.
7. README dosyasına, veri tabanında oluşan her tablonun ekran görüntüsünü ekleyin.

---

Başarılar!
