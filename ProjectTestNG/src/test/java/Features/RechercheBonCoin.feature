Feature: BonCoin

  Scenario Outline: Recherche BonCoin
    Given je choisie "<departement>"
    When je saisie "<maRecherche>" dans le filtre
    Then je clique sur le bouton Rechercher

    Examples: 
      | departement | maRecherche |
      | Centre      | Voiture     |
      | Centre      | Voiture     |

