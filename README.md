Rakenduse käivitamise sammud:
1. Clone projekt arvutisse
2. Back-endi käivitamiseks tuleb käivitada klassi CgiLlpehterApplication main meetod
3. Front endi käivitamiseks tee järgmised sammud:
4. liigu terminalis sinna kausta kuhu sa selle laadisid
5. liigu projekti ehk cd cgi-llpehter
6. liigu kausta front-end ehk cd front-end
7. front endi käivitamiseks kõigepealt: npm install
8. seejärel: npm run start

Projekti lahendamiseks kulus mul umbes 30 tundi, kuna ma ei olnud varem spring bootiga projekte teinud siis vaatasin esialgu natukene seda videot: https://www.youtube.com/watch?v=9SGDpanrc8U.
Selle abil sain arusaama, kuidas asjad toimivad ja milline võiks olla lahenduskäik. Samuti sain front-endi tegemisel natukene abi sellest videost: https://www.youtube.com/watch?v=-LUA-LHXobE.
Projekt parandaksin ma järgmiselt:
1. Looks võimaluse kasutajal sisse logida ja seeläbi oleks teadlik tema soovidest. Samuti annaks võimaluse uutele kasutajatele konto loomiseks. Selle tegemiseks tegin juba andmebaasi tabeli, kuhu saab lisada kasutaja kohta käivat teavet.
   Salasõnade krüpteerimiseks kasutaksin json web tokenit.
2. Filmide toimumisaegade jaoks teeksin eraldi tabeli andmebaasi ja viitaks sellele filmide tabelis.
3. Looks siiski ka istumisplaani algoritmi, mida ma kahjuks ei jõudnud teha.
