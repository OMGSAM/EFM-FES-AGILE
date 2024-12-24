1. Créez le dossier "depot_local", entrez dans ce dossier et initialisez-le comme repository GIT.
mkdir depot_local  # Créer le dossier
cd depot_local  # Entrer dans le dossier
git init  # Initialiser le repository Git




2. Liez le repository "depot_local" à un repository distant.
git remote add origin <URL_DU_REPOSITORY>  # Ajouter l'URL du repository distant







3. Ajoutez trois fichiers et stagez-les, puis commitez.
touch produit.html style.css script.js  # Créer les fichiers vides
git add produit.html style.css script.js  # Ajouter les fichiers au stage
git commit -m "Ajout des fichiers produit.html, style.css et script.js"  # Commit





4. Créez une branche "Gestion produits" et basculez dessus. 
git branch "Gestion produits"  # Créer la branche
git checkout "Gestion produits"  # Basculez sur la branche





5. Modifiez les fichiers, commitez, revenez à la branche master et fusionnez.
git add .  # Ajouter toutes les modifications
git commit -m "Modification des fichiers dans Gestion produits"  # Commit
git checkout master  # Revenir à la branche master
git merge "Gestion produits"  # Fusionner avec master






6. Affichez le log sous forme d’une seule ligne et poussez votre travail.
git log --oneline  # Afficher le log en une seule ligne
git remote show origin  # Afficher les informations du dépôt distant
git push origin master  # Pousser le travail vers le repository distant





7. Supprimez l'historique des commits et les modifications des fichiers. 
git reset --hard HEAD~1  # Annule le dernier commit et les modifications locales
git rebase -i --root  # Supprime tous les commits depuis le début (opération destructive)
