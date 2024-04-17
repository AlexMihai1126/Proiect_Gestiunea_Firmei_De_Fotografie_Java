#Gestiunea unei firme de fotografie - Proiect "Programare Avansata pe Obiecte" (PAO)

Acest proiect implementeaza un sistem simplu de gestiune al unei firme de fotografie evenimente in limbajul Java

Clasele de baza sunt: Persoana, Echipament, Eveniment

Clasele derivate sunt: PersFizica, PersJuridica (derivate din Persoana), Fotograf (derivat din PersFizica), Camera, Obiectiv (derivate din Echipament).

Am utilizat si un Enum pentru a simplifica stocarea modelelor de camere (care sunt standard).

Serviciile sistemului sunt impartite in managere (clase Singleton): EventManager, PeopleManager, CameraManager, ObiectiveManager.

EventManager poate adauga, modifica sau sterge evenimente, poate afisa evenimentele pentru ziua de astazi, poate returna toate evenimentele din lista.

PeopleManager poate adauga, modifica sau sterge persoane, cauta persoane dupa tip (PersFizica, PersJuridica, Fotograf), poate returna toate persoanele din lista.

CameraManager poate adauga, modifica sau sterge camere, poate returna toate camerele din lista.

ObiectiveManager poate adauga, modifica sau sterge obiective, poate returna toate obiectivele din lista.

Se pot adauga, sterge, modifica evenimente, persoane fizice, persoane juridice, fotografi, camere, obiective.
