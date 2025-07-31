# Java Platformer Game - IUT Project

Un jeu de plateforme 2D développé en Java dans le cadre d'un projet IUT.

## 📋 Description

Ce projet est un jeu de plateforme simple développé en Java avec Swing. Le joueur contrôle un personnage qui peut se déplacer, sauter et interagir avec des plateformes et des ennemis dans un environnement 2D.

## 🎮 Fonctionnalités

- **Personnage jouable** : Contrôle d'un joueur avec animations de mouvement et d'idle
- **Système de gravité** : Physique de base avec chute et saut
- **Plateformes** : Éléments de niveau sur lesquels le joueur peut se tenir
- **Ennemis** : Entités adverses avec animations
- **Animations** : Système d'animation pour tous les sprites
- **Système de score** : Suivi des performances du joueur

## 🎯 Contrôles

- **Flèches directionnelles** : Déplacement du personnage
- **Flèche haut** : Saut
- **Flèches gauche/droite** : Mouvement horizontal

## 🛠️ Structure du projet

```
javagameIUT/
├── src/com/reverse/           # Code source principal
│   ├── Main.java             # Point d'entrée du jeu
│   ├── Player.java           # Classe du joueur
│   ├── Ennemie.java          # Classe des ennemis
│   ├── Platform.java         # Classe des plateformes
│   ├── AnimationHandler.java # Gestionnaire d'animations
│   ├── Scene.java            # Gestion de la scène
│   └── Score.java            # Système de score
├── sprite/                   # Ressources graphiques
│   ├── back2.png            # Arrière-plan du jeu
│   ├── player.png           # Sprite principal du joueur
│   ├── base.png             # Plateforme de base
│   ├── plat.png             # Plateformes du niveau
│   ├── phantomRD*.png       # Sprites des ennemis (animation droite)
│   ├── idle*.png            # Animations d'idle du joueur
│   ├── gauche*.png          # Animations de mouvement gauche
│   ├── droite*.png          # Animations de mouvement droite
│   └── jumpEffect/          # Effets visuels de saut
├── .gitignore               # Fichiers à ignorer dans Git
└── README.md                # Documentation du projet
```

## 🚀 Installation et exécution

### Prérequis
- Java JDK 8 ou supérieur
- Un IDE Java (IntelliJ IDEA, Eclipse, VS Code avec extension Java)

### Compilation et exécution

1. **Cloner le projet** :
   ```bash
   git clone https://github.com/ballandilin/javagameIUT.git
   cd javagameIUT
   ```

2. **Compiler le projet** :
   ```bash
   javac -cp . src/com/reverse/*.java
   ```

3. **Exécuter le jeu** :
   ```bash
   java -cp src com.reverse.Main
   ```

### Avec un IDE
1. Ouvrir le projet dans votre IDE
2. Configurer le classpath pour inclure le dossier `src`
3. Placer les ressources (`sprite/`) dans le classpath si nécessaire
4. Exécuter la classe `Main.java`

> **Note** : Le projet utilise un `.gitignore` configuré pour exclure les fichiers temporaires, les dossiers d'IDE et les fichiers compilés.

## 🎨 Ressources

Le projet utilise des ressources graphiques :

- **Sprites** : Images PNG pour les personnages, plateformes et objets
- **Animations** : Séquences d'images pour les mouvements et effets

## 🔧 Architecture technique

- **Framework de base** : Utilise une bibliothèque `iut` pour la gestion des jeux
- **Rendu** : Java Swing avec Graphics2D
- **Animations** : Système personnalisé via `AnimationHandler`
- **Physique** : Gravité et collisions de base
- **Input** : Gestion des événements clavier

## 📝 Classes principales

- **`Main`** : Classe principale qui initialise le jeu et gère la boucle principale
- **`Player`** : Gère le personnage joueur, ses mouvements et animations
- **`Ennemie`** : Hérite de Player pour créer des adversaires
- **`Platform`** : Définit les plateformes solides du niveau
- **`AnimationHandler`** : Système de gestion des animations sprite
- **`Scene`** : Gère l'environnement et les éléments de décor
- **`Score`** : Système de scoring du jeu

## 🎯 Améliorations possibles

- [ ] Ajout de niveaux multiples
- [ ] Système de vies et de game over
- [ ] Collectibles et power-ups
- [ ] Menu principal et pause
- [ ] Sauvegarde des scores
- [ ] Ajout d'effets sonores et musiques
- [ ] Système de cartes/niveaux depuis fichiers externes
- [ ] Optimisation des performances
- [ ] Ajout d'effets visuels

## 📄 Licence

Projet éducatif développé dans le cadre de cours à l'IUT.

## 👥 Contributeurs

- Nicolas - Développeur principal

---

*Projet réalisé dans le cadre d'un cours de programmation Java à l'IUT.*
