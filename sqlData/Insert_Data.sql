-- şehir verisi eklendi.
INSERT INTO cities (city_name, city_code) VALUES
    ('İstanbul', 34),
    ('Ankara', 6),
    ('İzmir', 35),
    ('Bursa', 16),
    ('Antalya', 7),
    ('Adana', 1),
    ('Konya', 42),
    ('Trabzon', 61),
    ('Eskişehir', 26),
    ('Sivas', 58);


-- Hayvan Türleri tablosuna 10 tane veri ekle

INSERT INTO animal_type (species) VALUES
    ('Köpek'),
    ('Kedi'),
    ('Kuş'),
    ('Balık'),
    ('Hamster'),
    ('Kaplumbağa'),
    ('Tavşan'),
    ('Sincap'),
    ('Örümcek'),
    ('Koala');
	
-- Hayvanlar tablosuna 10 tane veri ekle
INSERT INTO animals (animal_type_id, animal_name) VALUES
    (1, 'Karabas'),
    (2, 'Prens'),
    (3, 'Cici'),
    (4, 'Nemo'),
    (5, 'Diken'),
    (6, 'Fırfır'),
    (7, 'Zıp Zıp'),
    (8, 'Vız Vız'),
    (9, 'Örüm'),
    (10, 'Sarman');


-- Insert new data into user_table
INSERT INTO user_table (username, password, first_name, last_name, address, city_code, animal_type_id) VALUES
    ('giray', 'C8Ks9#2p', 'Giray', 'Yağmur', 'İstiklal Caddesi No: 123', 34, 1),
    ('emirhan', 'P3lQs7#z', 'Emirhan', 'Giray', 'Atatürk Bulvarı No: 456', 6, 2),
    ('ceren', 'R1oWf4#x', 'Ceren', 'Yanık', 'Gazi Caddesi No: 789', 35, 3),
    ('burak', 'L2mVs5#y', 'Burak', 'Sakacı', 'Cumhuriyet Sokak No: 101', 16, 4),
    ('cansu', 'B9gPt8#u', 'Cansu', 'Erdem', 'Özgürlük Mahallesi No: 202', 7, 5),
    ('furkan', 'I5jYr2#h', 'Furkan', 'Yıldırım', 'Bağımsızlık Caddesi No: 303', 1, 6),
    ('gizem', 'Z7nKw3#k', 'Gizem', 'Öztürk', 'Demokrasi Bulvarı No: 404', 42, 7),
    ('murat', 'Q4tHu9#p', 'Murat', 'Emin', 'Adalet Sokak No: 505', 61, 8),
    ('nur', 'U6eJi1#s', 'Nur', 'Yıldız', 'Eskişehir Caddesi No: 606', 26, 9),
    ('ömer', 'X8dZa7#r', 'Ömer', 'Aksoy', 'Dicle Bulvarı No: 707', 58, 10),
	('aylin', 'M2pNx6#o', 'Aylin', 'Kaya', 'Marmara Caddesi No: 808', 34, NULL),
    ('baran', 'S9cLv3#q', 'Baran', 'Aydın', 'İnönü Sokak No: 909', 35,NULL),
    ('deniz', 'O4wTk1#v', 'Deniz', 'Yücel', 'Şehitler Bulvarı No: 1010', 16,NULL),
    ('elif', 'E7hRz5#b', 'Elif', 'Turan', 'Türkmenistan Cad. No: 1111', 58,NULL),
    ('gökhan', 'K3uQx8#a', 'Gökhan', 'Çelik', 'Kocatepe Caddesi No: 1212', 6,NULL);

-- Insert new data into advertisements
INSERT INTO advertisements (username, animal_type_id, title, description)
VALUES
    ('giray', 1, 'Köpek Sahiplenme İlanı', 'Sevimli köpeğimi sahiplenecek güzel bir aile arıyorum.'),
    ('emirhan', 2, 'Kedi Sahiplenme İlanı', 'Minik kedicik evimizi süsleyecek. İlgilenenleri bekliyorum.'),
    ('ceren', 3, 'Kuş Sahiplenme İlanı', 'Renkli ve cıvıl cıvıl kuşumu sahiplenecek kişiler arıyorum.'),
    ('burak', 4, 'Balık Sahiplenme İlanı', 'Akvaryumu süsleyecek balıklarımı sahiplenecek balık severlere ihtiyacım var.'),
    ('cansu', 5, 'Hamster Sahiplenme İlanı', 'Enerjik hamsterımı sahiplenecek aile arıyorum.'),
    ('furkan', 6, 'Kaplumbağa Sahiplenme İlanı', 'Yavaş tempolu ama sevimli kaplumbağamı sahiplenecek kişiler arıyorum.'),
    ('gizem', 7, 'Tavşan Sahiplenme İlanı', 'Oynamayı seven tavşanımı sahiplenecek aile arıyorum.'),
    ('murat', 8, 'Sincap Sahiplenme İlanı', 'Meraklı sincabımı sahiplenecek sevgi dolu birisi arıyorum.'),
    ('nur', 9, 'Örümcek Sahiplenme İlanı', 'Farklı bir evcil hayvan deneyimi için örümceğimi sahiplenecek cesur birisi arıyorum.'),
    ('ömer', 10, 'Koala Sahiplenme İlanı', 'Koala dostumu ailemize katmak isteyenleri bekliyorum.');




	
INSERT INTO applications (advertisements_id, username, apply_date)
VALUES
    (1, 'giray', CURRENT_DATE),
	(2, 'giray', CURRENT_DATE),
    (2, 'emirhan', CURRENT_DATE),
    (3, 'ceren', CURRENT_DATE),
    (4, 'burak', CURRENT_DATE),
    (5, 'cansu', CURRENT_DATE),
    (6, 'furkan', CURRENT_DATE),
    (7, 'gizem', CURRENT_DATE),
    (8, 'murat', CURRENT_DATE),
    (9, 'nur', CURRENT_DATE),
    (10, 'ömer', CURRENT_DATE);


INSERT INTO toys (animal_type_id, toy_name) VALUES
    (1, 'Top'),
    (2, 'Tüy Fare'),
    (3, 'Ayna Çubuğu'),
    (4, 'Bitki Dekorasyonu'),
    (5, 'Sıcak Taş'),
    (6, 'Jogging Çarkı'),
    (7, 'Yüzen Oyuncak'),
    (8, 'Çiçek Bal'),
    (9, 'Örümcek Kafası'),
    (10, 'Peluş Oyuncak');
	
-- cities tablosunu göster
SELECT * FROM cities;

-- animal_type tablosunu göster
SELECT * FROM animal_type;

-- animals tablosunu göster
SELECT * FROM animals;

-- user_table tablosunu göster
SELECT * FROM user_table;

-- applications tablosunu göster
SELECT * FROM applications;

-- advertisements tablosunu göster
SELECT * FROM advertisements;

-- toys tablosunu göster
SELECT * FROM toys;



