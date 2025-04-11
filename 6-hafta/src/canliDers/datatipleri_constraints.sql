create table personel(
id serial primary key,
	tc_kimlik_no char(11) unique not null,
	isim varchar(50) not null,
	aciklama text,
	dogum_tarihi date not null,
	ise_baslama_saati time default current_time,
	maas integer check (maas>20000),
	aktif_mi boolean default true
);

select * from personel;

insert into personel(tc_kimlik_no,isim,aciklama,dogum_tarihi,maas,aktif_mi) 
              values('12345678912','mesut','Java Dev','1900-02-02',20001,false);
			  
			  insert into personel(tc_kimlik_no,isim,aciklama,dogum_tarihi,maas,aktif_mi) 
              values('12345678915','mesut','Java Dev','1900-02-02',20,false);
