

-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 07 juin 2021 à 19:12
-- Version du serveur :  10.4.18-MariaDB
-- Version de PHP : 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `covid19modeler`
--

-- --------------------------------------------------------

--
-- Structure de la table `communique`
--

CREATE TABLE `communique` (
  `date` date NOT NULL,
  `format` varchar(10) NOT NULL,
  `nombreTest` int(11) NOT NULL,
  `nombreNouvCas` int(11) DEFAULT NULL,
  `nombreCasCont` int(11) DEFAULT NULL,
  `nombreCasCom` int(11) DEFAULT NULL,
  `nombreGueris` int(11) DEFAULT NULL,
  `nombreDeces` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `localite`
--

CREATE TABLE `localite` (
  `idloc` varchar(10) NOT NULL,
  `nomloc` varchar(50) NOT NULL,
  `niveauadm` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `localite`
--

INSERT INTO `localite` (`idloc`, `nomloc`, `niveauadm`) VALUES
('dk ', 'Dakar', '1'),
('dk_djmb', 'Cité Djily Mbaye', '3'),
('dk_l6', 'Liberté 6', '3'),
('dk_oua', 'Ouakam', '3'),
('kf', 'Kaffrine', '1'),
('kf_bir', 'Birkilane', '2'),
('mt', 'Matam', '1'),
('mt_mt', 'Matam', '2'),
('zg', 'Ziguinchor', '1'),
('zg_zg', 'Ziguinchor', '2');

-- --------------------------------------------------------

--
-- Structure de la table `localitesconcernes`
--

CREATE TABLE `localitesconcernes` (
  `idloc` varchar(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `communique`
--
ALTER TABLE `communique`
  ADD PRIMARY KEY (`date`);

--
-- Index pour la table `localite`
--
ALTER TABLE `localite`
  ADD PRIMARY KEY (`idloc`);

--
-- Index pour la table `localitesconcernes`
--
ALTER TABLE `localitesconcernes`
  ADD PRIMARY KEY (`idloc`,`date`),
  ADD KEY `date` (`date`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `localitesconcernes`
--
ALTER TABLE `localitesconcernes`
  ADD CONSTRAINT `localitesconcernes_ibfk_1` FOREIGN KEY (`idloc`) REFERENCES `localite` (`idloc`),
  ADD CONSTRAINT `localitesconcernes_ibfk_2` FOREIGN KEY (`date`) REFERENCES `communique` (`date`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
