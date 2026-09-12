# TP9

# Exercice 1 - Calculatrice sécurisée (exceptions)

* Cet exercice consiste à développer une calculatrice simple permettant d’effectuer plusieurs opérations arithmétiques tout en prenant en compte les erreurs pouvant survenir.
* La classe `Calculator` contient les méthodes `add`, `sub`, `mul` et `div`, chacune permettant de réaliser une opération particulière.
* La méthode `div` vérifie le cas de division par zéro et utilise `ArithmeticException` pour signaler cette erreur.
* La classe `MainCalc` utilise les blocs `try`, `catch` et `finally` afin de tester les opérations et de gérer correctement l’exception générée.
* L’objectif principal est de comprendre comment une exception peut être **levée avec `throw`**, puis récupérée et traitée par le programme appelant.
* Cet exercice permet également de voir la différence entre laisser une erreur se propager et la capturer directement dans le programme.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Exercice 2 - Lecture d’un fichier de nombres (I/O + exceptions)

* Cet exercice porte sur la lecture d’un fichier texte contenant plusieurs nombres, avec conversion des données en valeurs entières.
* La classe `FileUtil` fournit la méthode `readNumbers(String path)` qui lit le fichier ligne par ligne et stocke les nombres valides dans une `List<Integer>`.
* La lecture est réalisée avec `BufferedReader` et `try-with-resources`, ce qui permet de fermer automatiquement le fichier après son utilisation.
* Deux types d’erreurs sont pris en compte : `IOException` lorsque la lecture du fichier rencontre un problème, et `NumberFormatException` lorsqu’une ligne ne contient pas un nombre entier valide.
* La classe `MainFile` permet de tester la méthode et d’afficher les nombres récupérés depuis le fichier.
* L’objectif est de comprendre comment gérer les exceptions lors des opérations d’entrée/sortie et comment utiliser **try-with-resources** pour éviter les problèmes liés aux ressources.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Exercice 3 - Validation d’utilisateur (exception personnalisée)

* Dans cet exercice, on met en place une validation des informations d’un utilisateur à l’aide d’une **exception personnalisée**.
* La classe `InvalidUserException` hérite de `Exception` et permet de signaler spécifiquement les erreurs liées aux données d’un utilisateur.
* La classe `User` contient les informations principales de l’utilisateur, notamment son nom et son âge, ainsi qu’une méthode `validate()` permettant de vérifier leur validité.
* La méthode `validate()` lance `InvalidUserException` lorsque le nom est vide ou lorsque l’âge de l’utilisateur est inférieur à 18 ans.
* La classe `MainUser` crée plusieurs utilisateurs, vérifie leurs informations et capture les exceptions avec un bloc `try-catch`.
* Cet exercice montre comment créer ses propres exceptions afin de rendre les erreurs plus **claires, spécifiques et faciles à gérer**.

# Exercice 4 - Journalisation des erreurs (logging)

* Cet exercice consiste à améliorer la gestion des erreurs en enregistrant les messages d’exception dans un fichier `error.log` au lieu de les afficher uniquement dans la console.
* Dans les différents blocs `catch`, les informations concernant l’erreur sont écrites dans le fichier à l’aide de `FileWriter`.
* Le fichier est ouvert en mode `append` afin de conserver les anciennes erreurs et d’ajouter les nouvelles à la suite.
* L’utilisation de `try-with-resources` permet de fermer automatiquement le `FileWriter` après l’écriture.
* Cette approche permet de conserver un **historique des erreurs**, ce qui peut être utile pour analyser les problèmes rencontrés par l’application.
* L’objectif est donc de comprendre le principe de **journalisation (logging)** et son intérêt dans une application Java.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Synthèse - Gestion des exceptions

* Ce TP permet de distinguer les **exceptions checked**, comme `IOException` et `InvalidUserException`, des **exceptions unchecked**, comme `ArithmeticException` et `NumberFormatException`.
* Les mécanismes `try`, `catch`, `finally`, `throw` et `throws` permettent de contrôler la manière dont les erreurs sont détectées, transmises et traitées.
* Les **exceptions personnalisées** permettent de représenter des situations particulières propres à l’application.
* Le `try-with-resources` facilite la gestion automatique des fichiers et évite de laisser des ressources ouvertes.
* Enfin, la journalisation des erreurs dans un fichier permet de conserver des informations utiles pour le suivi et le débogage du programme.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
