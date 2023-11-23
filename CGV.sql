create database DA1_RapPhim
use DA1_RapPhim

create table nhanvien
(email varchar(50) primary key, 
matkhau varchar(30),
hoten nvarchar(30),
soDT varchar(13) unique,
ngaysinh date,
gioitinh bit,
diachi nvarchar(50),
vaitro bit,
hinh varchar(10),
trangthai bit);

create table phim
(maphim char(10) primary key,
tenphim nvarchar(50),
thoiluong float,
theloai nvarchar(20),
namsx int,
nuocsx nvarchar(10),
noidung nvarchar(255),
poster varchar(10),
dienvien nvarchar(100),
trangthai bit);

create table phong
(maphong char(5) primary key,
soluongghe int, 
tinhtrang nvarchar(20),
trangthai bit);

create table suatchieu
(masuatchieu int identity primary key,
maphim char(10),
nguoitao varchar(50),
maphong char(5),
batdau time,
ketthuc time,
ngaychieu date,
foreign key (maphim) references phim(maphim) on delete no action on update cascade,
foreign key (nguoitao) references nhanvien(email) on delete no action on update cascade,
foreign key (maphong) references phong(maphong) on delete no action on update cascade);

create table khachhang
(email varchar(50) primary key,
matkhau varchar(30),
tenkh nvarchar(30),
sodt varchar(13) unique,
diachi nvarchar(50),
thongtinthanhtoan varchar(50),
trangthai bit);

create table ve
(mave int,
masuatchieu int,
maghe varchar(5),
thanhtien float,
khachhang varchar(50),
nhanvien varchar(50),
foreign key (masuatchieu) references suatchieu(masuatchieu) on delete no action on update cascade,
foreign key (khachhang) references khachhang(email) on delete no action on update cascade,
foreign key (nhanvien) references nhanvien(email) on delete no action on update no action,
primary key (masuatchieu, maghe));


insert into khachhang values
('trunghieu12a326@gmail.com', '111111', N'Nguyễn Trung Hiếu', '0935186303', N'Long An', 'SCB: 070119736305',1 ),
('lieuphat1607@gmail.com', '111112', N'Liêu Vinh Phát', '0989321379', N'Sài Gòn', 'VCB:123456789',1 ),
('ngothiducnhu30052003@gmail.com', '111113', N'Ngô Thị Đức Nhu', '0123456789', N'Tiền Giang', 'VCB:1234789456',1 ),
('teonguyen123@gmail.com', '111114', N'Nguyễn Văn Tèo', '0935186304', N'Đà Lạt', 'VCB:123456789',1 ),
('lantran456@gmail.com', '111115', N'Trần Thị Kim Lan', '0935186305', N'Long An', 'VCB:123456789',1 ),
('hungdang789@gmail.com', '111116', N'Đặng Thanh Hùng', '0935186306', N'Sài Gòn', 'VCB:123456789',1 ),
('tungthanh100@gmail.com', '111117', N'Trần Thanh Tùng', '0935186307', N'Sài Gòn', 'VCB:123456789',1 ),
('jack5cu@gmail.com', '111118', N'Trịnh Trần Phương Tuấn', '0935186308', N'Sài Gòn', 'VCB:123456789',1 ),
('voibandon101@gmail.com', '1111119', N'Trần Anh Tú', '0935186309', N'Sài Gòn', 'VCB:123456789',1 ),
('ladymay102@gmail.com', '111120', N'Myra Trần', '0935186310', N'Sài Gòn', 'VCB:123456789',1 ),
('hungdam103@gmail.com', '111121', N'Đàm Vĩnh Hưng', '0935186311', N'Sài Gòn', 'VCB:123456789',1 ),
('giangvo201@gmail.com', '111122', N'Võ Vũ Trường Giang', '0935186312', N'Quảng Nam', 'VCB:123456789',1 ),
('thanhhuynh202@gmail.com', '111123', N'Huỳnh Trấn Thành', '0935186313', N'Sài Gòn', 'VCB:123456789',1 ),
('hoailinh14toi203@gmail.com', '111124', N'Võ Hoài Linh', '0935186314', N'Sài Gòn', 'VCB:123456789',1 ),
('spiderman301@gmail.com', '111125', N'Tôm Hà Land', '0935186315', N'Sài Gòn', 'VCB:123456789',1 ),
('ironman302@gmail.com', '111126', N'Tô Ny Sì Tách', '0935186316', N'Sài Gòn', 'VCB:123456789',1 ),
('captainamerica303@gmail.com', '111127', N'Ju Sai Mon', '0935186317', N'Sài Gòn', 'VCB:123456789',1 ),
('thehulk304@gmail.com', '111128', N' Jáck  Kirby', '0935186318', N'Sài Gòn', 'VCB:123456789',1 ),
('thethor305@gmail.com', '111129', N'Chris Hemsworth', '0935186319', N'Sài Gòn', 'VCB:123456789',1 ),
('thanos306@gmail.com', '111130', N'Josh Brolin', '0935186320', N'Sài Gòn', 'VCB:123456789',1 );

