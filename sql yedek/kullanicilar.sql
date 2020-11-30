-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 14 Haz 2020, 22:10:48
-- Sunucu sürümü: 10.4.11-MariaDB
-- PHP Sürümü: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `eee`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `id` int(11) NOT NULL,
  `kadi` varchar(40) COLLATE utf8_turkish_ci NOT NULL,
  `adi` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `eposta` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `telefonno` int(10) NOT NULL,
  `sifre` varchar(40) COLLATE utf8_turkish_ci NOT NULL,
  `dgmtarihi` varchar(30) COLLATE utf8_turkish_ci NOT NULL,
  `il` varchar(20) COLLATE utf8_turkish_ci DEFAULT NULL,
  `ilce` varchar(20) COLLATE utf8_turkish_ci DEFAULT NULL,
  `adres` varchar(500) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`id`, `kadi`, `adi`, `soyadi`, `eposta`, `telefonno`, `sifre`, `dgmtarihi`, `il`, `ilce`, `adres`) VALUES
(15, 'hestu12', 'Cihat', 'Karaboğa', 'hestu12@gmail.com', 445, 'sanane', '29.04.2020', 'Elazığ', 'Ağın', 'saas'),
(16, 'hestu', 'Cihat', 'Karaboğa', 'hestu12@hotmail.com', 545545555, 'asd123dsa123', '01.06.2020', 'Elazığ', 'Ağın', 'sanane nasnansa nsansn');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
