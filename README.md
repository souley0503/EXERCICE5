Ce projet implémente la logique de déplacement pour différentes pièces d'un jeu d'échecs en utilisant les principes 
de la programmation orientée objet (POO), notamment l'héritage et le polymorphisme.

1. Structure de Base
Classe Position
La classe Position est une classe utilitaire simple qui représente une coordonnée sur l'échiquier.

Attributs : row (ligne) et column (colonne) en accès public pour faciliter la manipulation.

Rôle : Elle sert d'argument pour définir la destination d'un mouvement.

Classe Piece (Classe Mère)
Il s'agit d'une classe abstraite qui sert de base à toutes les pièces.

Attributs : Elle stocke la position actuelle de la pièce (row, column).

Méthode isValidMove : Elle définit la validation de base commune à toutes les pièces : 
une pièce ne peut se déplacer que dans les limites du plateau (de 1 à 8).

Simplification : La méthode retourne directement le résultat de la comparaison logique.

2. Implémentation des Pièces (Classes Filles)
Chaque pièce hérite de Piece et redéfinit (override) la méthode isValidMove pour implémenter sa propre règle de déplacement.

La Tour (Rock)
La Tour se déplace de manière rectiligne.

Logique : Le mouvement est valide si la colonne d'arrivée est identique à la colonne 
actuelle OU si la ligne d'arrivée est identique à la ligne actuelle.

Code : newPosition.column == this.column || newPosition.row == this.row

Le Fou (Bishop)
Le Fou se déplace en diagonale.

Logique : Le mouvement est valide si la distance parcourue en colonnes est exactement
égale à la distance parcourue en lignes (en valeur absolue).

Code : Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)

La Reine (Queen)
La Reine est la pièce la plus puissante car elle combine les mouvements de la Tour et du Fou.

Logique : Elle vérifie si le mouvement est soit rectiligne, soit diagonal.

Optimisation : Elle utilise des variables intermédiaires (differenceColum, differenceRow) 
pour calculer les "deltas" et rendre le code plus lisible.