insert into NhanVien values
('hieuntps27619@fpt.edu.vn', '111131', N'Nguyễn Trung Hiếu', '0935186303','2003-07-21',1, N'Long An', 1,'nv1.png',1 ),
('phatlvps27456@fpt.edu.vn', '111132', N'Liêu Vinh Phát', '0989321379', '2003-07-21',1, N'Long An', 1,'nv1.png',1  ),
('nhuntdps27430@fpt.edu.vn', '111133', N'Ngô Thị Đức Nhu', '0123456789', '2003-07-21',1, N'Long An',1,'nv1.png',1  ),
('hocntps27837@fpt.edu.vn', '111134', N'Nguyễn Tiến Học', '0935186321', '2003-07-21',1, N'Long An',1,'nv1.png',1  ),
('hieutruong001@fpt.edu.vn', '111135', N'Thầy Hiệu Trưởng', '0935186322', '2003-07-21',1, N'Long An',1,'nv1.png',1 ),
('hieupho002@fpt.edu.vn', '111136', N'Thầy Hiệu Phó', '0935186323', '2003-07-21',1, N'Long An',1,'nv1.png',1 ),
('truongcntt003@fpt.edu.vn', '111137', N'Trưởng Bộ Môn CNTT','0935186324', '2003-07-21',1, N'Long An',1,'nv1.png',1 ),
('truongmkts004@fpt.edu.vn', '111138', N'Trưởng Bộ Môn MaketingandSales', '0935186325', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('truongvovinam005@fpt.edu.vn', '111139', N'Trưởng Bộ Môn Vovinam', '0935186326', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('truongdlks006@fpt.edu.vn', '111140', N'Trưởng Bộ Môn DL KS', '0935186327', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('truongtkdo007@fpt.edu.vn', '111141', N'Trưởng Bộ Môn TKDH', '0935186328', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('luubo100@fpt.edu.vn', '111142', N'Lưu Bá Ôn', '0935186329', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('chungnn101@fpt.edu.vn', '111143', N'Chung Nguyên Chương',  '0935186330','2003-07-21',1, N'Long An',1,'nv1.png',1),
('truongp200@fpt.edu.vn', '111144', N'Trương Phi', '0935186331', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('vuqt201@fpt.edu.vn', '111145', N'Trương Quan Vũ', '0935186332', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('trieuvan202@fpt.edu.vn', '111146', N'Triệu Tử Long', '0935186333', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('bolu300@fpt.edu.vn', '111147', N'Lữ Bố', '0935186334', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('thuyendieu301@fpt.edu.vn', '111148', N'Điêu Thuyền', '0935186335', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('tracdong302@fpt.edu.vn', '111149', N'Đổng Trác', '0935186336', '2003-07-21',1, N'Long An',1,'nv1.png',1),
('thieuvien303@fpt.edu.vn', '111150', N'Viên Thiệu', '0935186337', '2003-07-21',1, N'Long An',1,'nv1.png',1);

insert into Phim values
('PHIM001', N'Nắng',120.0,N'Tình cảm',2020,N'Việt Nam',null,'phim01.png',N'Vân Trang,Bảo Ngọc',1),
('PHIM002', N'Mưa',120.0,N'Tình cảm',2021,N'Việt Nam',null,'phim02.png',N'Lê Trang,Tuấn Kiệt',1),
('PHIM003', N'Ditto',120.0,N'Hài kịch',2022,N'Hàn Quốc',N'Ditto kể về câu chuyện của hai sinh viên trường Đại học Hàn Quốc','phim03.png',N'Yeo Jin Goo, Cho Yi Hyun',1),
('PHIM004', N'Nghề siêu khó',120.0,N'Hài hành động',2022,N'Hàn Quốc',N'Bộ phim hài hành động xoay quanh nhóm điều tra do đội trưởng Ko lãnh đạo đang đứng trước nguy cơ giải tán nhờ chuỗi thành tích thất bại đáng nể','phim04.png',N'Ryu Seung-yong,..',1),
('PHIM005', N'Thám Tử Phố Tàu',120.0,N'Hành động',2022,N'TQ',null,'phim05.png',N'Vương Bảo Cường, Lưu Hạo Nhiên',1),
('PHIM006', N'Đất rừng phươnng nam',120.0,N'Lịch sử',2023,N'Việt Nam',null,'phim06.png',N'Trấn Thành, Tuấn Nguyễn',1),
('PHIM007', N'Người vợ',120.0,N'Drama',2020,N'Việt Nam',null,'phim07.png',N'Ngọc Hân, Hạo Nam',1),
('PHIM008', N'Kẻ may mắn',120.0,N'Hài hành động',2023,N'Hàn Quốc',null,'phim08.png',N'Song Hy Kyo, Hyn Bin',1),
('PHIM009', N'Lật mặt',120.0,N'Hành động',2022,N'Việt Nam',null,'phim09.png',N'Lý Hải,Huy Khánh',1),
('PHIM010', N'Trúng số',120.0,N'Drama',2021,N'Việt Nam',null,'phim10.png',N'Thúy Ngân, Minh Tuấn',1)

insert into Phong values 
('PH001',60,N'Còn ghế',1),
('PH002',60,N'Còn ghế',1),
('PH003',60,N'Còn ghế',1),
('PH004',60,N'Còn ghế',1),
('PH005',60,N'Còn ghế',1),
('PH006',60,N'Còn ghế',1),
('PH007',60,N'Còn ghế',1),
('PH008',60,N'Còn ghế',1),
('PH009',60,N'Còn ghế',1),
('PH010',60,N'Còn ghế',1),
('PH011',60,N'Còn ghế',1),
('PH012',60,N'Còn ghế',1),
('PH013',60,N'Còn ghế',1),
('PH014',60,N'Còn ghế',1),
('PH015',60,N'Còn ghế',1);

insert into SuatChieu values
('PHIM007','hieuntps27619@fpt.edu.vn','PH003','8:00','10:00','2023-01-14'),
('PHIM007','hieuntps27619@fpt.edu.vn','PH003','10:00','12:00','2023-01-14'),
('PHIM007','hieuntps27619@fpt.edu.vn','PH003','13:00','15:00','2023-01-14'),
('PHIM007','hieuntps27619@fpt.edu.vn','PH003','15:00','17:00','2023-01-14'),
('PHIM007','hieuntps27619@fpt.edu.vn','PH003','17:00','19:00','2023-01-14'),
('PHIM001','hieuntps27619@fpt.edu.vn','PH002','8:00','10:00','2023-01-14'),
('PHIM001','hieuntps27619@fpt.edu.vn','PH002','10:00','12:00','2023-01-14'),
('PHIM001','hieuntps27619@fpt.edu.vn','PH002','13:00','15:00','2023-01-14'),
('PHIM001','hieuntps27619@fpt.edu.vn','PH002','15:00','17:00','2023-01-14'),
('PHIM001','hieuntps27619@fpt.edu.vn','PH002','17:00','19:00','2023-01-14'),
('PHIM003','phatlvps27456@fpt.edu.vn','PH001','8:00','10:00','2023-05-24'),
('PHIM003','phatlvps27456@fpt.edu.vn','PH001','10:00','12:00','2023-05-24'),
('PHIM003','phatlvps27456@fpt.edu.vn','PH001','13:00','15:00','2023-05-24'),
('PHIM003','phatlvps27456@fpt.edu.vn','PH001','15:00','17:00','2023-05-24'),
('PHIM003','phatlvps27456@fpt.edu.vn','PH001','17:00','19:00','2023-05-24'),
('PHIM006','nhuntdps27430@fpt.edu.vn','PH004','8:00','10:00','2023-07-12'),
('PHIM006','nhuntdps27430@fpt.edu.vn','PH004','10:00','12:00','2023-07-12'),
('PHIM006','nhuntdps27430@fpt.edu.vn','PH004','13:00','15:00','2023-07-12'),
('PHIM006','nhuntdps27430@fpt.edu.vn','PH004','15:00','17:00','2023-07-12'),
('PHIM006','nhuntdps27430@fpt.edu.vn','PH004','17:00','19:00','2023-07-12');

insert into Ve values 
(1,2,'A01',65.000,'hoailinh14toi203@gmail.com','hieuntps27619@fpt.edu.vn'),
(2,2,'A06',65.000,'teonguyen123@gmail.com','hieuntps27619@fpt.edu.vn'),
(3,2,'A07',65.000,'ironman302@gmail.com','hieuntps27619@fpt.edu.vn'),
(4,2,'D01',65.000,'thehulk304@gmail.com','hieuntps27619@fpt.edu.vn'),
(5,2,'D02',65.000,'lantran456@gmail.com','hieuntps27619@fpt.edu.vn'),
(6,3,'D01',65.000,'tungthanh100@gmail.com','hieuntps27619@fpt.edu.vn'),
(7,3,'F06',65.000,'ngothiducnhu30052003@gmail.com','hieuntps27619@fpt.edu.vn'),
(8,3,'F07',65.000,'lieuphat1607@gmail.com','hieuntps27619@fpt.edu.vn'),
(9,4,'C01',65.000,'thehulk304@gmail.com','hieuntps27619@fpt.edu.vn'),
(10,5,'C02',65.000,'thanos306@gmail.com','hieuntps27619@fpt.edu.vn'),
(11,15,'A01',65.000,'hoailinh14toi203@gmail.com','phatlvps27456@fpt.edu.vn'),
(12,15,'A06',65.000,'teonguyen123@gmail.com','phatlvps27456@fpt.edu.vn'),
(13,15,'A07',65.000,'ironman302@gmail.com','phatlvps27456@fpt.edu.vn'),
(14,15,'D01',65.000,'thehulk304@gmail.com','phatlvps27456@fpt.edu.vn'),
(15,16,'D02',65.000,'lantran456@gmail.com','nhuntdps27430@fpt.edu.vn'),
(16,16,'D01',65.000,'tungthanh100@gmail.com','nhuntdps27430@fpt.edu.vn');